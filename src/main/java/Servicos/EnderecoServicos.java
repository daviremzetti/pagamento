package Servicos;

import DAO.EnderecoDAO;
import br.com.senac.projetointegradordb.Endereco;
import org.json.JSONObject;

/**
 *
 * @author biancamarques
 */
public class EnderecoServicos {
    
    private EnderecoDAO dao;
    private String endereco;
    
    public EnderecoServicos(EnderecoDAO dao){
        this.dao = dao;
    }

    public Endereco cadastrar(String cep, String numero) {
       
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
        return dao.consultar(cep, numero);
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
