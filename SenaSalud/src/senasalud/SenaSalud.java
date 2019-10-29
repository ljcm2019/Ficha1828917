/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senasalud;

import java.util.Scanner;

/**
 *
 * @author sala1
 */
public class SenaSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
      Scanner nombre = new Scanner(System.in);
      System.out.println("Digite su nombre");
      nom=nombre.next();
      System.out.println("su nombres es:"+nom);
      
    }
    
}
