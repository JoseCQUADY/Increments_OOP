/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import DAO.DAOFunciones;
import DAO.DAOObras;
import Dominio.Boleto;
import Dominio.Funciones;
import Dominio.Obra;
import Dominio.Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import vistasproyecto.*;
/**
 *
 * @author diego
 */
public class ControlVentas implements ActionListener{
    Ventas ventas;
    Boleto boleto;
    Obra obra;
    Funciones funcion;
    InicioVendedor inicioVendedor;
    INICIOBUENO iniciosesion;
    ComprarBoletos compraboletos;
    ConfirmarPago confirmarpago;
    TicketFinal ticket;
    SeleccionarAsientos seleccionasientos;
    GenerarReportes generarreportemenu;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    menu m = new menu();
    public ControlVentas(Ventas ventas, Boleto boleto, Obra obra, Funciones funcion, InicioVendedor inicioVendedor, INICIOBUENO iniciosesion, ComprarBoletos compraboletos, ConfirmarPago confirmarpago, TicketFinal ticket, SeleccionarAsientos seleccionasientos) {
        this.ventas = ventas;
        this.boleto = boleto;
        this.obra = obra;
        this.funcion = funcion;
        this.inicioVendedor = inicioVendedor;
        this.iniciosesion = iniciosesion;
        this.compraboletos = compraboletos;
        this.confirmarpago = confirmarpago;
        this.ticket = ticket;
        this.seleccionasientos = seleccionasientos;
        
        this.inicioVendedor.getjButton2().addActionListener(this);
        this.inicioVendedor.getjButton3().addActionListener(this);
        this.inicioVendedor.getjButton5().addActionListener(this);
        
        this.iniciosesion.getjButton1().addActionListener(this);
        this.iniciosesion.getjTextField1().addActionListener(this);
        this.iniciosesion.getjPasswordField1().addActionListener(this);
        
        this.seleccionasientos.getjButton1().addActionListener(this);
        this.seleccionasientos.getjButton2().addActionListener(this);
        this.seleccionasientos.getjToggleButton1().addActionListener(this);
         this.seleccionasientos.getjToggleButton2().addActionListener(this);
          this.seleccionasientos.getjToggleButton3().addActionListener(this);
           this.seleccionasientos.getjToggleButton4().addActionListener(this);
            this.seleccionasientos.getjToggleButton5().addActionListener(this);
             this.seleccionasientos.getjToggleButton6().addActionListener(this);
              this.seleccionasientos.getjToggleButton7().addActionListener(this);
               this.seleccionasientos.getjToggleButton8().addActionListener(this);
                this.seleccionasientos.getjToggleButton9().addActionListener(this);
                 this.seleccionasientos.getjToggleButton10().addActionListener(this);
                  this.seleccionasientos.getjToggleButton11().addActionListener(this);
                   this.seleccionasientos.getjToggleButton12().addActionListener(this);
                    this.seleccionasientos.getjToggleButton13().addActionListener(this);
                     this.seleccionasientos.getjToggleButton14().addActionListener(this);
                      this.seleccionasientos.getjToggleButton15().addActionListener(this);
                       this.seleccionasientos.getjToggleButton16().addActionListener(this);
                        this.seleccionasientos.getjToggleButton17().addActionListener(this);
                         this.seleccionasientos.getjToggleButton18().addActionListener(this);
                          this.seleccionasientos.getjToggleButton19().addActionListener(this);
                           this.seleccionasientos.getjToggleButton20().addActionListener(this);
                            this.seleccionasientos.getjToggleButton21().addActionListener(this);
                             this.seleccionasientos.getjToggleButton22().addActionListener(this);
                              this.seleccionasientos.getjToggleButton23().addActionListener(this);
                               this.seleccionasientos.getjToggleButton24().addActionListener(this);
                                this.seleccionasientos.getjToggleButton25().addActionListener(this);
                                this.seleccionasientos.getjToggleButton26().addActionListener(this);
                                this.seleccionasientos.getjToggleButton41().addActionListener(this);
         this.seleccionasientos.getjToggleButton32().addActionListener(this);
          this.seleccionasientos.getjToggleButton33().addActionListener(this);
           this.seleccionasientos.getjToggleButton34().addActionListener(this);
            this.seleccionasientos.getjToggleButton35().addActionListener(this);
             this.seleccionasientos.getjToggleButton36().addActionListener(this);
              this.seleccionasientos.getjToggleButton37().addActionListener(this);
               this.seleccionasientos.getjToggleButton38().addActionListener(this);
                this.seleccionasientos.getjToggleButton39().addActionListener(this);
        this.seleccionasientos.getjToggleButton31().addActionListener(this);
         this.seleccionasientos.getjToggleButton1().addActionListener(this);
         this.seleccionasientos.getjToggleButton27().addActionListener(this);
          this.seleccionasientos.getjToggleButton28().addActionListener(this);
           this.seleccionasientos.getjToggleButton29().addActionListener(this);
            this.seleccionasientos.getjToggleButton40().addActionListener(this);
           
        
                          
                
              
        this.compraboletos.getjButton1().addActionListener(this);
        this.compraboletos.getjButton2().addActionListener(this);
        this.compraboletos.getjButton3().addActionListener(this);
        this.compraboletos.getjTextField3().addActionListener(this);
        this.compraboletos.getjTextField4().addActionListener(this);
        this.compraboletos.getCOMBOSELECCIONAR().addActionListener(this);
        this.compraboletos.getCOMBOSELECCIONAR1().addActionListener(this);
        
        this.confirmarpago.getjButton2().addActionListener(this);
        this.confirmarpago.getjButton3().addActionListener(this);
        this.confirmarpago.getjButton4().addActionListener(this);
        this.confirmarpago.getjTextField1().addActionListener(this);
        this.confirmarpago.getjTextField7().addActionListener(this);
        this.confirmarpago.getjTextField3().addActionListener(this);
        this.confirmarpago.getjTextField4().addActionListener(this);
        this.confirmarpago.getjTextField5().addActionListener(this);
        this.confirmarpago.getjTextField6().addActionListener(this);
        this.confirmarpago.getjTextField8().addActionListener(this);
        this.confirmarpago.getjTextField9().addActionListener(this);
        
        this.ticket.getjButton3().addActionListener(this);
        this.ticket.getjButton4().addActionListener(this);
        
         
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
      //iniciovendedor
        if (this.inicioVendedor.getjButton2() == evento.getSource()){
            this.inicioVendedor.setVisible(false);
            this.compraboletos.setVisible(true);
            llenarObras();
            llenarfunciones();
            
        }
        if (this.inicioVendedor.getjButton3() == evento.getSource()){
            Ventas venta = new Ventas();
    GenerarReporteDiario vistaReporteDiario = new GenerarReporteDiario();
    GenerarReporteMensual vistaReporteMensual = new GenerarReporteMensual();
    GenerarReportes vistaReportes = new GenerarReportes();
    ControlReportes controlreportes = new ControlReportes(venta, vistaReporteDiario, vistaReporteMensual, vistaReportes);
            this.inicioVendedor.setVisible(false);
            vistaReportes.setVisible(true);
        }
        if (this.inicioVendedor.getjButton5() == evento.getSource()){
            this.inicioVendedor.setVisible(false);
            this.m.setVisible(true);
            
        }
        //inicio de sesion
        if (this.iniciosesion.getjButton1() == evento.getSource()){
            
        }
        
        //comprar boletos
        if (this.compraboletos.getjButton2() == evento.getSource()){
          this.compraboletos.setVisible(false);
          this.inicioVendedor.setVisible(true);
          
        }
        if (this.compraboletos.getjButton3() == evento.getSource()){
            this.compraboletos.setVisible(false);
            this.seleccionasientos.setVisible(true);
        }
        if (this.compraboletos.getjButton1() == evento.getSource()){
            DAOObras dao = new DAOObras();
             for (int i = 0; i< dao.getobras().size(); i++){
           if (this.compraboletos.getCOMBOSELECCIONAR1().getSelectedItem().equals(dao.getobras().get(i).getNombre())){
             double pago =  this.compraboletos.getjSpinner1().getHeight() * dao.getobras().get(i).getPrecio_Boleto();
             this.compraboletos.getjTextField4().setText(String.valueOf(pago));
           }
         
             }
        }
        if (this.compraboletos.getCOMBOSELECCIONAR1() == evento.getSource()){
            llenarfunciones();
        }
        if (this.confirmarpago.getjButton2() == evento.getSource()){
            this.confirmarpago.setVisible(false);
            this.compraboletos.setVisible(true);
            
        }
        
        if (this.confirmarpago.getjButton3() == evento.getSource()){
            this.confirmarpago.setVisible(false);
            this.ticket.setVisible(true);
        }
        if(this.confirmarpago.getjButton4() == evento.getSource()){
            this.confirmarpago.setVisible(false);
            this.inicioVendedor.setVisible(true);
        }
        if(this.seleccionasientos.getjButton1() == evento.getSource()){
            this.confirmarpago.setVisible(true);
            this.seleccionasientos.setVisible(false);
        }
        if(this.seleccionasientos.getjButton2() == evento.getSource()){
            this.compraboletos.setVisible(true);
            this.seleccionasientos.setVisible(false);
        }
        if (this.ticket.getjButton4() == evento.getSource()){
            this.ticket.setVisible(false);
            System.exit(0);
        }
        if (this.ticket.getjButton3() == evento.getSource()){
            this.compraboletos.setVisible(true);
            this.ticket.setVisible(false);
        }
    }
   public void llenarObras(){
        DAOObras dao = new DAOObras();
       
       
       for (int i = 0; i< dao.getobras().size(); i++){
           this.compraboletos.getCOMBOSELECCIONAR1().addItem(dao.getobras().get(i).getNombre());
    }
    }
   
   public void llenarfunciones(){
       DAOFunciones dao = new DAOFunciones();
       compraboletos.getCOMBOSELECCIONAR().removeAllItems();
       for(int i =0; i< dao.getfunciones().size(); i++){
           if(this.compraboletos.getCOMBOSELECCIONAR1().getSelectedItem().toString().equals(dao.getfunciones().get(i).getObra())){
               this.compraboletos.getCOMBOSELECCIONAR().addItem(formato.format(dao.getfunciones().get(i).getFecha()) + " " + dao.getfunciones().get(i).getHora());
           }
       }
}
}
