/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.softpub.persona.daoImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softpub.config.DBManager;
import pe.edu.pucp.softpub.db.DAOImpl;
import pe.edu.pucp.softpub.persona.dao.EspecialidadDAO;
import pe.edu.pucp.softpub.persona.model.Especialidad;

/**
 *
 * @author pablo
 */
public class EspecialidadDAOImpl extends DAOImpl implements EspecialidadDAO{
    private Especialidad especialidad;
    public EspecialidadDAOImpl() {
        super("Especialidad");
        especialidad = null;
    }
    
    @Override
    public Integer insertar(Especialidad especialidad) {
        this.especialidad = especialidad;
        return this.insertar();
    }
    
    @Override
    protected String obtenerListaAtributosParaInsertar() {
        return "idEspecialidad, especialidad, facultad, nivel";
    }

    @Override
    protected String obtenerListaValoresParaInsertar() {
        String sql = "";
        sql = sql.concat(especialidad.getIdEspecialidad().toString());
        sql = sql.concat(",");
        sql = sql.concat("'" + especialidad.getEspecialidad() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + especialidad.getFacultad() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + especialidad.getNivel().toString() + "'");
        return sql;
        
    }

    @Override
    public Integer modificar(Especialidad especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer eliminar(Especialidad especialidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Especialidad> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Especialidad obtenerPorId(String idSeccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

    
    
}
