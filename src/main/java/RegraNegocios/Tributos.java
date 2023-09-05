
package RegraNegocios;

import com.myproject.modelo.Contracheque;


/**
 *
 * @author davi_
 */
public interface Tributos {
    
    public float descontar(Contracheque contracheque);
    public float getAliquota();
    
}
