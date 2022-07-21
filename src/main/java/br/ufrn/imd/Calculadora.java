package br.ufrn.imd;

public class Calculadora {

    public static double calcularInvestimento(Investimento investimento){

       return investimento.calcular(investimento.indice, investimento.valorInicial);

    }
    public static void imprimirInvestimento(Investimento investimento){
        System.out.println("Resgate do investimento de R$ " + investimento.valorInicial + " no/na " + investimento.getClass().getSimpleName() + " com rendimento de " + investimento.indice + "% a.a..");
        System.out.println(investimento.calcular(investimento.indice, investimento.valorInicial));
    }
}
