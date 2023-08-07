
package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 *
 * @author daviremzetti
 */
public class EnderecoDAO {
    
    public boolean cadastrar(Endereco endereco){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public Endereco consultar(String cep, String numero){
        EntityManager em = JPA.getEntityManager();
        Endereco endereco = null;
        try{
            Query consulta = em.createQuery("SELECT c FROM cep c WHERE c.cep = :cep AND c.numero =: numero");
            consulta.setParameter("cep", cep);
            consulta.setParameter("numero", numero);
            endereco = (Endereco) consulta.getSingleResult();
        }catch(Exception e){
            return null;
        }        
       return endereco;
    }
}
