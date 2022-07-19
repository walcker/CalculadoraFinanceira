package br.ufrn.imd;

public class TesouroIPCA extends Investimento{

    public TesouroIPCA(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
        this.indice = 8.28; //o indice representa a rentabilidade do tesouro IPCA
    }

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

