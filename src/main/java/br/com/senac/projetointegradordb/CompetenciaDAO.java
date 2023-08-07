/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;


/**
 * Classe de Acesso aos Dados Competencia no banco de dados
 * @author daviremzetti
 */
public class CompetenciaDAO {
    
    /**
     * Método para cadastrar no bando de dados as datas de contracheques já gerados
     * @param competencia
     * @return 
     */
    public boolean cadastrar(Competencia competencia) {
        EntityManager em = JPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(competencia);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            JPA.closeEntity();
        }
    }

}