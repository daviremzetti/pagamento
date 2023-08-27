package Servicos;

import DAO.DAO;
import DAO.LotacaoDAO;
import br.com.senac.projetointegradordb.Lotacao;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class LotacaoServicos {
    
    private static final LotacaoDAO dao = DAO.getLotacaoDAO();

    /**
     * Método para cadastrar Lotacao no banco de dados
     *
     * @param lotacao
     * @return
     */
    public boolean cadastrar(Lotacao lotacao) {
        return dao.cadastrar(lotacao);
    }

    /**
     * Função para buscar todas as lotações no banco de dados
     *
     * @return
     */
    public List<Lotacao> listar() {
        return dao.listar();
    }

    /**
     * Função para buscar lotações por id no banco de dados
     *
     * @param id
     * @return
     */
    public Lotacao buscaId(int id) {
        return dao.buscaId(id);
    }

    /**
     * Função para buscar lotações por batalhão, companhia e pelotão no banco de
     * dados
     *
     * @param batalhao
     * @param companhia
     * @param pelotao
     * @return
     */
    public List<Lotacao> filtrar(String batalhao, String companhia, String pelotao) {
        return dao.filtrar(batalhao, companhia, pelotao);
    }

    /**
     * Função para selecionar lotação por nome
     *
     * @param nome
     * @return
     */
    public Lotacao buscarNome(String nome) {
        return dao.buscarNome(nome);
    }
}
