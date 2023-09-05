package Servicos;

import DAO.ContrachequeDAO;
import com.myproject.modelo.Contracheque;
import com.myproject.modelo.Militar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author davi_
 */
public class ContrachequeServicosTest {

    @Mock
    private ContrachequeDAO dao;
    private ContrachequeServicos service;
    private static final String matricula = "111.111-1";
    private static final LocalDate data = LocalDate.now();

    public ContrachequeServicosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        this.service = new ContrachequeServicos(dao);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of conferirGerados method, of class ContrachequeServicos.
     */
    @Test
    public void testConferirGerados() {
        System.out.println("conferirGerados");
        Mockito.when(dao.conferirGerados(LocalDate.now())).thenReturn(conferirGerado());
        boolean result = service.conferirGerados(LocalDate.now());
        System.out.println("Quantidade: " + conferirGerado() + ". Condicao: " + result);
        assertTrue(result);
    }

    private int conferirGerado() {
        List<Contracheque> lista = listaContracheque();
        int quantidade = 0;
        for (int i = 0; i < lista.size(); i++) {
            Contracheque contracheque = lista.get(i);
            if (contracheque.getDataContracheque() != null) {
                if (contracheque.getDataContracheque().equals(data)) {
                    quantidade = quantidade + 1;
                }
            }
        }
        return quantidade;
    }

    private List<Contracheque> listaContracheque() {
        List<Contracheque> lista = new ArrayList<>();
        int quantidade = 0;
        while (quantidade < 10) {
            Contracheque cont = new Contracheque();
            if (quantidade < 1) {
                Militar militar = new Militar();
                militar.setMatricula(matricula);
                cont.setDataContracheque(data);
                cont.setMilitar(militar);
            }
            lista.add(cont);
            quantidade = quantidade + 1;
        }
        return lista;
    }
}
