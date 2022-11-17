/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Controladores.*;
import Dominio.*;
import vistasproyecto.*;
/**
 *
 * @author DIEGO ARREOLA
 */
public class MainTeatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu m = new menu();
        Empleado empleado = new Administrador();
         AagregarUsuario agregar = new AagregarUsuario();
    Listausuarios eliminar = new Listausuarios();
    EditarUsuario modificar = new EditarUsuario();
    ControlUsuarios usuarios = new ControlUsuarios(empleado, agregar, eliminar, modificar);
    m.setVisible(true);
    }
    
}
