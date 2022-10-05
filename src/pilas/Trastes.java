/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author Asus
 */
public class Trastes {
    private int tipo; //1=plato, 2=vaso, 3=cubiertos
    private int cubiertos;//Guarda cantidad de cubiertos
    private Trastes siguiente;
    
    //constructor para inicializar

    public Trastes() {
        this.tipo=0;
        this.cubiertos=0;
        this.siguiente = null;
    }
    public Trastes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Trastes siguiente) {
        this.siguiente = siguiente;
    }
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    public int getTipo(){
        return tipo;
    }
    
    public void setNuevoCubierto(){
        Cubiertos cuenta=new Cubiertos();
        this.cubiertos=cuenta.cuentaCubiertos();
    }
    public int getCubierto(){
        return cubiertos;
    }
    
    public void setCantidad(int numero){
        this.cubiertos=numero;
    }
}