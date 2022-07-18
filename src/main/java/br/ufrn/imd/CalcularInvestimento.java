package br.ufrn.imd;

public class CalcularInvestimento {

    public double calcularInvestimento(Investimento investimento){

       return investimento.calcular(investimento.indice, investimento.valorInicial);

    }
    public void imprimirInvestimento(Investimento investimento){
        System.out.println("Resgate do investimento de R$ " + investimento.valorInicial + " no " + investimento.getClass().getSimpleName() + " com rendimento de " + investimento.indice + "% a.a..");
        System.out.println(investimento.calcular(investimento.indice, investimento.valorInicial));
    }
}
