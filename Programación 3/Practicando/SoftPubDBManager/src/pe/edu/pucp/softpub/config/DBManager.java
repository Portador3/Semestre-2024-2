/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softpub.config;

/**
 *
 * @author pablo
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pe.edu.pucp.softpub.util.Cifrado.descifrarMD5;

public class DBManager {
    private static final String ARCHIVO_CONFIGURACION = "jdbc.properties";
    private Connection conexion;
    private String driver;
    private String tipo_de_driver;
    private String base_de_datos;
    private String nombre_del_host;
    private String puerto;
    private String usuario;
    private String contrasenha;
    private static DBManager dbManager = null;
    
    public static DBManager getInstance(){
        if(DBManager.dbManager == null){
            createInstance();
        }
        return DBManager.dbManager;
    }
    
    private static void createInstance(){
        if(DBManager.dbManager == null){
            DBManager.dbManager = new DBManager();
        }
    }
    
    public Connection getConnection(){
        leer_archivo_propiedades();
        try {
            Class.forName(this.driver);
//            this.conexion = DriverManager.getConnection(getURL(), this.usuario, descifrarMD5( this.contrasenha));
            this.conexion = DriverManager.getConnection(getURL(), "root", "510pisto8");
            System.out.println(descifrarMD5(this.contrasenha));
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conexion;
    }
    
    private String getURL(){
        String url = this.tipo_de_driver.concat("://");
        url = url.concat(this.nombre_del_host);
        url = url.concat(":");
        url = url.concat(this.puerto);
        url = url.concat("/");
        url = url.concat(this.base_de_datos);
        return url;
    }
    
    private void leer_archivo_propiedades(){
        Properties properties = new Properties();
        String nmArchivoConf = "resource/" + ARCHIVO_CONFIGURACION;
        try {
            
            
            properties.load(new FileInputStream(new File(nmArchivoConf)));
            
            this.driver = properties.getProperty("driver");
            this.tipo_de_driver = properties.getProperty("tipo_de_driver");
            this.base_de_datos = properties.getProperty("base_de_datos");
            this.nombre_del_host = properties.getProperty("nombre_de_host");
            this.puerto = properties.getProperty("puerto");
            this.usuario = properties.getProperty("usuario");
            this.contrasenha = properties.getProperty("contrasenha");
        }  catch (FileNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
