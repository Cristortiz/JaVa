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
public class ejercicio7_presupuestohospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float presupuesto = 0;
        float UR = (float) 0.37;
        float PED = (float) 0.42;
        float TRAU = (float) 0.21;
        float urgencias = 0;
        float pediatria = 0;
        float traumatologia = 0;
        
        System.out.print("Por favor ingrese el presupuestro del hostiptal para dividirlas: \nQ.");
        presupuesto = ingresar.nextFloat();
        
        urgencias = presupuesto * UR;
        System.out.println("El presupuesto para el area de Urgencias es de: Q."+urgencias);
        
        pediatria = presupuesto * PED;
        System.out.println("El presupuesto para el area de Pediatria es de: Q."+pediatria);
        
        traumatologia = presupuesto * TRAU;
        System.out.println("El presupuesto para el area de Traumatologia es de: Q."+traumatologia);
        
    }
    
}
