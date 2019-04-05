/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.cine.logica;

/**
 *
 * @author hernan
 */
public class Actor {
    
    private Integer idActor;
    private String nombreActor;
    private String  fechaNacimiento;
    private String ciudadNacimiento;

    public Actor(Integer idActor, String nombreActor, String fechaNacimiento, String ciudadNacimiento) {
        this.idActor = idActor;
        this.nombreActor = nombreActor;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public Actor(){}
    
    public Integer getIdActor() {
        return idActor;
    }

    public void setIdActor(Integer idActor) {
        this.idActor = idActor;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }
    
    
    
}
