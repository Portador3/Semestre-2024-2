/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.pucp.observer;

/**
 *
 * @author pablo
 */
public class PeEduPucpObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Publisher publicador = new Publisher();
        Suscriber1 sus1 = new Suscriber1();
        Suscriber2 sus2 = new Suscriber2();
        
        publicador.subcribe(sus1);
        publicador.subcribe(sus2);
        
        publicador.notifySubcribers();
    }
    
}
