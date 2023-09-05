
package Servicos;

import DAO.EnderecoDAO;
import com.myproject.modelo.Endereco;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author davi_
 */
public class EnderecoServicosTest {

    @Mock
    private EnderecoDAO dao;
    @Mock
    private JSONObject json;
    private EnderecoServicos service;
    private String enderecoViaCep;
    private Endereco endereco = null;

    public EnderecoServicosTest() {
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
        this.service = new EnderecoServicos(dao);
        enderecoViaCep = """
                         {
                             "cep": "88070-650",
                             "logradouro": "Rua Afonso Pena",
                             "complemento": "",
                             "bairro": "Canto",
                             "localidade": "Florian\u00f3polis",
                             "uf": "SC",
                             "ibge": "4205407",
                             "gia": "",
                             "ddd": "48",
                             "siafi": "8105"
                         }""";
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrar method, of class EnderecoServicos.
     */
    @Test
    public void testCadastrarEnderecoNovo() {
        System.out.println("cadastrar endereco novo");
        service.setEndereco(enderecoViaCep);
        String cep = "88070-650";
        String numero = "722";
        Mockito.when(dao.consultar(cep, numero)).thenReturn(null);
        endereco = service.cadastrar(cep, numero);
        Mockito.verify(dao).cadastrar(endereco);
    }
    
    @Test
    public void testCadastrarEnderecoJaExistente() {
        System.out.println("cadastrar endereco já existente");
        String cep = "88070-650";
        String numero = "722";
        Endereco novoEnd = new Endereco();
        novoEnd.setCep(cep);
        novoEnd.setNumero(numero);
        Mockito.when(dao.consultar(cep, numero)).thenReturn(novoEnd);
        endereco = service.cadastrar(cep, numero);
        Mockito.verifyNoMoreInteractions(json);
    }
}
