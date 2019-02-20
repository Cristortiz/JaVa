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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        int desicion = 0;
        float quetzales1 = 0;
        float quetzales2 = 0;
        float dolares1 = 0;
        float dolares2 = 0;
        float tota1 = 0;
        float tota2 = 0;
        float cambio1 = 0;
        float cambio2 = 0;
        
        System.out.println("Qué desea convertir, Dolares *1*, o Quetzales *2*");
        desicion = ingresar.nextInt();
        
        if (desicion == 1)
        {
        System.out.println("Ingrese los dolares que desea convertir a quetzales:");
        dolares1 = ingresar.nextFloat();
        System.out.println("Ingrese el tipo de cambio del dolar");
        cambio1 = ingresar.nextFloat();
        tota1 = dolares1 * cambio1;
        System.out.println("los" + dolares1 + "ya convertidos serían:" + tota1 + "quetzales");
        }
        else if(desicion == 2)
        {
        System.out.println("Ingrese los quetzales que desea convertir a dolares:");
        quetzales2 = ingresar.nextFloat();
        System.out.println("Ingrese el tipo de cambio del quetzal");
        cambio2 = ingresar.nextFloat();
        tota2 = quetzales2 / cambio2;
        System.out.println("Los" + quetzales2 + "ya convertidos serian:" + tota2 + "dolares");
        }
        else
        {
        System.out.println("Lo sentimos, opción invalida");
        }
    }
    
}
