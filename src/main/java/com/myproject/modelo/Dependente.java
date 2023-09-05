
package com.myproject.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Classe Dependente
 * @author daviremzetti
 */
@Entity @Table(name="dependente")
public class Dependente {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    @ManyToOne @JoinColumn(name = "idMilitar")
    private Militar militar;
    @ManyToOne @JoinColumn(name = "idRelacaoDependencia")
    private RelacaoDependencia relacaoDependencia;
    @ManyToOne @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Militar getMilitar() {
        return militar;
    }

    public RelacaoDependencia getRelacaoDependencia() {
        return relacaoDependencia;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public void setRelacaoDependencia(RelacaoDependencia relacaoDependencia) {
        this.relacaoDependencia = relacaoDependencia;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

}
