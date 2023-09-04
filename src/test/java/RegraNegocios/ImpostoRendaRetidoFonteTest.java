package RegraNegocios;

import DAO.ContrachequeDAO;
import Servicos.ContrachequeServicos;
import br.com.senac.projetointegradordb.Contracheque;
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
public class ImpostoRendaRetidoFonteTest {

    ContrachequeServicos servicoCont;
    LocalDate data;

    public ImpostoRendaRetidoFonteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        
        servicoCont = new ContrachequeServicos(new ContrachequeDAO());
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pagar method, of class ImpostoRendaRetidoFonte.
     */
    @Test
    public void testPagar_primeira_faixa() {
        System.out.println("pagar_primeira_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("980.385-6", data);
        float esperado = 0.0F;
        float resultado = irrf.descontar(contracheque);
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }

    /**
     * Test of getAliquota method, of class ImpostoRendaRetidoFonte.
     */
    @Test
    public void testGetAliquota_primeira_faixa() {
        System.out.println("getAliquota_primeira_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("980.385-6", data);
        float valor = irrf.descontar(contracheque);
        float esperado = 0.0F;
        float resultado = irrf.getAliquota();
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }

    @Test
    public void testPagar_segunda_faixa() {
        System.out.println("pagar_segunda_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("935.126-8", data);
        float esperado = 10.35F;
        float resultado = irrf.descontar(contracheque);
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }

    /**
     * Test of getAliquota method, of class ImpostoRendaRetidoFonte.
     */
    @Test
    public void testGetAliquota_segunda_faixa() {
        System.out.println("pagar_segunda_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("935.126-8", data);
        float valor = irrf.descontar(contracheque);
        float esperado = 7.50F;
        float resultado = irrf.getAliquota();
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testPagar_terceira_faixa() {
        System.out.println("pagar_terceira_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("390.605-2", data);
        float esperado = 169.60F;
        float resultado = irrf.descontar(contracheque);
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testGetAliquota_terceira_faixa() {
        System.out.println("pagar_terceira_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("390.605-2", data);
        float valor = irrf.descontar(contracheque);
        float esperado = 15.0F;
        float resultado = irrf.getAliquota();
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testPagar_quarta_faixa() {
        System.out.println("pagar_quarta_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("929.252-6", data);
        float esperado = 259.52F;
        float resultado = irrf.descontar(contracheque);
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testGetAliquota_quarta_faixa() {
        System.out.println("pagar_quarta_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("929.252-6", data);
        float valor = irrf.descontar(contracheque);
        float esperado = 22.5F;
        float resultado = irrf.getAliquota();
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testPagar_quinta_faixa() {
        System.out.println("pagar_quinta_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("929.564-2", data);
        float esperado = 1218.79F;
        float resultado = irrf.descontar(contracheque);
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }
    
    @Test
    public void testGetAliquota_quinta_faixa() {
        System.out.println("pagar_quinta_faixa");
        ImpostoRendaRetidoFonte irrf = new ImpostoRendaRetidoFonte();
        data = LocalDate.of(2023, 01, 25);
        Contracheque contracheque = servicoCont.consultar("929.564-2", data);
        float valor = irrf.descontar(contracheque);
        float esperado = 27.5F;
        float resultado = irrf.getAliquota();
        float deducao = irrf.getDeducao();
        float aliquota = irrf.getAliquota();
        System.out.println("Aliquota: " + aliquota + ". Deducao: " + deducao);
        System.out.println("Esperado: " + esperado + ". Resultado: " + resultado);
        assertEquals(esperado, resultado, 0.001);
    }


}
