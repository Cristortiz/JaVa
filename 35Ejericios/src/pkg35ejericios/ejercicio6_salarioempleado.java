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
public class ejercicio6_salarioempleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float salario = 0;
        float INCREMENTO =  (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float incre = 0;
        float descu = 0;
        float total = 0;
        
        System.out.println("Ingrese el salario para poder hacer las operaciones correspondientes:");
        salario = ingresar.nextFloat();
        incre = salario * INCREMENTO;
        descu = salario * DESCUENTO;
        total = (salario - descu) + incre;
        System.out.println("El salario total  luego de las operaciones es:\nQ."+total);
        
        
    }
    
}
