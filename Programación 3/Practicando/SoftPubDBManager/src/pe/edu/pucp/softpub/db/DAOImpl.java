/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softpub.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.softpub.config.DBManager;

/**
 *
 * @author pablo
 */
public abstract class DAOImpl {
    protected String nombre_tabla;
    protected Connection conexion;
    protected Statement statement;
    protected ResultSet resultSet;
    
    public DAOImpl(String nombre_tabla){
        this.nombre_tabla = nombre_tabla;
    }
    
    protected void iniciarTransaccion() throws SQLException{
        this.conexion  = DBManager.getInstance().getConnection();
        this.conexion.setAutoCommit(false);
    }
    
    public Integer insertar() {
        Integer resultado = 0;
        try {
            
            this.iniciarTransaccion();
            String sql = this.generarSQLParaInsercion();
            resultado = this.ejecutarModificacionesEnBD(sql);
            this.commitarTransaccion();
        } catch (SQLException ex) {
            
            try {
                this.rollBackTransaccion();
            } catch (SQLException ex1) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }

        } finally{
            try {
                this.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return resultado;
    }
    
    private String generarSQLParaInsercion(){
        String sql = "insert into ";
        sql = sql.concat(this.nombre_tabla);
        sql = sql.concat(" (");
        sql = sql.concat(this.obtenerListaAtributosParaInsertar());
        sql = sql.concat(") values (");
        sql = sql.concat(this.obtenerListaValoresParaInsertar());
        sql = sql.concat(")");
        return sql;
    }

    private Integer ejecutarModificacionesEnBD(String sql) throws SQLException {
        this.statement = this.conexion.createStatement();
        return this.statement.executeUpdate(sql);
    }

    private void commitarTransaccion() throws SQLException {
        this.conexion.commit();
    }

    private void rollBackTransaccion() throws SQLException {
        if(this.conexion != null)
        this.conexion.rollback();
    }

    private void cerrarConexion() throws SQLException {
        if(this.conexion != null)
            this.conexion.close();
    }

    protected abstract String obtenerListaAtributosParaInsertar();

    protected abstract String obtenerListaValoresParaInsertar();
}
