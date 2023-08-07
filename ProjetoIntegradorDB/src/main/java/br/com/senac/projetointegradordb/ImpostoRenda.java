package br.com.senac.projetointegradordb;

/**
 * Classe Imposto de Renda
 * @author daviremzetti
 */
public class ImpostoRenda {

    private float baseCalculo;
    private float aliquota;
    private float deducao;
    private float valorImposto = (baseCalculo * aliquota) - deducao;

    public float getBaseCalculo() {
        return baseCalculo;
    }

    public float getAliquota() {
        return aliquota;
    }

    public float getDeducao() {
        return deducao;
    }

    public float getValorImposto() {
        return valorImposto;
    }

    public void setBaseCalculo(float baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public void setDeducao(float deducao) {
        this.deducao = deducao;
    }

    public void setValorImposto(float valorImposto) {
        this.valorImposto = valorImposto;
    }
    
    /**
     * Método para calcular o imposto de renda
     * @param baseCalculo 
     */
    public void calcularIr(float baseCalculo) {
        if (baseCalculo <= 2112.00) {
            aliquota = (float) 0.00;
            deducao = 0;
        } else if (baseCalculo > 2112.00 && baseCalculo <= 2826.65) {
            aliquota = (float) 7.5;
            deducao = (float) 158.40;
        } else if (baseCalculo > 2826.65 && baseCalculo <= 3751.05) {
            aliquota = (float) 15.00;
            deducao = (float) 370.40;
        } else if (baseCalculo > 3751.05 && baseCalculo <= 4664.68) {
            aliquota = (float) 22.50;
            deducao = (float) 651.73;
        } else if (baseCalculo > 4664.68) {
            aliquota = (float) 27.50;
            deducao = (float) 884.96;
        }
        
        valorImposto = (baseCalculo * aliquota/100) - deducao;
    }
}

