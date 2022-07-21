package br.ufrn.imd;

public class TesouroSelic extends Investimento{

    public TesouroSelic(){
        this.indice = 12.75; //o indice representa a rentabilidade do tesouro Selic
    }
    public TesouroSelic(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
        this.indice = 12.75; //o indice representa a rentabilidade do tesouro Selic

    }

    /**
     * @param Selic rentabilidade do tesouro Selic
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */


    @Override
    public double calcular(double Selic, double valorInicial){
        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((Selic/100 * valorInicial) * (float) (qntMeses/12) + valorInicial)+valorMensal*(qntMeses-1);
    }

}
