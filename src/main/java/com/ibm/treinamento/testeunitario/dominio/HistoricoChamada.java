package com.ibm.treinamento.testeunitario.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoChamada {
    private ClienteDestino clienteDestino;
    private List<Chamada> chamadas;

}
