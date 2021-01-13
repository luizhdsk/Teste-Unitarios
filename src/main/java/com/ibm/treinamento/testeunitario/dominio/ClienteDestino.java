package com.ibm.treinamento.testeunitario.dominio;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClienteDestino {
    private String nome;
    private String cpf;
    private Integer idade;
    private String sexo;
    private String telefone;
    private String endereco;
}
