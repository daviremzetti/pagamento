
package RegraNegocios;

import br.com.senac.projetointegradordb.Contracheque;

/**
 *
 * @author biancamarques
 */
public class DescontarPrevidencia {
    
    public void descontar(Contracheque contracheque){
        float baseCalculo = contracheque.getSubsidio();
        float aliquota = (float) 0.10;
        float valorPrevidencia = baseCalculo * aliquota;
        contracheque.setIndicePrevidencia(aliquota);
        contracheque.setValorPrevidencia(valorPrevidencia);
    }
    
}
