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
public class ejercicio3_cabinainternet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float horas = 0;
        float COSTO_HORA = (float) 1.5;
        float total = 0;
        float resto = 0;
        
        System.out.println("Ingrese las horas que estarà en el café internet:");
        horas = ingresar.nextFloat();
        
        if(horas < 5)
        {
            total = horas * COSTO_HORA;
            System.out.println("EL total a pagar es de: Q."+total);
        }
        else if (horas > 5)
        {
            resto = horas -1;
            total = (float) (resto * 1.5);
            System.out.println("Se le regalar una hora gratis por exceder las 5 :-3");
            System.out.println("El total a pagar es de: Q."+total );           
        }
        else
        {
            System.out.println("Por favor ingrese lo solicitado:");
        }    
        
        

    }
    
}
