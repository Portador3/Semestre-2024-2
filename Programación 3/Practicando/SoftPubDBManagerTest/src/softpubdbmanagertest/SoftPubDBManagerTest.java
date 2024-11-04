/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softpubdbmanagertest;

import java.sql.Connection;
import pe.edu.pucp.softpub.config.DBManager;

/**
 *
 * @author pablo
 */
public class SoftPubDBManagerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBManager dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        
        Connection conexion = dbManager.getConnection();
    }
    
}
