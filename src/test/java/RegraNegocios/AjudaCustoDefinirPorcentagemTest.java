package RegraNegocios;

import DAO.MilitarDAO;
import Servicos.MilitarServicos;
import br.com.senac.projetointegradordb.Militar;
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
public class AjudaCustoDefinirPorcentagemTest {

    Militar militar;


    MilitarServicos servicoMil;

    public AjudaCustoDefinirPorcentagemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        servicoMil = new MilitarServicos(new MilitarDAO());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of definir method, of class AjudaCustoDefinirPorcentagem.
     */
    @Test
    public void testDefinir_0_dependente() {
        System.out.println("definir 0 dependentes");
        militar = servicoMil.buscaId(1300);
        float esperado_0_dependente = 50.0F;
        float resultado_0_dependente = AjudaCustoDefinirPorcentagem.definir(militar);
        System.out.println("Esperado: " + esperado_0_dependente + ". Resultado: " + resultado_0_dependente);
    }

    @Test
    public void testDefinir_1_dependente() {
        System.out.println("definir 1 dependentes");
        militar = servicoMil.buscaId(1280);
        float esperado_1_dependente = 75.0F;
        float resultado_1_dependente = AjudaCustoDefinirPorcentagem.definir(militar);
        System.out.println("Esperado: " + esperado_1_dependente + ". Resultado: " + resultado_1_dependente);
        assertEquals(esperado_1_dependente, resultado_1_dependente, 0);
    }

    @Test
    public void testDefinir_2_dependente() {
        System.out.println("definir 2 dependentes");
        militar = servicoMil.buscaId(1276);
        float esperado_2_dependente = 75.0F;
        float resultado_2_dependente = AjudaCustoDefinirPorcentagem.definir(militar);
        System.out.println("Esperado: " + esperado_2_dependente + ". Resultado: " + resultado_2_dependente);
    }

    @Test
    public void testDefinir_3_dependente() {
        System.out.println("definir 3 dependentes");
        militar = servicoMil.buscaId(1279);
        float esperado_3_dependente = 100.0F;
        float resultado_3_dependente = AjudaCustoDefinirPorcentagem.definir(militar);
        System.out.println("Esperado: " + esperado_3_dependente + ". Resultado: " + resultado_3_dependente);
    }

}
