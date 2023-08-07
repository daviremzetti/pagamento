
package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Posto/Graduação no banco de dados
 * @author daviremzetti
 */
public class PostoGraduacaoDAO {
    
    /**
     * Método para cadastrar posto/graduação no banco de dados
     * @param postoGraduacao
     * @return 
     */
    public boolean cadastrar(PostoGraduacao postoGraduacao){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(postoGraduacao);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            return false;
        }finally{
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para buscar no banco de dados todos os postos/graduações
     * @return 
     */
    public List<PostoGraduacao> listar(){
        EntityManager em = JPA.getEntityManager();
        List<PostoGraduacao> lista;
        try{
            Query consulta = em.createQuery("SELECT p FROM PostoGraduacao p");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        
        return lista;
    }
    
    /**
     * Função para buscar no banco de dados um posto/graduação específico pelo id
     * @param id
     * @return 
     */
    public PostoGraduacao buscaId(int id){
        EntityManager em = JPA.getEntityManager();
        PostoGraduacao novoPosto;
        try{
            Query consulta = em.createQuery("SELECT p FROM PostoGraduacao p WHERE p.id = :id");
            consulta.setParameter("id", id);
            novoPosto = (PostoGraduacao) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        
        return novoPosto;
    }
    
    /**
     * Função para buscar no banco de dados um posto/graduação específico pelo partes do nome
     * @param filtro
     * @return 
     */
    public List<PostoGraduacao> buscaNome(String filtro){
        EntityManager em = JPA.getEntityManager();
        List<PostoGraduacao> lista;
        try{
            Query consulta = em.createQuery("SELECT p FROM PostoGraduacao p WHERE p.posto_graduacao LIKE :filtro");
            consulta.setParameter("filtro", "%" + filtro + "%");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        
        return lista;
    }
    
    /**
     * Método para buscar posto/graduação por nome
     * @param nome
     * @return 
     */
    public PostoGraduacao buscaPostoPorNome(String nome){
        EntityManager em = JPA.getEntityManager();
        PostoGraduacao novoPosto;
        try{
            Query consulta = em.createQuery("SELECT p FROM PostoGraduacao p WHERE p.posto_graduacao = :nome");
            consulta.setParameter("nome", nome);
            novoPosto = (PostoGraduacao) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        
        return novoPosto;
    }
}
