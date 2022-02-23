package com.ciandt.springTest.controller;

import com.ciandt.springTest.dto.TopicoDto;
import com.ciandt.springTest.model.Curso;
import com.ciandt.springTest.model.Topico;
import com.ciandt.springTest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }
}
