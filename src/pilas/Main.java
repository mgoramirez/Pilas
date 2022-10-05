/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

/**
 *
 * @author Majo
 * @author Mikeu
 * 
 * Instrucciones: 
 * Trastes de una pila de un restaurante (100pts)
Se debe simular la colocación de trastes sucios para lavar. Se debe tomar en cuenta que no se pueden sacar los
trastes de abajo porque provocaría que se caigan los demás. Se pueden colocar platos y vasos, estos se pueden
colocar uno encima del otro sin ningún problema. Además, cuando se coloca alguno de estos puede venir con una
cantidad de cubiertos (tenedores, cuchillos o cucharas). Los cubiertos siempre deben estar en la cima. A
continuación, se presenta un ejemplo del comportamiento de la simulación.
1. Se coloca un vaso con 3 cubiertos de primero.
2. Se coloca un plato con 2 cubiertos, sin embargo, se deben pasar los 3 cubiertos del vaso al plato, por lo que,
al colocar el plato va a tener 5 cubiertos y el vaso 0.
3. Se coloca un plato sin cubiertos. Los cubiertos que tenía el plato anterior pasan a estar sobre este, para un
total de 5.
El resultado de esto sería de la siguiente forma:
Plato con 5 cubiertos
Plato con 0 cubiertos
Vaso con 0 cubiertos
Debe crear una estructura que le permita simular el problema presentado. Solamente se debe utilizar una estructura
para resolver el problema. La estructura debe poder almacenar toda la información necesaria. El puntaje se
distribuye de la siguiente forma:
● Creación de estructura que pueda almacenar todos los datos necesarios (10pts).
● Creación de método en la estructura que permite la inserción según el problema especificado (90pts).

 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Pila miPila = new Pila();
        //Tipo 1: Plato, tipo 2: vaso; tipo 3: cubierto
        miPila.push(2);
        miPila.push(1);  
        miPila.push(3);
        miPila.push(3);
        miPila.push(1);

        System.out.println("PILA");
        miPila.listar();        
    }
    
}
