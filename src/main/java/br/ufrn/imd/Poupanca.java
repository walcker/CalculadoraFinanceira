package br.ufrn.imd;

public class Poupanca extends Investimento {

    public Poupanca(){
        this.indice = 6.00; //o indice representa a rentabilidade na Poupanca
    }
    public Poupanca(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
        this.indice = 6.00; //o indice representa a rentabilidade na Poupanca
    }

    /**
     * @param Poupanca rentabilidade do tesouro IPCA
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */


    @Override
    public double calcular(double Poupanca, double valorInicial) {
        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((Poupanca) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial) + valorMensal * (qntMeses - 1);
    }

}
