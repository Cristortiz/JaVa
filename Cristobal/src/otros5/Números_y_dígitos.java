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
public class Números_y_dígitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        int numero = 0;
    
        System.out.println("Ingrese un numero entre 0 y 9999 para saber cuantos dígitos tiene:");
        numero = ingresar.nextInt();
 
        if(numero >= 0 && numero < 10)
        {
            System.out.println("Su número tiene un dígito");
        }
        else if(numero >= 10 && numero < 100)
        {
            System.out.println("Su número tiene dos dígitos");
        }
        else if(numero >= 100 && numero < 1000)
        {
            System.out.println("Su número tiene tres dígitos");
        }
        else if(numero >= 1000 && numero < 10000)
        {
            System.out.println("Sú numero tiene cuatro dígitos");
        }
        else
        {
            System.out.println("Por favor ingrese lo solicitado Suripanto!!!!!");
        }    
            
    }
    
}
