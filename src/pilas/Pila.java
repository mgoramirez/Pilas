/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author Asus
 */
public class Pila {
    private Trastes cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    
    public void push(int tipo){
        Trastes newTraste = new Trastes();
        newTraste.setTipo(tipo);
        if (this.Vacia()){
            if(newTraste.getTipo()==3){
                this.cima = newTraste;
                this.cima.setNuevoCubierto();
            }
            this.cima = newTraste;  
        }
        else if(newTraste.getTipo()==3){
            if(this.cima.getTipo()==3){
                int anterior=this.cima.getCubierto();
                newTraste.setNuevoCubierto();
                int cantidad=anterior+newTraste.getCubierto();
                this.cima.setCantidad(cantidad);
            }
            else{
                newTraste.setSiguiente(this.cima);
                int anterior=this.cima.getCubierto();
                this.cima = newTraste;
                newTraste.setNuevoCubierto();
                int cantidad=anterior+newTraste.getCubierto();
                this.cima.setCantidad(cantidad);
            }
        }
        else if (this.cima.getTipo()==3){
                
                Trastes aux= this.cima.getSiguiente();  
                newTraste.setSiguiente(aux);
                this.cima.setSiguiente(newTraste);
                int cantidad=this.cima.getCubierto()+newTraste.getCubierto();
                this.cima.setCantidad(cantidad);
            }
        else{
            newTraste.setSiguiente(this.cima);
            this.cima = newTraste;
        }
        this.largo++;
    }
     public void listar(){
        // Crea una copia de la pila.
        Trastes aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("|\t" + aux.getTipo() +" cubiertos:"+ aux.getCubierto()+ "\t|");
            System.out.println("------------------------");
            aux = aux.getSiguiente();
        }
     }
}
  
