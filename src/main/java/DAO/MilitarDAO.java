
package DAO;

import Persistencia.JPA;
import com.myproject.modelo.Militar;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Militar no banco de dados
 * @author daviremzetti
 */
public class MilitarDAO {
    
    /**
     * Método para cadastrar Militar no banco de dados
     * @param militar
     * @return 
     */
    public boolean cadastrar(Militar militar){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(militar);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            return false;
        }finally{
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para buscar todos militares no banco de dados
     * @return 
     */
    public List <Militar> listar(){
        EntityManager em = JPA.getEntityManager();
        List <Militar> lista;
        try{
            Query consulta = em.createQuery("SELECT m FROM Militar m");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para buscar militares pelo nome, matrícula e cpf no banco de dados
     * @param nome
     * @param matricula
     * @param cpf
     * @return 
     */
    public List <Militar> buscaFiltro(String nome, String matricula, String cpf){
        EntityManager em = JPA.getEntityManager();
        List <Militar> lista;
        try{
            Query consulta = em.createQuery("SELECT m FROM Militar m WHERE (m.nome LIKE :nome) OR (m.matricula = :matricula) OR (m.cpf = :cpf)");
            consulta.setParameter("nome", nome.isEmpty() ? null : "%" + nome + "%");
            consulta.setParameter("matricula", matricula.isEmpty() ? null : matricula);
            consulta.setParameter("cpf", cpf.isEmpty() ? null : cpf);
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para buscar militares por id no banco de dados
     * @param id
     * @return 
     */
    public Militar buscaId(int id){
        EntityManager em = JPA.getEntityManager();
        Militar novoMilitar;
        try{
            Query consulta = em.createQuery("SELECT m FROM Militar m WHERE m.id = :id");
            consulta.setParameter("id", id);
            novoMilitar = (Militar) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        return novoMilitar;
    }
}
