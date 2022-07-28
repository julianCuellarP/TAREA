/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABSTRACT_FACTORY;

/**
 *
 * @author julia
 */
public class apartamentoFactory implements HomeFactory {

    @Override
    public construccion nuevaConstruccion() {
        return new apartamento();
    }
    
}
