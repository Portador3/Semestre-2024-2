package pe.edu.pucp.eventmastersoft.logistica.mysql;
import pe.edu.pucp.eventmastersoft.logistica.dao.LocalDAO;
import pe.edu.pucp.eventmastersoft.logistica.model.Local;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pe.edu.pucp.eventmastersoft.config.DBManager;

public class LocalMySQL implements LocalDAO{

    private Connection con;
    private PreparedStatement pst;
    
    @Override
    public int insertar(Local local) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            String sql = "INSERT INTO local(nombre,direccion,capacidad,espacio_m2,tipo_local,activo) VALUES(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1,local.getNombre());
            pst.setString(2, local.getDireccion());
            pst.setInt(3, local.getCapacidad());
            pst.setDouble(4, local.getEspacioMetrosCuadrados());
            pst.setString(5, local.getTipoLocal().toString());
            pst.setBoolean(6, true);
            resultado = pst.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(SQLException ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }
    
}
