/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.DAOFunciones;
import Dominio.Funciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistasproyecto.AGREGARfunciones;
import vistasproyecto.editarFunciones;

/**
 *
 * @author diego
 */
public class ControlFunciones implements ActionListener {
    Funciones funcion;
    AGREGARfunciones agregar;
    editarFunciones eliminar;
    editarFunciones modificar;
     SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public ControlFunciones(Funciones funcion, AGREGARfunciones agregar, editarFunciones eliminar, editarFunciones modificar) {
        this.funcion = funcion;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        
        agregar.getjButton3().addActionListener(this);
        eliminar.getjButton2().addActionListener(this);
        modificar.getjButton3().addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evento){
        if (agregar.getjButton3() == evento.getSource()){
            funcion.setObra(agregar.getjTextField4().getText());
            int id = Integer.parseInt(agregar.getjTextField1().getText());
            funcion.setId(id);
            try {
                funcion.setFecha(formato.parse(agregar.getjTextField5().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            funcion.setHora(agregar.getjTextField6().getText());
            DAOFunciones dao = new DAOFunciones();
            try{
                dao.agregarFuncion(funcion);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if (modificar.getjButton3() == evento.getSource()){
            funcion.setObra(modificar.getjTextField5().getText());
            int id = Integer.parseInt(modificar.getCOMBOSELECCIONAR().getSelectedItem().toString());
            funcion.setId(id);
            try {
                funcion.setFecha(formato.parse(modificar.getjTextField5().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            funcion.setHora(modificar.getjTextField6().getText());
            DAOFunciones dao = new DAOFunciones();
            try{
                dao.modificarFuncion(funcion);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        if(eliminar.getjButton2() == evento.getSource()){
            int id = Integer.parseInt(modificar.getCOMBOSELECCIONAR().getSelectedItem().toString());
            funcion.setId(id);
            DAOFunciones dao = new DAOFunciones();
            try {
                dao.EliminarFuncion(funcion);
                
            }catch(Exception e){
           e.printStackTrace();
             
       }
        }
        
    }
}
