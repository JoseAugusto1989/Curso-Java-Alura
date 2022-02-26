package com.ciandt.springTest.controller.form;

import com.ciandt.springTest.model.Topico;
import com.ciandt.springTest.repository.TopicoRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class AtualizacaoTopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String titulo;

    @NotNull @NotEmpty @Length(min = 5)
    private String msg;

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

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getById(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.msg);
        return topico;
    }
}
