package com.prova1.joseAugusto.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardError {

    private String message;
    private Integer status;
    private Date date;

}
