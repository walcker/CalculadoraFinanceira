package br.ufrn.imd;

public class CDBeLC extends Investimento{
    public double taxaCDI = 13.15;

    public CDBeLC(){
        this.indice = this.taxaCDI * 1.27; //o indice representa o CDBeLC (rentabilidade de 127% da CDI)
    }

    public CDBeLC(double valorInicial, double valorMensal, int quantidadeMeses){
        this.valorInicial = valorInicial;
        this.valorMensal = valorMensal;
        this.qntMeses = quantidadeMeses;
        this.indice = this.taxaCDI * 1.27; //o indice representa o CDBeLC (rentabilidade de 127% da CDI)
    }


    /**
     * @param CDBLC rentabilidade 127% da CDI
     * @param valorInicial valor inicial investido
     * @return valor final do investimento
     */


    @Override
    public double calcular(double CDBLC, double valorInicial) {

        try {
            if (valorInicial <= 0) {
                throw new IllegalArgumentException("Valor inicial deve ser maior que zero.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return ((CDBLC) / 100 * valorInicial * (float) (qntMeses / 12) + valorInicial+valorMensal*(qntMeses-1));
    }

}
