package DAO;

import Persistencia.JPA;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Movimentação no banco de dados
 * @author daviremzetti
 */
public class MovimentacaoDAO {
    
    /**
     * Método para cadastrar movimentação no banco de dados
     * @param movimentacao
     * @return 
     */
    public boolean cadastrar(Movimentacao movimentacao) {
        EntityManager em = JPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(movimentacao);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para buscar todas as movimentações no banco de dados
     * @return 
     */
    public List<Movimentacao> listar() {
        EntityManager em = JPA.getEntityManager();
        List<Movimentacao> lista;
        try {
            Query consulta = em.createQuery("SELECT m FROM Movimentacao m");
            lista = consulta.getResultList();
        } finally {
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para buscar movimentacões específicas por nome e/ou matrícula do militar no banco de dados
     * @param nome
     * @param matricula
     * @return 
     */
    public List<Movimentacao> filtrar(String nome, String matricula) {
        EntityManager em = JPA.getEntityManager();
        List<Movimentacao> listaMov;
        try {
            Query consulta = em.createQuery("SELECT mov FROM Movimentacao mov WHERE mov.militar.nome LIKE :nome OR mov.militar.matricula = :matricula");
            consulta.setParameter("nome", nome.isEmpty() ? null : "%" + nome + "%");
            consulta.setParameter("matricula", matricula.isEmpty() ? null : matricula);

            listaMov = consulta.getResultList();
        } finally {
            JPA.closeEntity();
        }
        return listaMov;
    }
    
    /**
     * Função para verificar se há movimentação não paga no banco de dados
     * @param militar
     * @return 
     */
    public Movimentacao verificarPagamento(Militar militar) {
        EntityManager em = JPA.getEntityManager();
        Movimentacao mov = null;
        try {
            Query consulta = em.createQuery("SELECT mov FROM Movimentacao mov WHERE (mov.militar.id = :id) AND (mov.pago = :NÃO)");
            consulta.setParameter("id", militar.getId());
            consulta.setParameter("NÃO", "NÃO");
            mov = (Movimentacao) consulta.getSingleResult();
            return mov;
        } catch(Exception e){
            return null;
        }finally{
            JPA.closeEntity();
        }
        
    }
    
    /**
     * Método para mudar o status da movimentação para "pago"
     * @param mov 
     */
    public void setPagamento(Movimentacao mov){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(mov);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            JPA.closeEntity();
        }
    }
}
