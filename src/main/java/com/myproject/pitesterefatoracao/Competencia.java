package br.com.senac.projetointegradordb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 * Classe Competência
 * @author daviremzetti
 */
@Entity @Table(name = "competencia")
public class Competencia {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dataCompetencia;

    public LocalDate getDataCompetencia() {
        return dataCompetencia;
    }

    public void setDataCompetencia(LocalDate dataCompetencia) {
        this.dataCompetencia = dataCompetencia;
    }

}
