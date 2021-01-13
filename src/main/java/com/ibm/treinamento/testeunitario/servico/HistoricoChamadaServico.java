package com.ibm.treinamento.testeunitario.servico;

import com.ibm.treinamento.testeunitario.dominio.ClienteDestino;
import com.ibm.treinamento.testeunitario.dominio.HistoricoChamada;
import org.springframework.stereotype.Service;

@Service
public class HistoricoChamadaServico {

    public HistoricoChamada buscaHistoricoCliente(ClienteDestino clientDestino){
        return new HistoricoChamada(clientDestino, null);
    }
}
