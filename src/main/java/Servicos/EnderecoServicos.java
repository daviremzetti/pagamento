package Servicos;

import DAO.DAO;
import DAO.EnderecoDAO;
import Persistencia.JPA;
import br.com.senac.projetointegradordb.Endereco;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.json.JSONObject;

/**
 *
 * @author biancamarques
 */
public class EnderecoServicos {
    
    String endereco;

    public Endereco cadastrar(String numero, String cep) {
        EnderecoDAO dao = DAO.getEnderecoDAO();
        Endereco novoEndereco = dao.consultar(cep, numero);
        if (novoEndereco == null) {
            novoEndereco = new Endereco();
            JSONObject objetoJson = new JSONObject(endereco);
            novoEndereco.setLogradouro(objetoJson.getString("logradouro").toUpperCase());
            novoEndereco.setNumero(numero);
            novoEndereco.setBairro(objetoJson.getString("bairro").toUpperCase());
            novoEndereco.setCidade(objetoJson.getString("localidade").toUpperCase());
            novoEndereco.setUf(objetoJson.getString("uf").toUpperCase());
            novoEndereco.setCep(objetoJson.getString("cep"));
            dao.cadastrar(novoEndereco);  
        }
        return novoEndereco;
    }

    public Endereco consultar(String cep, String numero) {
        EntityManager em = JPA.getEntityManager();
        Endereco endereco;
        try {
            Query consulta = em.createQuery("SELECT c FROM cep c WHERE c.cep = :cep AND c.numero =: numero");
            consulta.setParameter("cep", cep);
            consulta.setParameter("numero", numero);
            endereco = (Endereco) consulta.getSingleResult();
        } catch (Exception e) {
            return null;
        }
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

}
