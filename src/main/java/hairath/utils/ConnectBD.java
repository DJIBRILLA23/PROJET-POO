/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hairath.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HAIRATH
 */
public class ConnectBD {
     public static Connection seConnecter(){
        try {
            System.out.println("chargement du driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        try {
            String bd_url="jdbc:mysql://localhost:3306/bd_tppoo_hdjibrilla";
            String user="haira";
            String passwd="0000";
            Connection connexion=DriverManager.getConnection(bd_url,user,passwd);
            return connexion;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
