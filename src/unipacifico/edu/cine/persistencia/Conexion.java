/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.cine.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hernan
 */
public class Conexion {
    
    Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
    public Conexion(){
    try {
        //cargue de driver para SMBD mysql
        Class.forName("com.mysql.jdbc.Driver");
        
        //conexion a base de datos
        con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cine", "root",  "");
    }

    catch(SQLException  errorSQL){
    System.out.println("error al crear conexion:"+errorSQL.getMessage());}
    catch(ClassNotFoundException errorDriver){
    System.out.println("error al cargar el driver:"+errorDriver.getMessage());}
    
    
    }
    
    public void cerrarConexion(){
     try{  
           if (con !=null){
               con.close();
          }
           }
    catch(SQLException error){
     System.out.println("error al cerrar conexion: "+error.getMessage());
     }
    }
    
    
}
