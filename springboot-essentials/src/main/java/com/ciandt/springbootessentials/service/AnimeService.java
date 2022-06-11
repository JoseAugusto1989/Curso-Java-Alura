package com.ciandt.springbootessentials.service;

import com.ciandt.springbootessentials.domain.Anime;
import com.ciandt.springbootessentials.exception.BadRequestException;
import com.ciandt.springbootessentials.mapper.AnimeMapper;
import com.ciandt.springbootessentials.repository.AnimeRepository;
import com.ciandt.springbootessentials.requests.AnimePostRequestBoby;
import com.ciandt.springbootessentials.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {
    private final AnimeRepository animeRepository;

//        animes = new ArrayList<>(
//                List.of(new Anime(1L,"DBZ"),
//                        new Anime(2L,"Berserk"),
//                        new Anime(3L,"Naruto"),
//                        new Anime(4L,"Yuyu Hakusho"),
//                        new Anime(5L, "CDZ"),
//                        new Anime(6L, "Yu-gi-oh"),
//                        new Anime(7L, "Bleach"),
//                        new Anime(8L, "Death Note"),
//                        new Anime(9L, "One-Punch Man"),
//                        new Anime(10L, "Attack on Titan"),
//                        new Anime(11L, "Demon Slayer"),
//                        new Anime(12L, "Samurai X"),
//                        new Anime(13L, "One Piece"),
//                        new Anime(14L, "Hunter x Hunter"))
//        );

    public Page<Anime> listAll(Pageable pageable) {
        return animeRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository
                .findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not found"));
    }
    @Transactional
    public Anime save(AnimePostRequestBoby animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());
        animeRepository.save(anime);
    }
}
