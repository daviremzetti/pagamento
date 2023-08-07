
package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Lotaçãao no banco de dados
 * @author daviremzetti
 */
public class LotacaoDAO {
    
    /**
     * Método para cadastrar Lotacao no banco de dados
     * @param lotacao
     * @return 
     */
    public boolean cadastrar(Lotacao lotacao){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(lotacao);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            return false;
        }finally{
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para buscar todas as lotações no banco de dados
     * @return 
     */
    public List<Lotacao> listar(){
        EntityManager em = JPA.getEntityManager();
        List<Lotacao> lista;
        try{
            Query consulta = em.createQuery("SELECT l FROM Lotacao l");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para buscar lotações por id no banco de dados
     * @param id
     * @return 
     */
    public Lotacao buscaId(int id){
        EntityManager em = JPA.getEntityManager();
        Lotacao novaLotacao;
        try{
            Query consulta = em.createQuery("SELECT l FROM Lotacao l WHERE l.id = :id");
            consulta.setParameter("id", id);
            novaLotacao = (Lotacao) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        return novaLotacao;
    }
    
    /**
     * Função para buscar lotações por batalhão, companhia e pelotão no banco de dados
     * @param batalhao
     * @param companhia
     * @param pelotao
     * @return 
     */
    public List<Lotacao> filtrar(String batalhao, String companhia, String pelotao){
        EntityManager em = JPA.getEntityManager();
        List<Lotacao> lista;
        try{
            Query consulta = em.createQuery("SELECT l FROM Lotacao l WHERE (l.batalhao = :batalhao) AND (l.companhia = :companhia) AND (l.pelotao = :pelotao)");
            consulta.setParameter("batalhao", batalhao.isEmpty() ? null : batalhao);
            consulta.setParameter("companhia", companhia.isEmpty() ? null : companhia);
            consulta.setParameter("pelotao", pelotao.isEmpty() ? null : pelotao);
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para selecionar lotação por nome
     * @param nome
     * @return 
     */
    public Lotacao buscarNome(String nome){
        EntityManager em = JPA.getEntityManager();
        Lotacao lotacao;
        try{
            Query consulta = em.createQuery("SELECT l FROM Lotacao l WHERE l.nome = :nome");
            consulta.setParameter("nome", nome.isEmpty() ? null : nome);
            lotacao = (Lotacao) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        return lotacao;
    }
}
