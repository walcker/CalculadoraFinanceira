package br.ufrn.imd;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Investimento> investimentos = new ArrayList<>();

        investimentos.add(new Poupanca());
        investimentos.add(new TesouroSelic());
        investimentos.add(new TesouroIPCA());
        investimentos.add(new TesouroPrefixado());
        investimentos.add(new CDBeLC());

        Scanner scan = new Scanner(System.in);
        int opcao;

        try {
            //entra em um loop infinito até que o usuario resolva sair do programa
            do {
                Menu.mostrarMenu(); //mostra informacoes do menu na tela
                opcao = scan.nextInt();

                switch (opcao) {
                    case 0, 1, 2, 3, 4, 5 -> Operacoes.operar(investimentos, scan, opcao);
                    case 6 -> System.out.println("Fim do programa!");
                    default -> System.out.println("Opcao invalida!");
                }
            }while (opcao != 6);
        }catch (InputMismatchException e){ //erro disparado após o usuario entrar com tipos de dados diferentes do pedido
            System.out.println("Erro: Entrada invalida!");
        }finally {
            scan.close();
        }

    }

}
