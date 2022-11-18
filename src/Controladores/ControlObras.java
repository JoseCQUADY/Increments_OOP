/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.DAOObras;
import Dominio.Obra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistasproyecto.AagregarObra;
import vistasproyecto.EditarObra;
import vistasproyecto.ListaObras;

/**
 *
 * @author diego
 */
public class ControlObras  implements ActionListener{
    Obra obras;
    AagregarObra agregar;
    ListaObras eliminar;
    EditarObra modificar;

    public ControlObras(Obra obras, AagregarObra agregar, ListaObras eliminar, EditarObra modificar) {
        this.obras = obras;
        this.agregar = agregar;
        this.eliminar = eliminar;
        this.modificar = modificar;
        
        this.agregar.getjButton3().addActionListener(this);
        this.eliminar.getjButton1().addActionListener(this);
        this.modificar.getjButton3().addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent evento){
        //agregar obras
        if (agregar.getjButton3() == evento.getSource()){
          obras.setNombre(agregar.getjTextField4().getText());
          obras.setResumen(agregar.getjTextField7().getText());
          obras.setGenero(agregar.getjTextField5().getText());
          int duracion = Integer.parseInt(agregar.getjTextField6().getText());
          obras.setDuracion(duracion);
          obras.setActor_Principal1(agregar.getjTextField1().getText());
          obras.setActor_Principal2(agregar.getjTextField2().getText());
          int precio = Integer.parseInt(agregar.getjTextField8().getText());
          obras.setPrecio_Boleto(precio);
          DAOObras dao = new DAOObras();
          try{
              dao.agregarObras(obras);
          }catch(Exception e){
                e.printStackTrace();
            }
        }
        //modificar obras
        if (modificar.getjButton3() == evento.getSource()){
          obras.setNombre(modificar.getjTextField4().getText());
          obras.setResumen(modificar.getjTextField7().getText());
          obras.setGenero(modificar.getjTextField5().getText());
          int duracion = Integer.parseInt(modificar.getjTextField6().getText());
          obras.setDuracion(duracion);
          obras.setActor_Principal1(modificar.getjTextField1().getText());
          obras.setActor_Principal2(modificar.getjTextField2().getText());
          int precio = Integer.parseInt(modificar.getjTextField8().getText());
          obras.setPrecio_Boleto(precio);
          DAOObras dao = new DAOObras();
          try{
              dao.agregarObras(obras);
          }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        if (eliminar.getjButton1() == evento.getSource()){
            String nombre = eliminar.getCOMBOSELECCIONAR().getSelectedItem().toString();
       obras.setNombre(nombre);
       DAOObras dao = new DAOObras();
       try{
           dao.eliminarObras(obras);
       }catch(Exception e){
           e.printStackTrace();
       }
        }
        
    }
   
}
