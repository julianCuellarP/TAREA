/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT_FACTORY;

/**
 *
 * @author julia
 */
public class apartamento implements construccion {

    @Override
    public void numeroPisos() {
        System.out.println("el apartamento solo tiene un piso");
    }

    @Override
    public void numeroCuartos() {
        System.out.println("el apartamento tiene 3 cuartos");
       }

    @Override
    public void numeroBaños() {
        System.out.println("el apartamento tiene 2 baños");
      }
    
}
