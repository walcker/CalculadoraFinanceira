package br.ufrn.imd;

public class Main {

    public static void main(String[] args) {

        TesouroSelic selic = new TesouroSelic(5000, 200, 60);

        TesouroIPCA ipca = new TesouroIPCA(5000, 200, 60);

        TesouroPrefixado pref = new TesouroPrefixado(5000, 200, 60);

        Poupanca poupanca = new Poupanca(5000, 200, 60);

        CDBeLC cdblc = new CDBeLC(5000, 200, 60);

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
