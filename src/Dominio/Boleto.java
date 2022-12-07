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
public class Boleto {
    private Date fecha_Funcion;
    private String hora_Funcion;
    private int num_Boleto;
    private double costo;
    private String asiento;

    public Boleto(Date fecha_Funcion, String hora_Funcion, int num_Boleto, double costo, String asiento) {
        this.fecha_Funcion = fecha_Funcion;
        this.hora_Funcion = hora_Funcion;
        this.num_Boleto = num_Boleto;
        this.costo = costo;
        this.asiento = asiento;
    }

    public Boleto() {
       
    }

    public Date getFecha_Funcion() {
        return fecha_Funcion;
    }

    public void setFecha_Funcion(Date fecha_Funcion) {
        this.fecha_Funcion = fecha_Funcion;
    }

    public String getHora_Funcion() {
        return hora_Funcion;
    }

    public void setHora_Funcion(String hora_Funcion) {
        this.hora_Funcion = hora_Funcion;
    }

    public int getNum_Boleto() {
        return num_Boleto;
    }

    public void setNum_Boleto(int num_Boleto) {
        this.num_Boleto = num_Boleto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
    
}
