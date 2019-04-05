/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.cine.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import unipacifico.edu.cine.logica.Actor;

/**
 *
 * @author hernan
 */
public class ActorDAO {
    
 public void insertarActor(Actor actor) throws SQLException{
 
  Conexion conector=new Conexion();


     PreparedStatement insertor=
    conector.getCon().prepareStatement("insert into actor values( ?, ?, ?, ?)");
   
     insertor.setNull(1, Types.NULL);
     insertor.setString(2, actor.getNombreActor());
     insertor.setString(3, actor.getFechaNacimiento());
     insertor.setString(4, actor.getCiudadNacimiento());
// ejecutor de consulta
   insertor.executeUpdate();
   
   conector.cerrarConexion();
  
 
 }   
 
 public void actualizarActor(Actor actor) throws SQLException{
 
   Conexion conector=new Conexion();
     PreparedStatement actualizador=conector.getCon().
    prepareStatement("update actor set  ciudad_nacimiento=? "
            + "Where  id_actor=?");
     
   actualizador.setString(1, actor.getCiudadNacimiento());
   actualizador.setInt(2, actor.getIdActor());
   
   actualizador.executeUpdate();
   conector.cerrarConexion();
   
  }
 
 public void eliminarActor(Actor actor)throws SQLException{
 
 Conexion conector=new Conexion();
 
 PreparedStatement borrador=conector.getCon().prepareStatement(
         "delete from actor where id_actor=?");
 
 borrador.setInt(1, actor.getIdActor());
 borrador.executeUpdate();
 conector.cerrarConexion();
 }
    
 
 public List<Actor> conseguirActor() throws SQLException{
 
 List<Actor> listaActores=new ArrayList<Actor>();
 
 Conexion conectar=new Conexion();
 PreparedStatement consultor=conectar.getCon().
         prepareStatement("select * from actor");
 
 ResultSet filas=consultor.executeQuery();
 
 while(filas.next()){
   
     Actor actor= new Actor();
     
     actor.setIdActor(filas.getInt("id_actor"));
     actor.setNombreActor(filas.getString("nombre_actor"));
     actor.setFechaNacimiento(filas.getString("fecha_nacimiento"));
     actor.setCiudadNacimiento(filas.getString("ciudad_nacimiento"));
     
     listaActores.add(actor);
 }
 
 return listaActores;
 }
}
