
package com.myproject.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe Lotação
 * @author daviremzetti
 */
@Entity
@Table(name="lotacao")
public class Lotacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String batalhao;
    private String companhia;
    private String pelotao;
    private String nome;

    public int getId() {
        return id;
    }

    public String getBatalhao() {
        return batalhao;
    }

    public String getCompanhia() {
        return companhia;
    }

    public String getPelotao() {
        return pelotao;
    }
    
    public String getNome(){
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBatalhao(String batalhao) {
        this.batalhao = batalhao;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public void setPelotao(String pelotao) {
        this.pelotao = pelotao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
