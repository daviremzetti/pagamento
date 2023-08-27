
package RegraNegocios;

import DAO.DAO;
import DAO.MovimentacaoDAO;
import br.com.senac.projetointegradordb.Contracheque;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoLancarContracheque {
    
    private static float valor;

    public static float aliquota(Militar novoMilitar, Contracheque novoContracheque) {
        MovimentacaoDAO dao = DAO.getMovimentacaoDAO();
        Movimentacao mov = dao.verificarPagamento(novoMilitar);
        valor = 0;
        if (mov != null) {
            float aliquota = mov.getPorcentagem();
            mov.setPago("SIM");
            dao.setPagamento(mov);
            valor = mov.getValor();
            return aliquota;
        }
        return 0;
    }
    
    public static float valor(Militar novoMilitar, Contracheque novoContracheque) {
        return valor;
    }

}
