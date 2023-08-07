
package br.com.senac.projetointegradordb;

/**
 * Classe Exception preencher somente números
 * @author remzetti
 */
public class ExceptionLotacao extends Exception{
    
    private String message;
    
    public ExceptionLotacao(){
        this.message = "Preencher campos somente com números";
    }
    
    public String getMessage(){
        return message;
    }
}
