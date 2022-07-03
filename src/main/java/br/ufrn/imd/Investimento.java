package br.ufrn.imd;

public abstract class Investimento {

    public double indice;
    public double valorInicial;
    public double valorMensal;
    public int qntMeses;


    public double calcular(double indice, double valorInicial){
        return ((indice)/100 * valorInicial) * (float) (qntMeses/12) + valorInicial;
    }

}
