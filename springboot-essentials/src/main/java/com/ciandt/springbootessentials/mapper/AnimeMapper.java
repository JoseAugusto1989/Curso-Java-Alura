package com.ciandt.springbootessentials.mapper;

import com.ciandt.springbootessentials.domain.Anime;
import com.ciandt.springbootessentials.requests.AnimePostRequestBoby;
import com.ciandt.springbootessentials.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBoby animePostRequestBoby);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);

}
