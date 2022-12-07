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
    AagregarUsuario agregarusuario;
    Listausuarios listausuarios;
    EditarUsuario editarusuario;

    public ControlUsuarios(Empleado empleado, AagregarUsuario agregar, Listausuarios eliminar, EditarUsuario modificar) {
        this.empleado = empleado;
        this.agregarusuario = agregar;
        this.listausuarios = eliminar;
        this.editarusuario = modificar;
       this.agregarusuario.getjButton1().addActionListener(this);
       this.agregarusuario.getjButton3().addActionListener(this);
       
       this.listausuarios.getjButton1().addActionListener(this);
       this.listausuarios.getjButton2().addActionListener(this);
       this.listausuarios.getjButton3().addActionListener(this);
       this.listausuarios.getjButton4().addActionListener(this);
       
       this.editarusuario.getjButton3().addActionListener(this);
       this.editarusuario.getjButton4().addActionListener(this);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        //agregar usuarios
        if (this.agregarusuario.getjButton1()== evento.getSource()){
            this.agregarusuario.setVisible(false);
            this.listausuarios.setVisible(true);
        }
        if (this.agregarusuario.getjButton3() == evento.getSource()){
            empleado.setNombre(agregarusuario.getjTextField4().getText());
            empleado.setApellido(agregarusuario.getjTextField5().getText());
            empleado.setCURP(agregarusuario.getjTextField1().getText());
            empleado.setUsuario(agregarusuario.getjTextField2().getText());
            empleado.setContraseña(agregarusuario.getjTextField3().getText());
            DAOUsuarios dao = new DAOUsuarios();
            try{
                dao.agregarUsuarios(empleado);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(this.editarusuario.getjButton4() == evento.getSource()){
            this.editarusuario.setVisible(false);
            this.listausuarios.setVisible(true);
        }
        //modificar usuarios
        if(editarusuario.getjButton3() == evento.getSource()){
            empleado.setNombre(editarusuario.getjTextField4().getText());
            empleado.setApellido(editarusuario.getjTextField5().getText());
            empleado.setCURP(editarusuario.getjTextField1().getText());
            empleado.setUsuario(editarusuario.getjTextField2().getText());
            empleado.setContraseña(editarusuario.getjTextField3().getText());
            DAOUsuarios dao = new DAOUsuarios();
            try{
                dao.modificarUsuarios(empleado);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(this.listausuarios.getjButton2() == evento.getSource()){
            this.editarusuario.setVisible(true);
            this.listausuarios.setVisible(false);
            
        }
        if(this.listausuarios.getjButton3()== evento.getSource()){
            this.listausuarios.setVisible(false);
            this.agregarusuario.setVisible(true);
        }
        if(this.listausuarios.getjButton4() == evento.getSource()){
            menu m = new menu();
            this.listausuarios.setVisible(false);
            m.setVisible(true);
        }
        //eliminar usuario
        
        if (listausuarios.getjButton1() == evento.getSource()){
             String nombre = listausuarios.getCOMBOSELECCIONAR().getSelectedItem().toString();
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
