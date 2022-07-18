package br.ufrn.imd;

public class TesouroPrefixado extends Investimento {

    public double prefixado = 12.48;

    /**
     * @param prefixado rentabilidade do tesouro prefixado
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */

    public TesouroPrefixado(){

    }

    public TesouroPrefixado(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
    }
    @Override
    public double calcular(double prefixado, double valorInicial){
        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((prefixado/100 * valorInicial) * (float) (qntMeses/12) + valorInicial+valorMensal*(qntMeses-1));
    }

}
