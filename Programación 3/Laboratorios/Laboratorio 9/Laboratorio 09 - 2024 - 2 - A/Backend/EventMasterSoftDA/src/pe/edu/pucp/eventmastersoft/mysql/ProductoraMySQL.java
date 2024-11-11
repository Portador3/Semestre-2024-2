package pe.edu.pucp.eventmastersoft.mysql;
import java.util.ArrayList;
import pe.edu.pucp.eventmastersoft.dao.ProductoraDAO;
import pe.edu.pucp.eventmastersoft.model.Productora;
import pe.edu.pucp.eventmastersoft.config.DBManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoraMySQL implements ProductoraDAO{

    private ResultSet rs;
    
    @Override
    public ArrayList<Productora> listarTodas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
