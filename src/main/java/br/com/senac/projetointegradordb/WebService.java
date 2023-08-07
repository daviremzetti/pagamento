
package br.com.senac.projetointegradordb;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/**
 *
 * @author daviremzetti
 */
public class WebService {
    
    private String dados;
    
    public String buscarCep(String cep){
        try{
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            CloseableHttpClient cliente = HttpClients.createDefault();
            HttpGet requisicao = new HttpGet(url);
            CloseableHttpResponse resposta = cliente.execute(requisicao);
            HttpEntity entidade = resposta.getEntity();
            if(entidade != null){
                dados = EntityUtils.toString(entidade);
            }
        }catch(IOException | IllegalArgumentException e){
            return null;
        }
        return dados;
    }
    
    public String getLogradouro(){
        JSONObject objetoJson = new JSONObject(dados);
        String logradouro = objetoJson.getString("logradouro");
        return logradouro;
    }
    
    public String getBairro(){
        JSONObject objetoJson = new JSONObject(dados);
        String bairro = objetoJson.getString("bairro");
        return bairro;
    }
    
    public String getCidade(){
        JSONObject objetoJson = new JSONObject(dados);
        String cidade = objetoJson.getString("localidade");
        return cidade;
    }
    
    public String getEstado(){
        JSONObject objetoJson = new JSONObject(dados);
        String uf = objetoJson.getString("uf");
        return uf;
    }
}
