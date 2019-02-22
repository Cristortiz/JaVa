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
public class ejercicio1_prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        int prestamo = 10000;
        float interes = (float) 0.27;
        float monto_cabal = 0;
        int años = 0;
        
        System.out.println("El prestamo concedido es:  Q"+prestamo );
        monto_cabal = prestamo * interes;
        System.out.println("El monto total a pagar es de:  Q"+monto_cabal );    
    }
    
}
