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
public class Administrador extends Empleado {

    public Administrador(){
        
    }
    public Administrador(String nombre, String apellido, String usuario, String contraseña, String CURP){
        
       super(nombre, apellido, usuario, contraseña, CURP);
    }
    
}
