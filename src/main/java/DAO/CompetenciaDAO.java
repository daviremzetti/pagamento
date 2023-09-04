
package DAO;

import Persistencia.JPA;
import br.com.senac.projetointegradordb.Competencia;
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
