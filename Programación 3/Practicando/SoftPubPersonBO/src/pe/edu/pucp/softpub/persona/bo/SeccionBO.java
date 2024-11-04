package pe.edu.pucp.softpub.persona.bo;

import pe.edu.pucp.softpub.persona.dao.SeccionDAO;
import pe.edu.pucp.softpub.persona.model.Seccion;
import pe.edu.softpub.persona.daoImpl.SeccionDAOImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pablo
 */
public class SeccionBO {
    private SeccionDAO seccionDAO;
    
    public SeccionBO(){
        this.seccionDAO = new SeccionDAOImpl();
    }
    
    public Integer insertar(String idSeccion, String nombre_seccion, String departamento){
        Seccion seccion = new Seccion(idSeccion, nombre_seccion, departamento);
        return seccionDAO.insertar(seccion);
    }
    
    public Integer modificar(String idSeccion, String nombre_seccion, String departamento){
        Seccion seccion = new Seccion(idSeccion, nombre_seccion, departamento);
        return seccionDAO.modificar(seccion);
    }
    
}
