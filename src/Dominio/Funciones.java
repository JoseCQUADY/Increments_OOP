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
public class Funciones {
    private int id;
    private String obra;
    private Date fecha;
    private String hora;

    public Funciones(){
        
    }
    public Funciones(int id, String obra, Date fecha, String hora) {
        this.id = id;
        this.obra = obra;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getObra() {
      return obra;
    }

    public void setObra(Obra obras) {
        
        
        this.obra = obras.getNombre();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
