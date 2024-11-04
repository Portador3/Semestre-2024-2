/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softpub.persona.bo;

import pe.edu.pucp.softpub.persona.dao.EspecialidadDAO;
import pe.edu.pucp.softpub.persona.model.Especialidad;
import pe.edu.pucp.softpub.persona.model.Nivel;
import pe.edu.softpub.persona.daoImpl.EspecialidadDAOImpl;

/**
 *
 * @author pablo
 */
public class EspecialidadBO {
    private EspecialidadDAO especialidadDAO;
    
    public EspecialidadBO(){
        this.especialidadDAO = new EspecialidadDAOImpl();
    }
    public Integer insertar(Integer idEspecialidad, String nombre_especialidad, String facultad, Nivel nivel){
        Especialidad especialidad = new Especialidad(idEspecialidad, nombre_especialidad, facultad, nivel);
        return especialidadDAO.insertar(especialidad);
    }
            
}
