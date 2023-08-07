
package br.com.senac.projetointegradordb;

import java.time.LocalDate;

/**
 * Classe pra transformar data em String no formato (dd/MM/aaaa) digitado pelo usuário
 * em LocalDate
 * @author daviremzetti
 */
public class StringToLocalDate {
    
    /**
     * Método para transformar String em LocalDate
     * @param data
     * @return 
     */
    public LocalDate converterString(String data){
        String[] separador = data.split("/");
        int ano = Integer.parseInt(separador[2]);
        int mes = Integer.parseInt(separador[1]);
        int dia = Integer.parseInt(separador[0]);
        
        LocalDate dataNova = LocalDate.of(ano, mes, dia);
        
        return dataNova;
    }
}
