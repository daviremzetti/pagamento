
package RegraNegocios;

import br.com.senac.projetointegradordb.Contracheque;

/**
 *
 * @author biancamarques
 */
public class Previdencia {
    
    private static float valorPrevidencia;
    private static final float aliquota = (float) 0.10;
    
    private static void calcular(Contracheque contracheque){
        float baseCalculo = contracheque.getSubsidio();
        valorPrevidencia = baseCalculo * aliquota;
    }

    public static float descontar(Contracheque contracheque){
        calcular(contracheque);
        return valorPrevidencia;
    }
    
    public static float getAliquota(){
        return aliquota;
    }
    
}
