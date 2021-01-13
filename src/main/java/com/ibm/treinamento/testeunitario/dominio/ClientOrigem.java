package com.ibm.treinamento.testeunitario.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientOrigem {
    private String nome;
    private String cpf;
    private Integer idade;
    private String sexo;
    private String telefone;
    private String endereco;
}
