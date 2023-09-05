
package RegraNegocios;

import com.myproject.modelo.Contracheque;


/**
 *
 * @author biancamarques
 */
public class Previdencia implements Tributos {
    
    private static float valorPrevidencia;
    private static final float aliquota = (float) 0.10;

    @Override
    public float descontar(Contracheque contracheque){
        float baseCalculo = contracheque.getSubsidio();
        valorPrevidencia = baseCalculo * aliquota;
        return valorPrevidencia;
    }
    
    @Override
    public float getAliquota(){
        return aliquota;
    }
    
}
