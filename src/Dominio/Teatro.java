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
    private boolean[] asiento_A = new boolean[30];
    private boolean[] asiento_B = new boolean[18];
    private boolean[] asiento_C = new boolean[30];



    public Teatro(String nombre, Empleado empleados, Funciones funciones) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.funciones = funciones;
        
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

        public boolean[] getAsiento_A() {
        return asiento_A;
    }

    public void setAsiento_A(boolean[] asiento_A) {
        this.asiento_A = asiento_A;
    }

    public boolean[] getAsiento_B() {
        return asiento_B;
    }

    public void setAsiento_B(boolean[] asiento_B) {
        this.asiento_B = asiento_B;
    }

    public boolean[] getAsiento_C() {
        return asiento_C;
    }

    public void setAsiento_C(boolean[] asiento_C) {
        this.asiento_C = asiento_C;
    }

   
    
    
    
}
