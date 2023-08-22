package Servicos;

import DAO.DAO;
import DAO.RelacaoDependenciaDAO;
import br.com.senac.projetointegradordb.RelacaoDependencia;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class RelacaoDependenciaServicos {

    public List<RelacaoDependencia> listar() {
        RelacaoDependenciaDAO dao = DAO.getRelacaoDependenciaDAO();
        return dao.listar();
    }

    /**
     * Função para buscar uma relação de dependência específica
     *
     * @param nome
     * @return
     */
    public RelacaoDependencia filtrar(String nome) {
        RelacaoDependenciaDAO dao = DAO.getRelacaoDependenciaDAO();
        return dao.filtrar(nome);
    }
}
