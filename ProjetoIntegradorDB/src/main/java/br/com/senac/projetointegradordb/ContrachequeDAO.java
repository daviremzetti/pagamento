package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.util.List;

/**
 * Classe de Acesso aos Dados Contracheque no banco de dados
 * @author daviremzetti
 */
public class ContrachequeDAO {
    
    /**
     * Função para cadastrar contracheque no banco de dados
     * @param contracheque
     * @return 
     */
    public boolean cadastrar(Contracheque contracheque) {
        EntityManager em = JPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(contracheque);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para selescionar todos os contracheques no banco de dados
     * @return 
     */
    public List<Contracheque> listar() {
        EntityManager em = JPA.getEntityManager();
        List<Contracheque> lista;
        try {
            Query consulta = em.createQuery("SELECT c FROM Contracheque c");
            lista = consulta.getResultList();
        } finally {
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para conferir se já existe folha de pagamento gerada para determinada data
     * @param data
     * @return 
     */
    public int conferirGerados(LocalDate data) {
        EntityManager em = JPA.getEntityManager();
        int gerado;
        try {
            Query consulta = em.createQuery("SELECT COUNT(c.id) FROM Competencia c WHERE (MONTH(c.dataCompetencia)) = :mesData AND (YEAR(c.dataCompetencia) = :anoData)");
            consulta.setParameter("mesData", data.getMonth().getValue());
            consulta.setParameter("anoData", data.getYear());
            gerado = Integer.parseInt(consulta.getSingleResult().toString());
            return gerado;
        } catch (NumberFormatException e) {
            return 0;
        } finally {
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para selecionar contracheque de determinado militar de determinada data
     * @param matricula
     * @param data
     * @return 
     */
    public Contracheque consultar(String matricula, LocalDate data) {
        EntityManager em = JPA.getEntityManager();
        Contracheque contracheque;
        try {
            Query consulta = em.createQuery("SELECT c FROM Contracheque c WHERE c.militar.matricula = :matricula AND MONTH(c.dataContracheque) = :mes AND YEAR(c.dataContracheque) = :ano");
            consulta.setParameter("matricula", matricula);
            consulta.setParameter("mes", data.getMonth().getValue());
            consulta.setParameter("ano", data.getYear());
            contracheque = (Contracheque) consulta.getSingleResult();
            return contracheque;
        } catch (Exception e) {
            return null;
        } finally {
            JPA.closeEntity();
        }

    }
}
