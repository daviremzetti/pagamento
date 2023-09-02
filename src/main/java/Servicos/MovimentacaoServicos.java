package Servicos;

import DAO.DAO;
import DAO.MovimentacaoDAO;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class MovimentacaoServicos {
    
    MovimentacaoDAO dao = DAO.getMovimentacaoDAO();

    /**
     * Método para cadastrar movimentação no banco de dados
     *
     * @param movimentacao
     * @return
     */
    public boolean cadastrar(Movimentacao movimentacao) {
        return dao.cadastrar(movimentacao);
    }

    /**
     * Função para buscar todas as movimentações no banco de dados
     *
     * @return
     */
    public List<Movimentacao> listar() {
        return dao.listar();
    }

    /**
     * Função para buscar movimentacões específicas por nome e/ou matrícula do
     * militar no banco de dados
     *
     * @param nome
     * @param matricula
     * @return
     */
    public List<Movimentacao> filtrar(String nome, String matricula) {
        return dao.filtrar(nome, matricula);
    }

    /**
     * Função para verificar se há movimentação não paga no banco de dados
     *
     * @param militar
     * @return
     */
    public Movimentacao verificarPagamento(Militar militar) {
        return dao.verificarPagamento(militar);
    }

    /**
     * Método para mudar o status da movimentação para "pago"
     *
     * @param mov
     */
    public void setPagamento(Movimentacao mov) {
        dao.setPagamento(mov);
    }
    
    public Movimentacao buscarId(int id){
        return dao.buscarId(id);
    }
}
