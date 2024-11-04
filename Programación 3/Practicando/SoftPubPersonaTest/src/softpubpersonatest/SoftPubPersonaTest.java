/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softpubpersonatest;

import pe.edu.pucp.softpub.persona.bo.EspecialidadBO;
import pe.edu.pucp.softpub.persona.bo.SeccionBO;
import pe.edu.pucp.softpub.persona.model.Nivel;

/**
 *
 * @author pablo
 */
public class SoftPubPersonaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EspecialidadBOTest();
    }
    
    private static void SeccionBOTest(){
        SeccionBO seccionBO = new SeccionBO();
        seccionBO.modificar("INF", "Ing. Informática", "Ingeniería");
        seccionBO.modificar("TEL", "Ing. Telecomunicaciones", "Ingeniería");
        
    }
    private static void EspecialidadBOTest(){
        EspecialidadBO especialidadBO= new EspecialidadBO();
        especialidadBO.insertar(1, "Informática", "Ciencias e Ingeniería", Nivel.DOCTORADO);
    }
    
}
