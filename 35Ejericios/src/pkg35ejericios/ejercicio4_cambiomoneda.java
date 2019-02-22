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
public class ejercicio4_cambiomoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float bolivares = 0;
        float DOLARES = 2150;
        float EUROS = (float) 3117.50;
        float cambio = 0;
        int opcion = 0;
        System.out.println("Ingrese que desea cambiar \n1.Dolares\n2.Euros\n\nEscoja su opción:");
        opcion = ingresar.nextInt();
        
        if(opcion == 1)
        {
            System.out.println("Conversor de Bolivares Venezolanos a Dolares");
            System.out.println("Ingrese los Bolivares que desea convertir:");
            bolivares = ingresar.nextFloat();
            cambio = bolivares / DOLARES;
            
            System.out.println("Su cambio de: Bs"+bolivares + "bolivares a Dolares es:");
            System.out.println("$"+cambio + "Dolares");
        }
        else if(opcion == 2)
        {
            System.out.println("Conversor de Bolivares Venezolanos a Euros");
            System.out.println("Ingrese los Bolivares que desea convertir:");
            bolivares = ingresar.nextFloat();
            cambio = bolivares / EUROS;
            
            System.out.println("Su cambio de: Bs"+bolivares + "bolivares a Euros es:");
            System.out.println("$"+cambio + "Euros");
        }
        else
        {
            System.out.println("Por favor ingrese lo solicitado");
        }    
    }
    
}
