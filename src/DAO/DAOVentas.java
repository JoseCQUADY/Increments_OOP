/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.Administrador;
import Dominio.Empleado;
import Dominio.Ventas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class DAOVentas {
     private ArrayList<Ventas> lista;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    public DAOVentas() throws ParseException{
        this.lista = new ArrayList<Ventas>();
        
        String Separador = ",";
       
        BufferedReader bufferLectura = null;
        try{
            bufferLectura = new BufferedReader(new FileReader("src/Test/Ventas.txt"));
            String linea = bufferLectura.readLine();
            Ventas ventas;
            while (linea != null){
                String[] datos = linea.split(Separador);
                ventas= new Ventas(formato.parse(datos[0]), Double.parseDouble(datos[1]));
                lista.add(ventas);
                
                linea = bufferLectura.readLine();
                
            } 
        }
        catch(IOException e){
            e.printStackTrace();
    }
         finally {
             if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } 
                catch (IOException e) {
                    e.printStackTrace();
                
        }
    }
}
}
    
    public void ventasDiarias(Date fecha){
        double reportediario = 0;
        for (int i = 0; i < lista.size() ; i ++ ){
            if (fecha == lista.get(i).getFecha_Venta()){
                reportediario = reportediario + lista.get(i).getCosto_Total();
            }
        }
    }
    public void ventasMensuales(Date fecha){
        double reportemensual = 0;
    
        for (int i = 0; i < lista.size() ; i ++ ){
            if (fecha.getMonth() == lista.get(i).getFecha_Venta().getMonth()){
                reportemensual = reportemensual + lista.get(i).getCosto_Total();
            }
    }
    }
    public ArrayList<Ventas> getVentas(){
        return lista;
    }
}
