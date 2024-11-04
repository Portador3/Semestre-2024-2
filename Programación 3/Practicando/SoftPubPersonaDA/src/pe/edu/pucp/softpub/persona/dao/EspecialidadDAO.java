/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.softpub.persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.softpub.persona.model.Especialidad;

/**
 *
 * @author pablo
 */
public interface EspecialidadDAO {
    public Integer insertar(Especialidad especialidad);
    public Integer modificar(Especialidad especialidad);
    public Integer eliminar(Especialidad especialidad);
    public ArrayList<Especialidad> listarTodos();
    public Especialidad obtenerPorId(String idSeccion);
}
