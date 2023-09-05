
package Servicos;

import DAO.ContrachequeDAO;
import com.myproject.modelo.Contracheque;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author biancamarques
 */
public class ContrachequeServicos {
    
    private ContrachequeDAO dao;
    
    public ContrachequeServicos(ContrachequeDAO dao){
        this.dao = dao;
    }
    
    public boolean cadastrar(Contracheque contracheque) {
       return dao.cadastrar(contracheque);
    }
    
    /**
     * Função para selescionar todos os contracheques no banco de dados
     * @return 
     */
    public List<Contracheque> listar() {
        return dao.listar();
    }
    
    /**
     * Função para conferir se já existe folha de pagamento gerada para determinada data
     * @param data
     * @return 
     */
    public boolean conferirGerados(LocalDate data) {
        boolean gerado;
        int quantidade = dao.conferirGerados(data);
        gerado = quantidade > 0;
        return gerado;
    }
    
    /**
     * Função para selecionar contracheque de determinado militar de determinada data
     * @param matricula
     * @param data
     * @return 
     */
    public Contracheque consultar(String matricula, LocalDate data) {
        return dao.consultar(matricula, data); 
    }
}
