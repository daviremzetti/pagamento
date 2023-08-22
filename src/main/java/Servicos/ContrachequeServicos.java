
package Servicos;

import DAO.ContrachequeDAO;
import DAO.DAO;
import br.com.senac.projetointegradordb.Contracheque;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class ContrachequeServicos {
    
    public boolean cadastrar(Contracheque contracheque) {
       ContrachequeDAO dao = DAO.getContrachequeDAO();
       return dao.cadastrar(contracheque);
    }
    
    /**
     * Função para selescionar todos os contracheques no banco de dados
     * @return 
     */
    public List<Contracheque> listar() {
        ContrachequeDAO dao = DAO.getContrachequeDAO();
        return dao.listar();
    }
    
    /**
     * Função para conferir se já existe folha de pagamento gerada para determinada data
     * @param data
     * @return 
     */
    public boolean conferirGerados(LocalDate data) {
        ContrachequeDAO dao = DAO.getContrachequeDAO();
        return dao.conferirGerados(data);
    }
    
    /**
     * Função para selecionar contracheque de determinado militar de determinada data
     * @param matricula
     * @param data
     * @return 
     */
    public Contracheque consultar(String matricula, LocalDate data) {
        ContrachequeDAO dao = DAO.getContrachequeDAO();
        return dao.consultar(matricula, data); 
    }
}
