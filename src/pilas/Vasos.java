/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author mikeu
 */
public class Vasos {
    private int cantidad;
    private Trastes siguiente;
    Cubiertos cubiertos;

    public Vasos(int cantidad, Trastes siguiente) {
        this.cantidad = 0;
        this.siguiente = null;
        this.cubiertos = new Cubiertos();
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Trastes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Trastes siguiente) {
        this.siguiente = siguiente;
    }

    public Cubiertos getCubiertos() {
        return cubiertos;
    }

    public void setCubiertos(Cubiertos cubiertos) {
        this.cubiertos = cubiertos;
    }
    
    
}
