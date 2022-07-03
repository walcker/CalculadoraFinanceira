package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {

        TesouroSelic selic = new TesouroSelic();
        selic.valorInicial = 5000;
        selic.valorMensal = 200;
        selic.qntMeses = 60;

        TesouroIPCA ipca = new TesouroIPCA();
        ipca.valorInicial = 5000;
        ipca.valorMensal = 200;
        ipca.qntMeses = 60;

        TesouroPrefixado pref = new TesouroPrefixado();
        pref.valorInicial = 5000;
        pref.valorMensal = 200;
        pref.qntMeses = 60;

        Poupanca poupanca = new Poupanca();
        poupanca.valorInicial = 5000;
        poupanca.valorMensal = 200;
        poupanca.qntMeses = 60;

        CDBeLC cdblc = new CDBeLC();
        cdblc.valorInicial = 5000;
        cdblc.valorMensal = 200;
        cdblc.qntMeses = 60;

        System.out.println("Resgate do investimento de R$ " + selic.valorInicial + " no Tesouro Selic com rendimento de " + selic.Selic + "% a.a..");
        System.out.println(selic.calcular(selic.Selic, selic.valorInicial));

        System.out.println("Resgate do investimento de R$ " + ipca.valorInicial + " no Tesouro IPCA com rendimento de " + ipca.IPCA + "% a.a. e prefixado.");
        System.out.println(ipca.calcular(ipca.IPCA, ipca.valorInicial));

        System.out.println("Resgate do investimento de R$ " + pref.valorInicial + " no Tesouro Prefixado com rendimento de " + pref.prefixado + "% a.a..");
        System.out.println(pref.calcular(pref.prefixado, pref.valorInicial));

        System.out.println("Resgate do investimento de R$ " + poupanca.valorInicial + " na Poupança com rendimento de " + poupanca.Poupanca + "% a.a..");
        System.out.println(poupanca.calcular(poupanca.Poupanca, poupanca.valorInicial));

        System.out.println("Resgate do investimento de R$ " + cdblc.valorInicial + " no CDB e LC com rendimento de " + cdblc.CDBeLC + "% a.a..");
        System.out.println(cdblc.calcular(cdblc.CDBeLC, cdblc.valorInicial));

    }
}
