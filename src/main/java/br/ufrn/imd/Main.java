package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {
        CalcularInvestimento calculadora = new CalcularInvestimento();

        TesouroSelic selic = new TesouroSelic(5000, 200, 60);
        TesouroIPCA ipca = new TesouroIPCA(5000, 200, 60);
        TesouroPrefixado pref = new TesouroPrefixado(5000, 200, 60);
        Poupanca poupanca = new Poupanca(5000, 200, 60);
        CDBeLC cdblc = new CDBeLC(5000, 200, 60);

        calculadora.imprimirInvestimento(selic);

        calculadora.imprimirInvestimento(ipca);

        calculadora.imprimirInvestimento(pref);

        calculadora.imprimirInvestimento(poupanca);

        calculadora.imprimirInvestimento(cdblc);

    }
}
