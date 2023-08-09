
package Persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Classe para conexão com o banco de dados
 * @author daviremzetti
 */
public class JPA {
    
    private static final String unidade_persistencia = "Cbmsc-PU";
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    /**
     * Função para abrir a conexão com o banco de dados
     * @return 
     */
    public static EntityManager getEntityManager(){
        
        if(em == null || !em.isOpen()){
            emf = Persistence.createEntityManagerFactory(unidade_persistencia);
            em = emf.createEntityManager();
        }
        return em;
    }
    
    /**
     * Método para fechar a conexão com o bando de dados
     */
    public static void closeEntity(){
        if(em.isOpen()){
            em.close();
            emf.close();
        }
    }
}
