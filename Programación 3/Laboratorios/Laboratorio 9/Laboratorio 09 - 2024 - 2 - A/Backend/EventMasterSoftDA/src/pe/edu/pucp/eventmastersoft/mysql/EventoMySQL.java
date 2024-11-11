package pe.edu.pucp.eventmastersoft.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import pe.edu.pucp.eventmastersoft.config.DBManager;
import pe.edu.pucp.eventmastersoft.dao.EventoDAO;
import pe.edu.pucp.eventmastersoft.model.Evento;
import pe.edu.pucp.eventmastersoft.model.Productora;
import java.sql.Types;

public class EventoMySQL implements EventoDAO{

    private ResultSet rs;
    
    @Override
    public int insertar(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Evento> listarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Evento obtenerPorId(int idEvento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
