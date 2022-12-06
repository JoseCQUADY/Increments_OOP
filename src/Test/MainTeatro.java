/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Controladores.*;
import DAO.DAOAsientos;
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
        INICIOBUENO m = new INICIOBUENO();
        Empleado empleado = new Administrador();
         AagregarUsuario agregar = new AagregarUsuario();
    Listausuarios eliminar = new Listausuarios();
    EditarUsuario modificar = new EditarUsuario();
    ControlUsuarios usuarios = new ControlUsuarios(empleado, agregar, eliminar, modificar);
    m.setVisible(true);
    
        DAOAsientos dao = new DAOAsientos();
        for(int i = 0; i<6; i++){
            for (int j = 0; i <3;i++){
                System.out.println("Asiento: " + i + j + dao.getasientos().get(0).getAsiento_A()[i][j]);
            }
        }
        
    }
    
    
    
}
