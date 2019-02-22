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
public class ejercicio5_descuentrofarmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        String producto = "";
        float valor = 0;
        float DESCUENTO = (float) 0.35;
        float total = 0;
        float monto = 0;
        
        System.out.println("Ingrese el producto farmaceutico a comprar:");
        producto = ingresar.next();
        System.out.println("Ingrese el valor del producto farmaceutico:");
        valor = ingresar.nextInt();
        monto = valor * DESCUENTO;
        total = valor - monto;
        System.out.println("El descuento del producto:"+producto+"es:"+monto);
        System.out.println("El total a pagar con el descuento aplicado es de:\nQ."+total);
        
        
        
    }
    
}
