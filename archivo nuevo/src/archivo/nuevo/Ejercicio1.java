/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo.nuevo;

import java.util.Scanner;

/**
 *
 * @author Cristóbal Ortíz UwU
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float quetzales = 0;
        float dolares = 0;
        float cambio = 0;
        
        System.out.println("Ingrese la cantidad de cambio:");
        cambio = ingresar.nextFloat();
        System.out.println("Ingrese los quetzales que desea convertir");
        quetzales = ingresar.nextFloat();
        dolares = quetzales / cambio;
        System.out.println("Los dolares convertidos a quetzales son:" + dolares);
    }
    
}
