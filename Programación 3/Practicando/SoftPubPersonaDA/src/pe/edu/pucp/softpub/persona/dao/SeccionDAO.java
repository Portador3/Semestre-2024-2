package pe.edu.pucp.softpub.persona.dao;

import java.util.ArrayList;
import pe.edu.pucp.softpub.persona.model.Seccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author pablo
 */


public interface SeccionDAO {
    public Integer insertar(Seccion seccion);
    public Integer modificar(Seccion seccion);
    public Integer eliminar(Seccion seccion);
    public ArrayList<Seccion> listarTodos();
    public Seccion obtenerPorId(String idSeccion);
}
