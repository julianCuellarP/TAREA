/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ABSTRACT_FACTORY;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        vistamenu menu = new vistamenu();
       int opcion = 0;
        do{
           menu.crearMenu();
           opcion = scn.nextInt();
            switch(opcion){
                case 1:
                    construir(new apartamentoFactory());
                    break;
                case 2:
                    construir(new casaFactory());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("error en la digitacion");
            }
        }while(opcion!=0);
    }
    
    public static void construir (HomeFactory fabrica){
        construccion hogar = fabrica.nuevaConstruccion();
        hogar.numeroPisos();
        hogar.numeroCuartos();
        hogar.numeroBaños();
    }
}
