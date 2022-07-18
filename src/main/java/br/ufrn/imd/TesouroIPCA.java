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
        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((IPCA + prefix) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial) + valorMensal * (qntMeses - 1);
    }

}

