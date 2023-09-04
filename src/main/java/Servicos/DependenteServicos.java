
package Servicos;

import DAO.DependenteDAO;
import br.com.senac.projetointegradordb.Dependente;
import br.com.senac.projetointegradordb.Militar;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class DependenteServicos {
    
    private DependenteDAO dao;
    
    public DependenteServicos(DependenteDAO dao){
        this.dao = dao;
    }
    
    public boolean cadastrar(Dependente dependente){

        return dao.cadastrar(dependente);
    }
    
    /**
     * Função para selecionar todos os dependentes cadastrados no bando de dados
     * @return 
     */
    public List<Dependente> listar(){
        return dao.listar();
    }
    
    /**
     * Função para selecionar determinado dependente pelo id
     * @param id
     * @return 
     */
    public Dependente buscarId(int id){
        return dao.buscarId(id);
    }
    
    /**
     * Função para contar a quantidade de dependentes de determinado militar
     * @param militar
     * @return 
     */
    public int contarDependente(Militar militar){
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
        return dao.filtrar(nomeDep, cpfDep, matriculaMant);
    }
}
