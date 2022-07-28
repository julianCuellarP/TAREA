/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT_FACTORY;

/**
 *
 * @author julia
 */
public class Casa implements construccion{

    @Override
    public void numeroPisos() {
      System.out.println("la casa tiene 3 pisos");
    }

    @Override
    public void numeroCuartos() {
        System.out.println("la casa tiene 4 cuartos");
     }

    @Override
    public void numeroBaños() {
        System.out.println("la casa tiene 3 baños");
      }
    
    
}
