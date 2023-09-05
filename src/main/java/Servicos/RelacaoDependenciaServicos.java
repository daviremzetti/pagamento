package Servicos;

import DAO.RelacaoDependenciaDAO;
import com.myproject.modelo.RelacaoDependencia;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class RelacaoDependenciaServicos {
    
    private RelacaoDependenciaDAO dao;
    
    public RelacaoDependenciaServicos(RelacaoDependenciaDAO dao){
        this.dao = dao;
    }

    public List<RelacaoDependencia> listar() {
        return dao.listar();
    }

    /**
     * Função para buscar uma relação de dependência específica
     *
     * @param nome
     * @return
     */
    public RelacaoDependencia filtrar(String nome) {
        return dao.filtrar(nome);
    }
}
