package com.ciandt.test.domain;

import lombok.Data;

import java.util.Date;

@Data
public class MoviesSeries {

    private String nome;
    private String diretor;
    private double nota1;
    private double notaIMDB;
    private String atoresPrincipais;
    private String tipo;
    private String obs;
    private int ano;
    private String fabricante;
    private String ondeEncontrar;


    public MoviesSeries() {

    }

    public MoviesSeries(String nome, String diretor, double nota1, double notaIMDB, String atoresPrincipais,
                        String tipo, String obs, int ano, String fabricante, String ondeEncontrar) {
        this.nome = nome;
        this.diretor = diretor;
        this.nota1 = nota1;
        this.notaIMDB = notaIMDB;
        this.atoresPrincipais = atoresPrincipais;
        this.tipo = tipo;
        this.obs = obs;
        this.ano = ano;
        this.fabricante = fabricante;
        this.ondeEncontrar = ondeEncontrar;
    }
}
