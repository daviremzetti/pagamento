
package br.com.senac.projetointegradordb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 * Classe Contracheque
 * @author daviremzetti
 */
@Entity @Table(name="contracheque")
public class Contracheque {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne @JoinColumn(name = "Id_Militar")
    private Militar militar;
    @Column(name="Data_Contracheque")
    private LocalDate dataContracheque;
    @Column(name="Subsidio")
    private float subsidio;
    @Column(name="Indice_Ajuda_Custo")
    private float indiceAjudaCusto;
    @Column(name="Valor_Ajuda_Custo")
    private float valorAjudaCusto;
    @Column(name="Salario_Bruto")
    private float salarioBruto = subsidio + valorAjudaCusto;
    @Column(name="Indice_Previdencia")
    private float indicePrevidencia;
    @Column(name="Valor_Previdencia")
    private float valorPrevidencia = subsidio * indicePrevidencia;
    @Column(name="Indice_Imposto_Renda")
    private float indiceImpostoRenda;
    @Column(name="Valor_Imposto_Renda")
    private float valorImpostoRenda;
    @Column(name="Salario_Liquido")
    private float salarioLiquido;

    public int getId() {
        return id;
    }

    public Militar getMilitar() {
        return militar;
    }

    public LocalDate getDataContracheque() {
        return dataContracheque;
    }

    public float getSubsidio() {
        return subsidio;
    }

    public float getIndiceAjudaCusto() {
        return indiceAjudaCusto;
    }

    public float getValorAjudaCusto() {
        return valorAjudaCusto;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getIndicePrevidencia() {
        return indicePrevidencia;
    }

    public float getValorPrevidencia() {
        return valorPrevidencia;
    }

    public float getIndiceImpostoRenda() {
        return indiceImpostoRenda;
    }

    public float getValorImpostoRenda() {
        return valorImpostoRenda;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public void setDataContracheque(LocalDate dataContracheque) {
        this.dataContracheque = dataContracheque;
    }

    public void setSubsidio(float subsidio) {
        this.subsidio = subsidio;
    }

    public void setIndiceAjudaCusto(float indiceAjudaCusto) {
        this.indiceAjudaCusto = indiceAjudaCusto;
    }

    public void setValorAjudaCusto(float valorAjudaCusto) {
        this.valorAjudaCusto = valorAjudaCusto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setIndicePrevidencia(float indicePrevidencia) {
        this.indicePrevidencia = indicePrevidencia;
    }

    public void setValorPrevidencia(float valorPrevidencia) {
        this.valorPrevidencia = valorPrevidencia;
    }

    public void setIndiceImpostoRenda(float indiceImpostoRenda) {
        this.indiceImpostoRenda = indiceImpostoRenda;
    }

    public void setValorImpostoRenda(float valorImpostoRenda) {
        this.valorImpostoRenda = valorImpostoRenda;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
