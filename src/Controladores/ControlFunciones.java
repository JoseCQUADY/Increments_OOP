/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.DAOFunciones;
import DAO.DAOObras;
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
    AGREGARfunciones agregarfunciones;
    editarFunciones editarfunciones;
    
     SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public ControlFunciones(Funciones funcion, AGREGARfunciones agregar, editarFunciones eliminar) {
        this.funcion = funcion;
        this.agregarfunciones = agregar;
        this.editarfunciones = eliminar;
        
       this.agregarfunciones.getjButton4().addActionListener(this);
        this.agregarfunciones.getJComboBox2().addActionListener(this);
       this.agregarfunciones.getJComboBox3().addActionListener(this);
        this.agregarfunciones.getjButton3().addActionListener(this);
        
        this.editarfunciones.getjButton1().addActionListener(this);
        this.editarfunciones.getjButton11().addActionListener(this);
        this.editarfunciones.getjButton3().addActionListener(this);
        this.editarfunciones.getjButton2().addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent evento){
        if (agregarfunciones.getjButton3() == evento.getSource()){
            DAOObras dao2 = new DAOObras();
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         Funciones  funcion = new Funciones();
            funcion.setObra((String) agregarfunciones.getJComboBox2().getSelectedItem());
            int id = Integer.parseInt(agregarfunciones.getjTextField1().getText());
            funcion.setId(id);
            try {
                funcion.setFecha(formato.parse(agregarfunciones.getjTextField5().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            funcion.setHora((String) agregarfunciones.getJComboBox3().getSelectedItem());
            DAOFunciones dao = new DAOFunciones();
            try{
                dao.agregarFuncion(funcion);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        if (editarfunciones.getjButton3() == evento.getSource()){
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Funciones funcion = new Funciones();
        funcion.setObra((String) editarfunciones.getEF_Obra().getSelectedItem());
            int id = Integer.parseInt(editarfunciones.getEF_SeleccionarFuncion().getSelectedItem().toString());
            funcion.setId(id);
            try {
                funcion.setFecha(formato.parse(editarfunciones.getjTextField7().getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ControlFunciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            funcion.setHora((String) editarfunciones.getEF_Horario().getSelectedItem());
            DAOFunciones dao = new DAOFunciones();
            try{
                dao.modificarFuncion(funcion);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        if(editarfunciones.getjButton2() == evento.getSource()){
            int id = Integer.parseInt(editarfunciones.getCOMBOSELECCIONAR().getSelectedItem().toString());
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
