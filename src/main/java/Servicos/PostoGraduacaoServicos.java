
package Servicos;

import DAO.PostoGraduacaoDAO;
import com.myproject.modelo.PostoGraduacao;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class PostoGraduacaoServicos {
    
    PostoGraduacaoDAO dao;
    
    public PostoGraduacaoServicos(PostoGraduacaoDAO dao){
        this.dao = dao;
    }

    public boolean cadastrar(PostoGraduacao postoGraduacao) {
        return dao.cadastrar(postoGraduacao);
    }

    /**
     * Função para buscar no banco de dados todos os postos/graduações
     *
     * @return
     */
    public List<PostoGraduacao> listar() {
        return dao.listar();
    }

    /**
     * Função para buscar no banco de dados um posto/graduação específico pelo
     * id
     *
     * @param id
     * @return
     */
    public PostoGraduacao buscaId(int id) {
        return dao.buscaId(id);
    }

    /**
     * Função para buscar no banco de dados um posto/graduação específico pelo
     * partes do nome
     *
     * @param filtro
     * @return
     */
    public List<PostoGraduacao> buscaNome(String filtro) {
        return dao.buscaNome(filtro);
    }

    /**
     * Método para buscar posto/graduação por nome
     *
     * @param nome
     * @return
     */
    public PostoGraduacao buscaPostoPorNome(String nome) {
        return dao.buscaPostoPorNome(nome);
    }
}
