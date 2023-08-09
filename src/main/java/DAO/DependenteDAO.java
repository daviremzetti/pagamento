
package DAO;

import Persistencia.JPA;
import br.com.senac.projetointegradordb.Dependente;
import br.com.senac.projetointegradordb.Militar;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Dependente no banco de dados
 * @author daviremzetti
 */
public class DependenteDAO {
    
    /**
     * Função para cadastrar dependente no banco de dados
     * @param dependente
     * @return 
     */
    public boolean cadastrar(Dependente dependente){
        EntityManager em = JPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(dependente);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            return false;
        }finally{
            JPA.closeEntity();
        }
    }
    
    /**
     * Função para selecionar todos os dependentes cadastrados no bando de dados
     * @return 
     */
    public List<Dependente> listar(){
        EntityManager em = JPA.getEntityManager();
        List<Dependente> lista;
        try{
            Query consulta = em.createQuery("SELECT d FROM Dependente d");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para selecionar determinado dependente pelo id
     * @param id
     * @return 
     */
    public Dependente buscarId(int id){
        EntityManager em = JPA.getEntityManager();
        Dependente novoDependente;
        try{
            Query consulta = em.createQuery("SELECT d FROM Dependente d WHERE d.id = :id");
            consulta.setParameter("id", id);
            novoDependente = (Dependente) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        return novoDependente;
    }
    
    /**
     * Função para contar a quantidade de dependentes de determinado militar
     * @param militar
     * @return 
     */
    public int contarDependente(Militar militar){
        EntityManager em = JPA.getEntityManager();
        int contagemInt;
        try{
            Query consulta = em.createQuery("SELECT COUNT(dep.id) FROM Dependente dep WHERE dep.militar = :militar");
            consulta.setParameter("militar", militar);
            contagemInt = Integer.parseInt(consulta.getSingleResult().toString());
        }finally{
            JPA.closeEntity();
        }
        return contagemInt;
    }
    
    
    /**
     * Função para selecionar dependentes no bando de dados pelo nome do dependente, cpf do dependente ou matricula do militar mantenedor
     * @param nomeDep
     * @param cpfDep
     * @param matriculaMant
     * @return 
     */
    public List<Dependente> filtrar(String nomeDep, String cpfDep, String matriculaMant){
        EntityManager em = JPA.getEntityManager();
        List <Dependente> lista;
        try{
            Query consulta = em.createQuery("SELECT dep FROM Dependente dep WHERE dep.nome LIKE :nomeDep OR dep.cpf = :cpfDep OR dep.militar.matricula = :matriculaMant");
            consulta.setParameter("nomeDep", nomeDep.isEmpty() ? null : "%" + nomeDep + "%");
            consulta.setParameter("cpfDep", cpfDep.isEmpty() ? null : cpfDep);
            consulta.setParameter("matriculaMant", matriculaMant.isEmpty() ? null : matriculaMant);
            lista = (List<Dependente>) consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        
        return lista;
        
    }
}
