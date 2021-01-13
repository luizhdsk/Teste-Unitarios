package com.ibm.treinamento.testeunitario.servico;

import com.ibm.treinamento.testeunitario.dominio.ClienteDestino;
import com.ibm.treinamento.testeunitario.dominio.ClientOrigem;
import com.ibm.treinamento.testeunitario.dominio.HistoricoChamada;
import com.ibm.treinamento.testeunitario.exception.ClientException;
import com.ibm.treinamento.testeunitario.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteMapper mapper;
    private HistoricoChamadaServico historicoChamadaServico;

    @Autowired
    public ClienteService(ClienteMapper mapper, HistoricoChamadaServico historicoChamadaServico) {
        this.mapper = mapper;
        this.historicoChamadaServico = historicoChamadaServico;
    }

    public ClienteDestino buscaCliente(ClientOrigem clienteOrigem) throws ClientException {
        if (clienteOrigem.getCpf() == null || clienteOrigem.getCpf().isEmpty())
            throw new ClientException("CPF inválido!");
        else if (clienteOrigem.getNome() == null || clienteOrigem.getNome().isEmpty())
            throw new ClientException("Nome inválido!");
        else if (clienteOrigem.getIdade() == null || clienteOrigem.getIdade() <= 18)
            throw new ClientException("Idade inválida!");
        else if (clienteOrigem.getEndereco() == null || clienteOrigem.getEndereco().isEmpty())
            throw new ClientException("Endereço inválido!");
        else if (clienteOrigem.getTelefone() == null || clienteOrigem.getTelefone().isEmpty())
            throw new ClientException("telefone inválido!");
        else
            return mapper.toMap(clienteOrigem);
    }

    public HistoricoChamada buscaHistoricoChamadas(ClienteDestino clienteDestino){
        return historicoChamadaServico.buscaHistoricoCliente(clienteDestino);
    }
}
