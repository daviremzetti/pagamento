
package br.com.senac.projetointegradordb;

/**
 * Classe Exception campos obrigatórios
 * @author daviremzetti
 */
public class ExceptionVazio extends Exception {
    
    private String message;
    
    public ExceptionVazio(){
        this.message = "Erro no cadastro: Preencher todos os campos!";
    }
    
    public String getMessage(){
        return message;
    }
}
