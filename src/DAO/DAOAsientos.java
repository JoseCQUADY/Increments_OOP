/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Dominio.Asientos;
import Dominio.Funciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class DAOAsientos {
    private int Idfuncion;
     private boolean asiento_A[][] = new boolean[5][3];
    private boolean asiento_B[][] = new boolean[5][2];
    private boolean asiento_C[][] = new boolean[5][3];
    private ArrayList<Asientos> lista;
    
    public DAOAsientos(){
        this.lista = new ArrayList<Asientos>();
        String Separador = ",";
        BufferedReader bufferLectura = null;
        try{
            bufferLectura = new BufferedReader(new FileReader("src/Test/Asientos.txt"));
            String linea = bufferLectura.readLine();
            String matriz[][] = new String[5][3];
            int numlinea= 0;
            Funciones funcion;
            Asientos asientos;
            while (linea != null){
                String[] datos = linea.split(Separador);
                for (int l = 1; l < 7; l++) {
                    for (int j=0; j < 3; j ++){
                matriz[l][j] = datos[l];
                asiento_A[l][j] =Boolean.parseBoolean(matriz[l][j]);
            }
                }
                for (int l = 7; l < 13; l++) {
                     for (int j=0; j < 2; j ++){
                matriz[l][j] = datos[j];
                asiento_B[l][j] =Boolean.parseBoolean( matriz[l][j]);
            }
                }
                for (int l = 13; l < 19; l++) {
                     for (int j=0; j < 3; j ++){
                matriz[l][j] = datos[j];
                asiento_C[l][j] =Boolean.parseBoolean( matriz[l][j]);
            }
                }
            
                asientos= new Asientos(Integer.parseInt(datos[0]), asiento_A, asiento_B, asiento_C );
                lista.add(asientos);
                
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
    
    public void setId(int id){
       
    }
        public int agregarAsientos(Asientos asientos, int id){
      for(int i=0; i < lista.size(); i++){
 if(asientos.getIdfuncion() == lista.get(i).getIdfuncion()){
    System.out.println("Registro existente");
                 return 1;
}
}
      lista.add(asientos);
       try {
        FileWriter writer = new FileWriter("src/Test/Asientos.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getIdfuncion()+","+lista.get(j).getAsiento_A()+ "," + lista.get(j).getAsiento_B()+ "," + lista.get(j).getAsiento_C()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha añadido correctamente la nueva obra");
        return 0;
    }
        public int eliminarAsientos(Asientos asientos, int id){
             for(int i=0; i < lista.size(); i++){
 if(asientos.getIdfuncion() == lista.get(i).getIdfuncion()){

    lista.remove(i);
        }
             }
             try {
        FileWriter writer = new FileWriter("src/Test/Asientos.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getIdfuncion()+","+lista.get(j).getAsiento_A()+ "," + lista.get(j).getAsiento_B()+ "," + lista.get(j).getAsiento_C()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha eliminado la obra");
        return 0;
    }
        
        public int modificarAsientos(Asientos asientos){
             for(int i=0; i < lista.size(); i++){
 if(asientos.getIdfuncion() == lista.get(i).getIdfuncion()){
    lista.set(i,asientos);
 }
        }
             try {
        FileWriter writer = new FileWriter("src/Test/Asientos.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getIdfuncion()+","+lista.get(j).getAsiento_A()+ "," + lista.get(j).getAsiento_B()+ "," + lista.get(j).getAsiento_C()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha modificado la obra");
        return 0;
    }
        
       
        public ArrayList<Asientos> getasientos(){
     
       return lista;
}
}

