package com.ciandt.springTest.controller;

import com.ciandt.springTest.controller.form.TopicoForm;
import com.ciandt.springTest.dto.DetalhesTopicoDto;
import com.ciandt.springTest.dto.TopicoDto;
import com.ciandt.springTest.model.Topico;
import com.ciandt.springTest.repository.CursoRepository;
import com.ciandt.springTest.repository.TopicoRepository;
import com.ciandt.springTest.controller.form.AtualizacaoTopicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

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
    @Transactional
    public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm form, UriComponentsBuilder uriBuilder) {
        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);

        URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new TopicoDto(topico));
    }

    // GET deve ser usado no projeto 25-02-22
    @GetMapping({"/{id}"})
    public ResponseEntity<DetalhesTopicoDto> detalhar(@PathVariable Long id) {
        Optional<Topico> topico = topicoRepository.findById(id);
        if (topico.isPresent()) {
            return ResponseEntity.ok(new DetalhesTopicoDto(topico.get()));

        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/{id")
    @Transactional
    public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @Valid AtualizacaoTopicoForm form) {
        Optional<Topico> optional = topicoRepository.findById(id);
        if (optional.isPresent()) {
            Topico topico = form.atualizar(id, topicoRepository);
            return ResponseEntity.ok(new TopicoDto(new Topico()));

        }
        return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicoDto> remove(@PathVariable Long id) {
        Optional<Topico> optional = topicoRepository.findById(id);
        if (optional.isPresent()) {
            topicoRepository.deleteById(id);
            return ResponseEntity.ok().build();

        }
        return ResponseEntity.notFound().build();

    }

}










