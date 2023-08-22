
package Servicos;

import DAO.DAO;
import DAO.DependenteDAO;
import br.com.senac.projetointegradordb.Dependente;
import br.com.senac.projetointegradordb.Militar;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class DependenteServicos {
    
    public boolean cadastrar(Dependente dependente){
        DependenteDAO dao = DAO.getDependenteDAO();
        return dao.cadastrar(dependente);
    }
    
    /**
     * Função para selecionar todos os dependentes cadastrados no bando de dados
     * @return 
     */
    public List<Dependente> listar(){
        DependenteDAO dao = DAO.getDependenteDAO();
        return dao.listar();
    }
    
    /**
     * Função para selecionar determinado dependente pelo id
     * @param id
     * @return 
     */
    public Dependente buscarId(int id){
        DependenteDAO dao = DAO.getDependenteDAO();
        return dao.buscarId(id);
    }
    
    /**
     * Função para contar a quantidade de dependentes de determinado militar
     * @param militar
     * @return 
     */
    public int contarDependente(Militar militar){
        DependenteDAO dao = DAO.getDependenteDAO();
        return dao.contarDependente(militar);
    }
    
    
    /**
     * Função para selecionar dependentes no bando de dados pelo nome do dependente, cpf do dependente ou matricula do militar mantenedor
     * @param nomeDep
     * @param cpfDep
     * @param matriculaMant
     * @return 
     */
    public List<Dependente> filtrar(String nomeDep, String cpfDep, String matriculaMant){
        DependenteDAO dao = DAO.getDependenteDAO();
        return dao.filtrar(nomeDep, cpfDep, matriculaMant);
    }
}
