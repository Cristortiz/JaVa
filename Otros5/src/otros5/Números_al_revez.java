/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros5;

import java.util.Scanner;

/**
 *
 * @author Cristóbal Ortíz UwU
 */
public class Números_al_revez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        int numero = 0;
        int num = 0;
        
        System.out.println("Por favor ingrese un número para mostrarlo al revéz");
        numero = ingresar.nextInt();
        
        String str = String.valueOf(numero);
        String rpta = "";
        
        char[] valor = str.toCharArray();
        
        for (int i = valor.length-1; i>-1; i--){
            rpta+= valor[i]+"";
        }
        System.out.println("El número ya al revéz seria:" + rpta);
        
        
        
        
        
    }
    
}
