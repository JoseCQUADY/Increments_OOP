/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Dominio.Obra;
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
public class DAOObras {
    private ArrayList<Obra> lista;
    
    public DAOObras(){
        this.lista = new ArrayList<Obra>();
        String Separador = ",";
        BufferedReader bufferLectura = null;
        try{
            bufferLectura = new BufferedReader(new FileReader("src/Test/Obras.txt"));
            String linea = bufferLectura.readLine();
            Obra obras;
            while (linea != null){
                String[] datos = linea.split(Separador);
                obras= new Obra(datos[0],datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], Double.parseDouble(datos[6]));
                lista.add(obras);
                
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
        public int agregarObras(Obra obras){
      for(int i=0; i < lista.size(); i++){
 if(obras.getNombre().equals(lista.get(i).getNombre())){
    System.out.println("Registro existente");
                 return 1;
}
}
      lista.add(obras);
       try {
        FileWriter writer = new FileWriter("src/Test/Obras.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getResumen()+ "," + lista.get(j).getGenero()+ "," + lista.get(j).getDuracion()+ "," + lista.get(j).getActor_Principal1()+ "," + lista.get(j).getActor_Principal2()+"," + lista.get(j).getPrecio_Boleto()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha añadido correctamente la nueva obra");
        return 0;
    }
        public int eliminarObras(Obra obras){
             for(int i=0; i < lista.size(); i++){
 if(obras.getNombre().equals(lista.get(i).getNombre())){
    lista.remove(i);
        }
             }
             try {
        FileWriter writer = new FileWriter("src/Test/Obras.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getResumen()+ "," + lista.get(j).getGenero()+ "," + lista.get(j).getDuracion()+ "," + lista.get(j).getActor_Principal1()+ "," + lista.get(j).getActor_Principal2()+"," + lista.get(j).getPrecio_Boleto()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha eliminado la obra");
        return 0;
    }
        
        public int modificarObras(Obra obras){
             for(int i=0; i < lista.size(); i++){
 if(obras.getNombre().equals(lista.get(i).getNombre())){
    lista.set(i,obras);
 }
        }
             try {
        FileWriter writer = new FileWriter("src/Test/Obras.txt", false);
      for(int j=0; j < lista.size(); j++){
       writer.write(lista.get(j).getNombre()+","+lista.get(j).getResumen()+ "," + lista.get(j).getGenero()+ "," + lista.get(j).getDuracion()+ "," + lista.get(j).getActor_Principal1()+ "," + lista.get(j).getActor_Principal2()+"," + lista.get(j).getPrecio_Boleto()+"\r\n");
            }
      writer.close();
    }catch(IOException e){
        e.printStackTrace();
        
    }
    System.out.println("Se ha modificado la obra");
        return 0;
    }
        
        public Obra buscarObras(Obra obras){
          for(int i=0; i < lista.size(); i++){
 if(obras.getNombre().equals(lista.get(i).getNombre())){
    lista.get(i);
        }
          }
          return null;
        }
        public ArrayList<Obra> getobras(){
     
       return lista;
}
}

