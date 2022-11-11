/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Dominio.*;

/**
 *
 * @author DIEGO ARREOLA
 */
public class Teatro {
    private String nombre;
    private Empleado empleados;
    private Funciones funciones;
    private String asiento_A;
    private String asiento_B;
    private String asiento_C;

    public Teatro(String nombre, Empleado empleados, Funciones funciones, String asiento_A, String asiento_B, String asiento_C) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.funciones = funciones;
        this.asiento_A = asiento_A;
        this.asiento_B = asiento_B;
        this.asiento_C = asiento_C;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public Funciones getFunciones() {
        return funciones;
    }

    public void setFunciones(Funciones funciones) {
        this.funciones = funciones;
    }

    public String getAsiento_A() {
        return asiento_A;
    }

    public void setAsiento_A(String asiento_A) {
        this.asiento_A = asiento_A;
    }

    public String getAsiento_B() {
        return asiento_B;
    }

    public void setAsiento_B(String asiento_B) {
        this.asiento_B = asiento_B;
    }

    public String getAsiento_C() {
        return asiento_C;
    }

    public void setAsiento_C(String asiento_C) {
        this.asiento_C = asiento_C;
    }
    
    
    
}
