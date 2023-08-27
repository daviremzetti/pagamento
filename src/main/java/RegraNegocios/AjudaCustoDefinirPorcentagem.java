
package RegraNegocios;

import DAO.DAO;
import DAO.DependenteDAO;
import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoDefinirPorcentagem {
    
    public static float definir(Militar militar, Movimentacao mov){
        DependenteDAO dao = DAO.getDependenteDAO();
        int qtdDep = dao.contarDependente(militar);
        float porcentagem;
        if(qtdDep == 0){
            porcentagem = (float) 50.00;
        }else if(qtdDep >0 && qtdDep < 3){
            porcentagem = (float) 75.00;
        }else{
            porcentagem = (float) 100.00;
        }
        return porcentagem;
    }
    
}
