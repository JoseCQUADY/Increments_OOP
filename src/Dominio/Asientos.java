/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author diego
 */
public class Asientos {
    private int Idfuncion;
     private boolean asiento_A[][] = new boolean[5][3];
    private boolean asiento_B[][] = new boolean[5][2];
    private boolean asiento_C[][] = new boolean[5][3];

    public Asientos() {
        
    }

    public int getIdfuncion() {
        return Idfuncion;
    }

    public void setIdfuncion(int Idfuncion) {
        this.Idfuncion = Idfuncion;
    }

    public boolean[][] getAsiento_A() {
        return asiento_A;
    }

    public void setAsiento_A(boolean[][] asiento_A) {
        this.asiento_A = asiento_A;
    }

    public boolean[][] getAsiento_B() {
        return asiento_B;
    }

    public void setAsiento_B(boolean[][] asiento_B) {
        this.asiento_B = asiento_B;
    }

    public boolean[][] getAsiento_C() {
        return asiento_C;
    }

    public void setAsiento_C(boolean[][] asiento_C) {
        this.asiento_C = asiento_C;
    }
    
    
    
    public Asientos(int idFuncion, boolean[][] asiento_A, boolean[][] asiento_B, boolean[][] asiento_C){
        this.Idfuncion = idFuncion;
        this.asiento_A = asiento_A;
        this.asiento_B = asiento_B;
        this.asiento_C = asiento_C;
    }
}
