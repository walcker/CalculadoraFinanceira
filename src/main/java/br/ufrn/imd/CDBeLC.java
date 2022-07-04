package br.ufrn.imd;

public class CDBeLC extends Investimento{
    public double taxaCDI = 13.15;
    public double CDBeLC = taxaCDI * 1.27;

    /**
     * @param CDBLC rentabilidade 127% da CDI
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    @Override
    public double calcular(double CDBLC, double valorInicial) {
        return ((CDBLC) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial+valorMensal*(qntMeses-1));
    }

}
