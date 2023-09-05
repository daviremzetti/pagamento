
package com.myproject.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe posto/graduação
 * @author biancamarques
 */
@Entity
@Table(name="posto_graduacao")
public class PostoGraduacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String posto_graduacao;
    private float salario;

    public int getId() {
        return id;
    }

    public String getPosto_graduacao() {
        return posto_graduacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosto_graduacao(String posto_graduacao) {
        this.posto_graduacao = posto_graduacao;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
