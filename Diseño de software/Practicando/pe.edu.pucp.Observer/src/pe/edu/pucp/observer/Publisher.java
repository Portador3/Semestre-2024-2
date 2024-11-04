/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.observer;

import java.util.ArrayList;
/**
 *
 * @author pablo
 */
public class Publisher {
    private ArrayList<Suscriber> suscriptores;

    public Publisher() {
        this.suscriptores = new ArrayList<Suscriber>();
    }
    
    
    
    public void subcribe(Suscriber suscriptor){
        this.suscriptores.add(suscriptor);
    }
    
    public void desuscribir(Suscriber suscriptor){
        this.suscriptores.remove(suscriptor);
    }
    
    public void notifySubcribers(){
        for(Suscriber sub: suscriptores){
            sub.update();
        }
    }
}
