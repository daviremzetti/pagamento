package RegraNegocios;

import DAO.MovimentacaoDAO;
import Servicos.MovimentacaoServicos;
import com.myproject.modelo.Militar;
import com.myproject.modelo.Movimentacao;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoLancarContracheque {

    private static final MovimentacaoServicos servicoMov = new MovimentacaoServicos(new MovimentacaoDAO());
    
    private static boolean controle;
    private static Movimentacao mov;
    
    public static float aliquota(Militar novoMilitar) {
        mov = (Movimentacao) servicoMov.verificarPagamento(novoMilitar);
        float aliquota = 0;
        if (mov != null) {
            aliquota = mov.getPorcentagem();
            mov.setPago("SIM");
            servicoMov.setPagamento(mov);
            aliquota = mov.getPorcentagem();
            controle = true;
        }
        return aliquota;
    }

    
    public static float valor(Militar novoMilitar) {
        
        float valor = 0;
        if(controle == true){
            valor = mov.getValor();
            controle = false;
        }
        return valor;
    }

}
