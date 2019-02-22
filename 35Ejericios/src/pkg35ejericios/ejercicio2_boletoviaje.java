/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35ejericios;

import java.util.Scanner;

/**
 *
 * @author Cristóbal Ortíz UwU
 */
public class ejercicio2_boletoviaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);

        float kilomentros = 0;
        float PRECIO = (float) 10.50;
        float total = 0;
        
        System.out.println("Ingrese los kilometro a recorrer:");
        int kilometros = ingresar.nextInt();
        total = PRECIO * kilometros;
        
        System.out.println("El precio del boleto es: Q."+ total);
        
        
        
                
    }
    
}
