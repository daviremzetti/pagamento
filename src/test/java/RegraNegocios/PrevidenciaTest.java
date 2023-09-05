
package RegraNegocios;

import DAO.ContrachequeDAO;
import Servicos.ContrachequeServicos;
import com.myproject.modelo.Contracheque;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davi_
 */
public class PrevidenciaTest {
    
    Previdencia previdencia;
    ContrachequeServicos servicoCont;
    Contracheque contracheque;
    LocalDate data;
    
    public PrevidenciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        previdencia = new Previdencia();
        servicoCont = new ContrachequeServicos(new ContrachequeDAO());
        data = LocalDate.of(2023, 01, 25);
        contracheque = servicoCont.consultar("929.564-2", data);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of descontar method, of class Previdencia.
     */
    @Test
    public void testDescontar() {
        System.out.println("descontar");
        float expResult = 850.0F;
        float result = previdencia.descontar(contracheque);
        System.out.println("Esperado: " + expResult + " .Resultado: " + result);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getAliquota method, of class Previdencia.
     */
    @Test
    public void testGetAliquota() {
        System.out.println("getAliquota");
        float expResult = 0.1F;
        float result = previdencia.getAliquota();
        System.out.println("Esperado: " + expResult + " .Resultado: " + result);
    }
    
}
