/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author DIEGO ARREOLA
 */
public abstract class Empleado {
   
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;
    private String CURP;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, String apellido, String usuario, String contraseña, String CURP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.CURP = CURP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
   
}
