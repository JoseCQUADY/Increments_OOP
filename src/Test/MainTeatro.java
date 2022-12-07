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
//        Empleado empleado = new Administrador();
//         AagregarUsuario agregar = new AagregarUsuario();
//    Listausuarios eliminar = new Listausuarios();
//    EditarUsuario modificar = new EditarUsuario();
//    ControlUsuarios usuarios = new ControlUsuarios(empleado, agregar, eliminar, modificar);
//  m.setVisible(true);
    
    Obra obra = new Obra();
    Funciones funcion = new Funciones();
    Boleto boleto = new Boleto();
    Ventas venta = new Ventas();
   
       INICIOBUENO m = new INICIOBUENO();
    ComprarBoletos a = new ComprarBoletos();
    ConfirmarPago b = new ConfirmarPago();
    InicioVendedor c = new InicioVendedor();
    TicketFinal d = new TicketFinal();
    SeleccionarAsientos e = new SeleccionarAsientos();
    ControlVentas controlventas= new ControlVentas(venta, boleto, obra, funcion, c, m, a, b ,d,e);
       m.setVisible(true);
        
    }
    
    
    
}
