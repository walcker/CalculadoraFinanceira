package br.ufrn.imd;

public class TesouroIPCA extends Investimento{

    public double IPCA = 8.28;

    /**
     * @param IPCA rentabilidade do tesouro IPCA
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    @Override
    public double calcular(double IPCA, double valorInicial){
        double prefix = 5.72;
        return (IPCA + prefix) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial;
    }

}
