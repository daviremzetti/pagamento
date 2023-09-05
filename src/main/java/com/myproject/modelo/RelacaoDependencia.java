
package com.myproject.modelo;

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
    private int Id;
    @Column(name="Nome_Relacao")
    private String nomeRelacao;

    public int getId() {
        return Id;
    }

    public String getNomeRelacao() {
        return nomeRelacao;
    }

}
