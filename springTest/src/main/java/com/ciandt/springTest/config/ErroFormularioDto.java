package com.ciandt.springTest.config;

public class ErroFormularioDto {

    private String campo;
    private String erro;



    public ErroFormularioDto() {

    }

    public ErroFormularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }

    public String getCampo() {
        return campo;
    }
    public String getErro() {
        return erro;
    }
}
