
package com.myproject.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author daviremzetti
 */
@Entity @Table(name = "endereco")
public class Endereco {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_endereco;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String complemento;

    public int getId() {
        return id_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setId(int id) {
        this.id_endereco = id;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
