
package com.myproject.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Classe Militar
 * @author daviremzetti
 */
@Entity
@Table(name="militar")
public class Militar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String matricula;
    @ManyToOne @JoinColumn(name = "id_posto_graduacao")
    private PostoGraduacao postoGraduacao;
    @ManyToOne @JoinColumn(name = "id_lotacao")
    private Lotacao lotacao;
    @ManyToOne @JoinColumn(name = "id_endereco")
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

    public String getMatricula() {
        return matricula;
    }

    public PostoGraduacao getPostoGraduacao() {
        return postoGraduacao;
    }

    public Lotacao getLotacao() {
        return lotacao;
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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPostoGraduacao(PostoGraduacao postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
