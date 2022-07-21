package br.ufrn.imd;

import java.util.List;
import java.util.Scanner;

public class Operacoes {
    //atribui os valores e imprime na tela o resultado dos calculos
    public static void operar(List<Investimento> investimentos, Scanner scan, int op){

        System.out.println("Digite o valor inicial:");
        double valorInicial = scan.nextDouble();
        System.out.println("Digite o valor mensal:");
        double valorMensal = scan.nextDouble();
        System.out.println("Digite a quantidade de meses:");
        int quantidadeMeses = scan.nextInt();

        if (op == 5){
            for(Investimento elemento : investimentos){
                elemento.valorInicial = valorInicial;
                elemento.valorMensal = valorMensal;
                elemento.qntMeses = quantidadeMeses;

                Calculadora.imprimirInvestimento(elemento);
            }
        }
        else{
            investimentos.get(op).valorInicial = valorInicial;
            investimentos.get(op).valorMensal = valorMensal;
            investimentos.get(op).qntMeses = quantidadeMeses;

            Calculadora.imprimirInvestimento(investimentos.get(op));
        }

    }

}
