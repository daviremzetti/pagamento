package Servicos;

import DAO.MilitarDAO;
import br.com.senac.projetointegradordb.Militar;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class MilitarServicos {
    
    private MilitarDAO dao;
    
    public MilitarServicos(MilitarDAO dao){
        this.dao = dao;
    }
    /**
     * Método para cadastrar Militar no banco de dados
     *
     * @param militar
     * @return
     */
    public boolean cadastrar(Militar militar) {
        return dao.cadastrar(militar);
    }

    /**
     * Função para buscar todos militares no banco de dados
     *
     * @return
     */
    public List<Militar> listar() {
        return dao.listar();
    }

    /**
     * Função para buscar militares pelo nome, matrícula e cpf no banco de dados
     *
     * @param nome
     * @param matricula
     * @param cpf
     * @return
     */
    public List<Militar> buscaFiltro(String nome, String matricula, String cpf) {
        return dao.buscaFiltro(nome, matricula, cpf);
    }

    /**
     * Função para buscar militares por id no banco de dados
     *
     * @param id
     * @return
     */
    public Militar buscaId(int id) {
        return dao.buscaId(id);
    }
}
