package com.ibm.treinamento.testeunitario.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chamada {
    private String numeroOrigem;
    private String numeroDestino;
    private LocalDate dataChamada;
    private LocalTime horaChamada;
}
