
package br.com.senac.projetointegradordb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * Classe de Acesso aos Dados Relação de Dependência no banco de dados
 * @author daviremzetti
 */
public class RelacaoDependenciaDAO {
    
    /**
     * Função para listar todas as relações de dependência
     * @return 
     */
    public List<RelacaoDependencia> listar(){
        EntityManager em = JPA.getEntityManager();
        List<RelacaoDependencia> lista;
        try{
            Query consulta = em.createQuery("SELECT r FROM RelacaoDependencia r");
            lista = consulta.getResultList();
        }finally{
            JPA.closeEntity();
        }
        return lista;
    }
    
    /**
     * Função para buscar uma relação de dependência específica
     * @param nome
     * @return 
     */
    public RelacaoDependencia filtrar(String nome){
        EntityManager em = JPA.getEntityManager();
        RelacaoDependencia relacao;
        try{
            Query consulta = em.createQuery("SELECT r FROM RelacaoDependencia r WHERE r.nomeRelacao = :nome");
            consulta.setParameter("nome", nome);
            relacao = (RelacaoDependencia) consulta.getSingleResult();
        }finally{
            JPA.closeEntity();
        }
        return relacao;
    }
}
