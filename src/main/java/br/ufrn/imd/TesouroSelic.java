package br.ufrn.imd;

public class TesouroSelic extends Investimento{

    public double Selic = 12.75;

    /**
     * @param Selic rentabilidade do tesouro Selic
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    @Override
    public double calcular(double Selic, double valorInicial){

        return (Selic/100 * valorInicial) * (float) (qntMeses/12) + valorInicial;
    }

}
