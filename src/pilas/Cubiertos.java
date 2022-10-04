/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author mikeu
 */
public class Cubiertos {
    private int cantidades;
    private String tipo;
    private Trastes siguiente;
    
    public Cubiertos(int cantidad, String tipo, Trastes siguiente) {
        this.cantidades = 0;
        this.tipo = tipo;
        this.siguiente = null;
    }

    public int getCantidad() {
        return cantidades;
    }

    public void setCantidad(int cantidad) {
        this.cantidades = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Trastes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Trastes siguiente) {
        this.siguiente = siguiente;
    }
    
    }
    
 
    

