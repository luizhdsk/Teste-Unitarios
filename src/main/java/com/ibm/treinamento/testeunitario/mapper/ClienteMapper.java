package com.ibm.treinamento.testeunitario.mapper;

import com.ibm.treinamento.testeunitario.dominio.ClienteDestino;
import com.ibm.treinamento.testeunitario.dominio.ClientOrigem;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteDestino toMap(ClientOrigem cliente){
        return new ClienteDestino(cliente.getNome(), cliente.getCpf(), cliente.getIdade(), cliente.getSexo(), cliente.getTelefone(), cliente.getEndereco());
    }
}
