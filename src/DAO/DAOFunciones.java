/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Dominio.Asientos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import Dominio.Funciones;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author diego
 */
public class DAOFunciones {
    private ArrayList<Funciones> lista;
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
     

    //constructor del DAO
    public DAOFunciones(){
        this.lista = new ArrayList<Funciones>();
        
        String Separador = ",";
        BufferedReader bufferLectura = null;
        try{
            bufferLectura = new BufferedReader(new FileReader("src/Test/Funciones.txt"));
            String linea = bufferLectura.readLine();
            Funciones funcion;
            while (linea != null){
                String[] datos = linea.split(Separador);
                funcion = new Funciones(Integer.parseInt(datos[0]),datos[1], formato.parse(datos[2]), datos[3]);
                lista.add(funcion);
               
                linea = bufferLectura.readLine();
                
            } 
        }
        catch(IOException e){
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(DAOFunciones.class.getName()).log(Level.SEVERE, null, ex);
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
    
    public int agregarFuncion(Funciones funcion){
        for(int i=0; i < lista.size(); i++){
            if(funcion.getId() == lista.get(i).getId() || (funcion.getHora().equals(lista.get(i).getHora()) && formato.format(funcion.getFecha()).equals(formato.format(lista.get(i).getFecha())))){
                 System.out.println("Registro existente");
                 return 1;
            }
        }
        
        
       
        lista.add(funcion);
    try {
        FileWriter writer = new FileWriter("src/Test/Funciones.txt", false);
      
      for(int j=0; j < lista.size(); j++){
                writer.write(lista.get(j).getId()+","+lista.get(j).getObra()+ "," + formato.format(lista.get(j).getFecha()) + "," + lista.get(j).getHora()+"\r\n");
//                daoasientos.agregarAsientos(asientos, lista.get(j).getId());
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha a??adido correctamente la nueva funci??n");
        return 0;
}
    
    public int EliminarFuncion(Funciones funcion){
         for(int i=0; i < lista.size(); i++){
            if(funcion.getId() == lista.get(i).getId()){
                lista.remove(i);
            }
    }
         try {
        FileWriter writer = new FileWriter("src/Test/Funciones.txt", false);
      for(int j=0; j < lista.size(); j++){
                writer.write(lista.get(j).getId()+","+lista.get(j).getObra()+ "," + formato.format(lista.get(j).getFecha()) + "," + lista.get(j).getHora()+"\r\n");
//            daoasientos.eliminarAsientos(asientos, lista.get(j).getId());
      }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha eliminado correctamente la funci??n");
        return 0;
}
    public int EliminarFuncion(String nombre){
         for(int i=0; i < lista.size(); i++){
            if(nombre.equals(lista.get(i).getObra())){
                lista.remove(i);
            }
    }
         try {
        FileWriter writer = new FileWriter("src/Test/Funciones.txt", false);
      for(int j=0; j < lista.size(); j++){
                writer.write(lista.get(j).getId()+","+lista.get(j).getObra()+ "," + formato.format(lista.get(j).getFecha()) + "," + lista.get(j).getHora()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha eliminado correctamente la funci??n");
        return 0;
} 
    public int modificarFuncion(Funciones funcion){
         for(int i=0; i < lista.size(); i++){
            if(funcion.getId() == lista.get(i).getId() || (funcion.getHora().equals(lista.get(i).getHora()) && formato.format(funcion.getFecha()).equals(formato.format(lista.get(i).getFecha())))){
                System.out.println("Registro existente");
                lista.set(i, funcion);
            }
    }
       try {
        FileWriter writer = new FileWriter("src/Test/Funciones.txt", false);
      for(int j=0; j < lista.size(); j++){
                writer.write(lista.get(j).getId()+","+lista.get(j).getObra()+ "," + formato.format(lista.get(j).getFecha()) + "," + lista.get(j).getHora()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha modificado la funci??n");
        return 0;
                }
    
    public Funciones buscarFunciones(Funciones funcion){
         for(int i=0; i < lista.size(); i++){
            if(funcion.getId() == lista.get(i).getId()){
                lista.get(i);
            }
    }
    return null;
}
    public ArrayList<Funciones> getfunciones(){
     
       return lista;
    }
}