
package RegraNegocios;

import DAO.DependenteDAO;
import DAO.MovimentacaoDAO;
import br.com.senac.projetointegradordb.Contracheque;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoServicos {
    
    public void efetuar(Militar novoMilitar, Contracheque novoContracheque) {
        MovimentacaoDAO dao = new MovimentacaoDAO();
        Movimentacao mov = dao.verificarPagamento(novoMilitar);
        if (mov != null) {
            novoContracheque.setValorAjudaCusto(mov.getValor());
            novoContracheque.setIndiceAjudaCusto(mov.getPorcentagem());
            mov.setPago("SIM");
            dao.setPagamento(mov);
        }
    }
    
    public void definirAjudaCusto(Militar militar, Movimentacao mov){
        DependenteDAO dao = new DependenteDAO();
        int qtdDep = dao.contarDependente(militar);
        
        if(qtdDep == 0){
            mov.setPorcentagem((float) 50.00);
        }else if(qtdDep >0 && qtdDep < 3){
            mov.setPorcentagem((float) 75.00);
        }else{
            mov.setPorcentagem((float) 100.00);
        }
        float subsidio = militar.getPostoGraduacao().getSalario();
        float porcentagem = mov.getPorcentagem();
        mov.setValor(subsidio * porcentagem / 100);
    }
}
