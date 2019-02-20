/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros5;

import java.util.Scanner;

/**
 *
 * @author Cristóbal Ortíz UwU
 */
public class Fechas_correcta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        
        int dia = 0;
        int mes = 0;
        int año = 0;
        
        System.out.println("Introduzca el dia:");
        dia = ingresar.nextInt();
        System.out.println("Introduzca el mes:");
        mes = ingresar.nextInt();
        System.out.println("Introduzca el año:");
        año = ingresar.nextInt();
        
        if(dia >= 1 && dia <=30)
        {
            if(mes >=1 && mes <= 12)
            {
                System.out.println("La fecha es correcta");
            }
            else
            {
                System.out.println("La fecha es incorrecta Cáncer!!!!!");
            }    
        }
        else
        {
            System.out.println("La fecha es incorrecta Cáncer!!!!!!");
        }
        
    
    }
    
}
