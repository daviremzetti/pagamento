package br.com.senac.projetointegradordb;

import java.time.LocalDate;

/**
 *
 * @author daviremzetti
 */
public class ProjetoIntegradorDB {

    public static void main(String[] args) {
       
        LocalDate data = LocalDate.now();
        String dataString = data.toString();
        System.out.println(dataString);
    }
}
