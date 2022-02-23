package com.ciandt.springTest.dto;

import com.ciandt.springTest.model.Topico;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TopicoDto {

    private Long id;
    private String titulo;
    private String msg;
    private LocalDateTime localCriacao;


    public TopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.msg = topico.getMensagem();
        this.localCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
    }

}
