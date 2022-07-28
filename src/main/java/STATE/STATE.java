/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package STATE;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class STATE {

    public static void main(String[] args) {
        abierto open = new abierto();
        cerrado close = new cerrado();
        puertaIOT puerta = new puertaIOT();
        menu Menu = new menu();
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        
        do{
            Menu.crearMenu();
            opcion=scan.nextInt();
            switch(opcion){
                case 1:
                    puerta.setEstado(open);
                    break;
                case 2:
                    puerta.setEstado(close);
                    break;
                case 0:
                    System.exit(0);
                    break;
              
                    
               
}
         puerta.ejecutar();
        }while(opcion!=0);
        
    }
}
