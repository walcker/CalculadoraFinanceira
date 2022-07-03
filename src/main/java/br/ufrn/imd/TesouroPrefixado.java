package br.ufrn.imd;

public class TesouroPrefixado extends Investimento {

    public double prefixado = 12.48;

    /**
     * @param prefixado rentabilidade do tesouro prefixado
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    @Override
    public double calcular(double prefixado, double valorInicial){
        return (prefixado/100 * valorInicial) * (float) (qntMeses/12) + valorInicial;
    }

}
