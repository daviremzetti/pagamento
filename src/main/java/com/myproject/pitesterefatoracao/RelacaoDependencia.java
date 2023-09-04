
package br.com.senac.projetointegradordb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe de relação de dependência
 * @author daviremzetti
 */
@Entity @Table(name="relacao_dependencia")
public class RelacaoDependencia {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Nome_Relacao")
    private String nomeRelacao;

    public int getId() {
        return id;
    }

    public String getNomeRelacao() {
        return nomeRelacao;
    }

}
