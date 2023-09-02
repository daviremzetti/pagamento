
package RegraNegocios;

import Servicos.DependenteServicos;
import br.com.senac.projetointegradordb.Militar;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoDefinirPorcentagem {
    
    public static float definir(Militar militar){
        DependenteServicos depServico = new DependenteServicos();
        int qtdDep = depServico.contarDependente(militar);
        float porcentagem;
        if(qtdDep == 0){
            porcentagem = (float) 50.00;
        }else if(qtdDep > 0 && qtdDep < 3){
            porcentagem = (float) 75.00;
        }else{
            porcentagem = (float) 100.00;
        }
        return porcentagem;
    }
    
}
