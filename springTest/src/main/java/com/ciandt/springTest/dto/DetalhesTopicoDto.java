package com.ciandt.springTest.dto;

import com.ciandt.springTest.model.StatusTopico;
import com.ciandt.springTest.model.Topico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DetalhesTopicoDto {

    private Long id;
    private String titulo;
    private String msg;
    private LocalDateTime localCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;


    public DetalhesTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.msg = topico.getMensagem();
        this.localCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).
                collect(Collectors.toList()));
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public LocalDateTime getLocalCriacao() {
        return localCriacao;
    }
    public void setLocalCriacao(LocalDateTime localCriacao) {
        this.localCriacao = localCriacao;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public StatusTopico getStatus() {
        return status;
    }
    public void setStatus(StatusTopico status) {
        this.status = status;
    }
    public List<RespostaDto> getRespostas() {
        return respostas;
    }
    public void setRespostas(List<RespostaDto> respostas) {
        this.respostas = respostas;
    }
}
