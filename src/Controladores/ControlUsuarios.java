/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.DAOUsuarios;
import Dominio.Empleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistasproyecto.*;
/**
 *
 * @author diego
 */
public class ControlUsuarios implements ActionListener{
    Empleado empleado;
    AagregarUsuario agregar;
    Listausuarios eliminar;
    EditarUsuario modificar;

    public ControlUsuarios(Empleado empleado, AagregarUsuario agregar, Listausuarios eliminar, EditarUsuario modificar) {
        this.empleado = empleado;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        
        this.agregar.getjButton3().addActionListener(this);
        this.eliminar.getjButton1().addActionListener(this);
        this.modificar.getjButton3().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //agregar usuarios
        if (agregar.getjButton3() == evento.getSource()){
            empleado.setNombre(agregar.getjTextField4().getText());
            empleado.setApellido(agregar.getjTextField5().getText());
            empleado.setCURP(agregar.getjTextField1().getText());
            empleado.setUsuario(agregar.getjTextField2().getText());
            empleado.setContraseña(agregar.getjTextField3().getText());
            DAOUsuarios dao = new DAOUsuarios();
            try{
                dao.agregarUsuarios(empleado);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        //modificar usuarios
        if(modificar.getjButton3() == evento.getSource()){
            empleado.setNombre(modificar.getjTextField4().getText());
            empleado.setApellido(modificar.getjTextField5().getText());
            empleado.setCURP(modificar.getjTextField1().getText());
            empleado.setUsuario(modificar.getjTextField2().getText());
            empleado.setContraseña(modificar.getjTextField3().getText());
            DAOUsuarios dao = new DAOUsuarios();
            try{
                dao.modificarUsuarios(empleado);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        //eliminar usuario
        if (eliminar.getjButton1() == evento.getSource()){
             String nombre = eliminar.getCOMBOSELECCIONAR().getSelectedItem().toString();
       empleado.setNombre(nombre);
        DAOUsuarios dao = new DAOUsuarios();
       try {
           dao.eliminarUsuarios(empleado);
       }catch(Exception e){
           e.printStackTrace();
             
       }
        }
    }
}
