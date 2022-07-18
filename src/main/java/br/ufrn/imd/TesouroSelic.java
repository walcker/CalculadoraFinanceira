package br.ufrn.imd;

public class TesouroSelic extends Investimento{

    public double Selic = 12.75;

    /**
     * @param Selic rentabilidade do tesouro Selic
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */

    public TesouroSelic(){

    }
    public TesouroSelic(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
    }
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
