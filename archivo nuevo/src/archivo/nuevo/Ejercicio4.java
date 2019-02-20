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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        float numero = 0;
        int cuadrado = 0;    
        int cubo = 0;
        int incremento = 0;
        
        while (incremento != 5)
        {
        System.out.println("Ingrese un número para saber su cubo y cuadrado:");
        numero = ingresar.nextFloat();
        cubo = (int) (numero*numero*numero);
        cuadrado = (int) (numero * numero);
        System.out.println("El cuadrado de:" + numero + "es:" + cuadrado);
        System.out.println("El cubo de" + numero + "es:" + cubo);
        incremento++;
        }
    }
    
}
