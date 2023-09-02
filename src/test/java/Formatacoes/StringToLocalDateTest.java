
package Formatacoes;

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
public class StringToLocalDateTest {
    
    private String entradaUsuario;
    
    public StringToLocalDateTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        entradaUsuario = "01/01/2023";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of converter method, of class StringToLocalDate.
     */
    @Test
    public void testConverter() {
        LocalDate expResult = LocalDate.of(2023, 01, 01);
        LocalDate result = StringToLocalDate.converter(entradaUsuario);
        assertEquals(expResult, result);
    }
    
}
