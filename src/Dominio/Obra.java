/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author DIEGO ARREOLA
 */
public class Obra {
    private String nombre;
    private String resumen;
    private String genero;
    private int duracion;
    private String actor_Principal1;
    private String actor_Principal2;
    private double precio_Boleto;

    public Obra(String nombre, String resumen, String genero, int duracion, String actor_Principal1, String actor_Principal2, double precio_Boleto) {
        this.nombre = nombre;
        this.resumen = resumen;
        this.genero = genero;
        this.duracion = duracion;
        this.actor_Principal1 = actor_Principal1;
        this.actor_Principal2 = actor_Principal2;
        this.precio_Boleto = precio_Boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getActor_Principal1() {
        return actor_Principal1;
    }

    public void setActor_Principal1(String actor_Principal1) {
        this.actor_Principal1 = actor_Principal1;
    }

    public String getActor_Principal2() {
        return actor_Principal2;
    }

    public void setActor_Principal2(String actor_Principal2) {
        this.actor_Principal2 = actor_Principal2;
    }

    public double getPrecio_Boleto() {
        return precio_Boleto;
    }

    public void setPrecio_Boleto(double precio_Boleto) {
        this.precio_Boleto = precio_Boleto;
    }
    
    
}
