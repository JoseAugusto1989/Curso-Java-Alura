package com.ciandt.springbootessentials.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBoby {

    @NotEmpty(message = "The anime name is cannot be empty")
    private String name;
}
