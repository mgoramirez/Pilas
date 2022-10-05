/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Cubiertos {
    private int cantidad;
    
    public Cubiertos(){
        this.cantidad=0;
    }
    public int cuentaCubiertos(){
        int nuevaCantidad=Integer.parseInt(JOptionPane.showInputDialog(
                "Introduzca cantidad:"));
        this.cantidad=nuevaCantidad;
        return cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
}
