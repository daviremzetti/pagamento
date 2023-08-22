
package Exceptions;

/**
 * Classe exception campo batalhão obrigatório
 * @author daviremzetti
 */
public class ExceptionBatalhaoVazio extends Exception {
    private String message;
    
    public ExceptionBatalhaoVazio(){
        this.message = "Campo batalhão deve ser obrigatóriamente preenchido";
    }
    
    public String getMessage(){
        return message;
    }
}
