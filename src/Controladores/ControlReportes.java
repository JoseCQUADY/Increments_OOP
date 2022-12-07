/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import DAO.DAOVentas;
import Dominio.Boleto;
import Dominio.Funciones;
import Dominio.Obra;
import Dominio.Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistasproyecto.ComprarBoletos;
import vistasproyecto.ConfirmarPago;
import vistasproyecto.GenerarReporteDiario;
import vistasproyecto.GenerarReporteMensual;
import vistasproyecto.GenerarReportes;
import vistasproyecto.INICIOBUENO;
import vistasproyecto.InicioVendedor;
import vistasproyecto.SeleccionarAsientos;
import vistasproyecto.TicketFinal;

/**
 *
 * @author diego
 */
public class ControlReportes implements ActionListener{
    Ventas ventas;
    DAOVentas daoventas;
    GenerarReporteDiario vistaReporteDiario;
    GenerarReporteMensual vistaReporteMensual;
    GenerarReportes vistaReportes;
    

    public ControlReportes(Ventas ventas, GenerarReporteDiario vistaReporteDiario, GenerarReporteMensual vistaReporteMensual, GenerarReportes vistaReportes) {
        this.ventas = ventas;
        
        this.vistaReporteDiario = vistaReporteDiario;
        this.vistaReporteMensual = vistaReporteMensual;
        this.vistaReportes = vistaReportes;
        
        this.vistaReporteDiario.getjButton5().addActionListener(this);
        this.vistaReporteDiario.getjButton1().addActionListener(this);
        this.vistaReporteDiario.getjTextField2().addActionListener(this);
        this.vistaReporteDiario.getjTextField4().addActionListener(this);
        
        this.vistaReporteMensual.getjButton5().addActionListener(this);
        this.vistaReporteMensual.getjTextField4().addActionListener(this);
        this.vistaReporteMensual.getjComboBox1().addActionListener(this);
        
        this.vistaReportes.getjButton2().addActionListener(this);
        this.vistaReportes.getjButton4().addActionListener(this);
        this.vistaReportes.getjButton5().addActionListener(this);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        //vista de menu de reportes
        if (this.vistaReportes.getjButton2() == evento.getSource()){
            this.vistaReportes.setVisible(false);
            this.vistaReporteMensual.setVisible(true);
        }
        if(this.vistaReportes.getjButton4() == evento.getSource()){
            this.vistaReportes.setVisible(false);
            this.vistaReporteDiario.setVisible(true);
        }
        if (this.vistaReportes.getjButton5() == evento.getSource()){
            Ventas venta = new Ventas();
    Obra obra = new Obra();
    Funciones funcion = new Funciones();
    Boleto boleto = new Boleto();
              INICIOBUENO m = new INICIOBUENO();
    ComprarBoletos a = new ComprarBoletos();
    ConfirmarPago b = new ConfirmarPago();
    InicioVendedor c = new InicioVendedor();
    TicketFinal d = new TicketFinal();
    SeleccionarAsientos e = new SeleccionarAsientos();
    ControlVentas controlventas= new ControlVentas(venta, boleto, obra, funcion, c, m, a, b ,d,e);
            this.vistaReportes.setVisible(false);
            
            c.setVisible(true);
            controlventas.llenarObras();
            controlventas.llenarfunciones();
            
        }
        
        if (this.vistaReporteDiario.getjButton5() == evento.getSource()){
            this.vistaReporteDiario.setVisible(false);
            this.vistaReportes.setVisible(true);
        }
        if (this.vistaReporteDiario.getjButton1() == evento.getSource()){
         
            
            
        }
        if(this.vistaReporteMensual.getjButton5() == evento.getSource()){
            this.vistaReporteMensual.setVisible(false);
            this.vistaReportes.setVisible(true);
        }
        if (this.vistaReporteMensual.getjButton1() == evento.getSource()){
           double reporte; 
            switch (vistaReporteMensual.getjComboBox1().getSelectedIndex()){
                case (0):
               reporte =  daoventas.ventasMensuales(0);
               this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (1):
                reporte =   daoventas.ventasMensuales(1);
                this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (2):
                 reporte =   daoventas.ventasMensuales(2);
                 this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (3):
                  reporte =  daoventas.ventasMensuales(3);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (4):
                  reporte =  daoventas.ventasMensuales(4);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (5):
                  reporte =  daoventas.ventasMensuales(5);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (6):
                  reporte =  daoventas.ventasMensuales(6);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (7):
                  reporte =  daoventas.ventasMensuales(7);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (8):
                   reporte = daoventas.ventasMensuales(8);
                   this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                case (9):
                   reporte = daoventas.ventasMensuales(9);
                   this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                 case (10):
                  reporte =  daoventas.ventasMensuales(10);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
                 case (11):
                  reporte =  daoventas.ventasMensuales(11);
                  this.vistaReporteMensual.getjTextField4().setText(String.valueOf(reporte));
                break;
            }
            
        }
    }
}

    
    
    
   

