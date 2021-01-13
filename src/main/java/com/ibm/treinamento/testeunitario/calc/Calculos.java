package com.ibm.treinamento.testeunitario.calc;

import java.util.List;

public class Calculos {

    public Double fatorial(Double valor){
        if (valor == 0D)
            return 1D;
        else
            return valor * fatorial(valor - 1);
    }

    public Double soma(Double primeiroValor, Double segundoValor){
        return primeiroValor + segundoValor;
    }

    public Double subtracao(Double primeiroValor, Double segundoValor){
        return primeiroValor - segundoValor;
    }

    public Double divisao(Double primeiroValor, Double segundoValor){
        if (segundoValor <= 0D)
            return null;
        return primeiroValor / segundoValor;
    }

    public Double multiplicacao(Double primeiroValor, Double segundoValor){
        return primeiroValor * segundoValor;
    }

    public Double mediaAritmetica(List<Double> numeros){
        Double soma = numeros.stream().reduce(0D, Double::sum);
        return soma/numeros.stream().count();
    }

}
