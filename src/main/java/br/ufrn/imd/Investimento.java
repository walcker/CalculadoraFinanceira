package br.ufrn.imd;

public abstract class Investimento {

    public double indice;
    public double valorInicial;
    public double valorMensal;
    public int qntMeses;

    /**
     * @param indice rentabilidade do investimento
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    public double calcular(double indice, double valorInicial){
        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((indice)/100 * valorInicial) * (float) (qntMeses/12) + valorInicial;
    }

}
