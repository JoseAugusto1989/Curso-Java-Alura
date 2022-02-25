package com.ciandt.springTest.controller;

import com.ciandt.springTest.controller.form.TopicoForm;
import com.ciandt.springTest.dto.TopicoDto;
import com.ciandt.springTest.model.Curso;
import com.ciandt.springTest.model.Topico;
import com.ciandt.springTest.repository.CursoRepository;
import com.ciandt.springTest.repository.TopicoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/topicos")
public class TopicosController {

    @Autowired(required=true)
    private TopicoRepository topicoRepository;

    @Autowired(required=true)
    private CursoRepository cursoRepository;

    @GetMapping
    public List<TopicoDto> lista(String nomeCurso) {
        if (nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDto.converter(topicos);
        } else {
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
            return TopicoDto.converter(topicos);
        }

    }

    @PostMapping
    public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicoDto(topico));
    }
}
