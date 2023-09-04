
package RegraNegocios;

import br.com.senac.projetointegradordb.Contracheque;

/**
 *
 * @author davi_
 */
public interface Tributos {
    
    public float descontar(Contracheque contracheque);
    public float getAliquota();
    
}
