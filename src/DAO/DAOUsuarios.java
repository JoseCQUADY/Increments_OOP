/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Dominio.Administrador;
import Dominio.Empleado;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author diego
 */
public class DAOUsuarios {
    private ArrayList<Empleado> lista;
    
    public DAOUsuarios(){
        this.lista = new ArrayList<Empleado>();
        
        String Separador = ",";
       
        BufferedReader bufferLectura = null;
        try{
            bufferLectura = new BufferedReader(new FileReader("src/Test/Usuarios.txt"));
            String linea = bufferLectura.readLine();
            Empleado empleado;
            while (linea != null){
                String[] datos = linea.split(Separador);
                empleado= new Administrador(datos[0],datos[1], datos[2], datos[3], datos[4]);
                lista.add(empleado);
                
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
    
    public int agregarUsuarios(Empleado empleado){
        for(int i=0; i < lista.size(); i++){
            if(empleado.getCURP().equals(lista.get(i).getCURP())){
                 System.out.println("Registro existente");
                 return 1;
            }
        }
        lista.add(empleado);
            try {
        FileWriter writer = new FileWriter("src/Test/Usuarios.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getApellido()+ "," + lista.get(j).getUsuario()+ "," + lista.get(j).getContraseña()+ "," + lista.get(j).getCURP()+ "\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha añadido correctamente el nuevo usuario");
        return 0;
}
 public int eliminarUsuarios(Empleado empleado){
     for(int i=0; i < lista.size(); i++){
            if(empleado.getNombre().equals(lista.get(i).getNombre())){
                 lista.remove(i);
            }
        }
            try {
        FileWriter writer = new FileWriter("src/Test/Usuarios.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getApellido()+ "," + lista.get(j).getUsuario()+ "," + lista.get(j).getContraseña()+ "," + lista.get(j).getCURP()+ "\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha eliminado el usuario");
        return 0;
}
 public int modificarUsuarios(Empleado empleado){
     for(int i=0; i < lista.size(); i++){
            if(empleado.getCURP().equals(lista.get(i).getCURP())){
                 lista.set(i, empleado);
            }
        }
            try {
        FileWriter writer = new FileWriter("src/Test/Usuarios.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getApellido()+ "," + lista.get(j).getUsuario()+ "," + lista.get(j).getContraseña()+ "," + lista.get(j).getCURP()+ "\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha modificado el usuario");
        return 0;
}
 
 public Empleado buscarUsuarios(Empleado empleado){
     for(int i=0; i < lista.size(); i++){
            if(empleado.getCURP().equals(lista.get(i).getCURP())){
                 lista.get(i);
            }
        }
 return null;
 }
 public boolean contraseña(Empleado empleado){
     for(int i=0; i < lista.size(); i++){
            if(empleado.getUsuario().equals(lista.get(i).getUsuario()) && empleado.getContraseña().equals(lista.get(i).getContraseña())){
                 lista.get(i);
                 return true;
            }
        }
     return false;
 }
 public ArrayList<Empleado> getusuarios(){
     
       return lista;
       
     
 }
}

