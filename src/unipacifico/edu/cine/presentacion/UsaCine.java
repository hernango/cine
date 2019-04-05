/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.cine.presentacion;


import java.sql.SQLException;
import java.util.List;
import unipacifico.edu.cine.logica.Actor;
import unipacifico.edu.cine.persistencia.ActorDAO;


/**
 *
 * @author hernan
 */
public class UsaCine {
    
  public static void main(String []a){
  
      ActorDAO dao=new ActorDAO();
            
      try{
          List<Actor> lista= dao.conseguirActor();
        
       for (Actor actor:lista){
        System.out.println(
        actor.getIdActor()+"," + actor.getNombreActor() +", " 
        +actor.getFechaNacimiento() +"," +actor.getCiudadNacimiento());  
          
          
          }
      }
      
      catch(SQLException error)
      {
      System.out.println("no se ha podido eliminar actor");
      }
      
  }
  
  
 


  
    
}
