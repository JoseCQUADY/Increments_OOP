/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author DIEGO ARREOLA
 */
public class Ventas {
    private String nombre_Teatro;
    private int num_Venta;
    private Date fecha_Venta;
    private int num_Boletos;
    private double costo_Total;
    private double pago;
    private double cambio;
    private Boleto boletos;
    
    public Ventas(){
        
    }
    public Ventas( Date fecha_Venta, double costo_total){
        this.fecha_Venta = fecha_Venta;
        this.costo_Total = costo_total;
    }
    public Ventas(String nombre_Teatro, int num_Venta, Date fecha_Venta, int num_Boletos, double costo_Total, double pago, double cambio, Boleto boletos) {
        this.nombre_Teatro = nombre_Teatro;
        this.num_Venta = num_Venta;
        this.fecha_Venta = fecha_Venta;
        this.num_Boletos = num_Boletos;
        this.costo_Total = costo_Total;
        this.pago = pago;
        this.cambio = cambio;
        this.boletos = boletos;
    }

    public String getNombre_Teatro() {
        return nombre_Teatro;
    }

    public void setNombre_Teatro(String nombre_Teatro) {
        this.nombre_Teatro = nombre_Teatro;
    }

    public int getNum_Venta() {
        return num_Venta;
    }

    public void setNum_Venta(int num_Venta) {
        this.num_Venta = num_Venta;
    }

    public Date getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(Date fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public int getNum_Boletos() {
        return num_Boletos;
    }

    public void setNum_Boletos(int num_Boletos) {
        this.num_Boletos = num_Boletos;
    }

    public double getCosto_Total() {
        return costo_Total;
    }

    public void setCosto_Total(double costo_Total) {
        this.costo_Total = costo_Total;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public Boleto getBoletos() {
        return boletos;
    }

    public void setBoletos(Boleto boletos) {
        this.boletos = boletos;
    }
    
    
    
}
