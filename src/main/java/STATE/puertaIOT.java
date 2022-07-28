/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STATE;

/**
 *
 * @author julia
 */
/*objeto contexto, recibe el estado en el que se encuentra*/
public class puertaIOT {
    private estado estate;
    
    public void setEstado (estado estado){
        this.estate=estado;
    }
    public void ejecutar(){
        this.estate.ejecutarAccion();
    }
}
