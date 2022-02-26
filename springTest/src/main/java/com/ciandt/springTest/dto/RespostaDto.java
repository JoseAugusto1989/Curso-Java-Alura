package com.ciandt.springTest.dto;

import com.ciandt.springTest.model.Resposta;

import java.time.LocalDateTime;

public class RespostaDto {

    private Long id;
    private String msg;
    private LocalDateTime dataCriacao;
    private String nomeAutor;


    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.msg = resposta.getMensagem();
        this.nomeAutor = resposta.getAutor().getNome();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
