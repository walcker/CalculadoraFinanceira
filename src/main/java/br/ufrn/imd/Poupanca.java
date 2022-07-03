package br.ufrn.imd;

public class Poupanca extends Investimento {

    public double Poupanca = 6.00;

    /**
     * @param Poupanca rentabilidade do tesouro IPCA
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */
    @Override
    public double calcular(double Poupanca, double valorInicial) {
        return (Poupanca) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial;
    }

}
