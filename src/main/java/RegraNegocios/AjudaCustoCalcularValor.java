
package RegraNegocios;

import br.com.senac.projetointegradordb.Militar;
import br.com.senac.projetointegradordb.Movimentacao;

/**
 *
 * @author biancamarques
 */
public class AjudaCustoCalcularValor {
    
    public static float definir(Militar militar, Movimentacao mov) {
        float subsidio = militar.getPostoGraduacao().getSalario();
        float porcentagem = mov.getPorcentagem();
        float valorAjudaCusto = subsidio * porcentagem / 100;
        return valorAjudaCusto;
    }

}
