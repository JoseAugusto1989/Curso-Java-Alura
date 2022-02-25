package com.ciandt.springTest.controller.form;

import com.ciandt.springTest.model.Curso;
import com.ciandt.springTest.model.Topico;
import com.ciandt.springTest.repository.CursoRepository;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {

    @NotNull @NotEmpty @Length(max = 30)
    private String titulo;

    @NotNull @NotEmpty @Length(min = 20)
    private String msg;

    @NotNull @NotEmpty @Length(max = 30)
    private String nomeCurso;

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
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, msg, curso);
    }
}
