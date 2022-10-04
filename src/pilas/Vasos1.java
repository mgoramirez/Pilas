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
    private String tipoVaso;
      private Vasos siguiente;
      

    public Vasos() {
        this.tipoVaso = "";
        this.siguiente = null;
                
    }

    public String getTipoVaso() {
        return tipoVaso;
    }

    public void setTipoVaso(String tipoVaso) {
        this.tipoVaso = tipoVaso;
    }

    public Vasos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vasos siguiente) {
        this.siguiente = siguiente;
    }
  
}

