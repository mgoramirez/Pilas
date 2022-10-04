/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author mikeu
 */
public class Platos {
    private String tipoPlato;
    private Platos siguiente;

    public Platos() {
        this.tipoPlato = "";
        this.siguiente = null;
        
    }

    public String getTipoPlato() {
        return tipoPlato;
    }

    public void setTipoPlato(String tipoPlato) {
        this.tipoPlato = tipoPlato;
    }

    public Platos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Platos siguiente) {
        this.siguiente = siguiente;
    }
    
    }
    