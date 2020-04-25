package Clases;

import java.io.Serializable;
import java.util.ArrayList;



public class Ejercicio implements Serializable{
  
    private String textoEjercicio;   
    private ArrayList<Byte> imagen = new ArrayList<>();
    
    public Ejercicio(String textoEjercicio){
        this.textoEjercicio = textoEjercicio;
    }

    public String getTextoEjercicio() {
        return textoEjercicio;
    }

    public void setTextoEjercicio(String textoEjercicio) {
        this.textoEjercicio = textoEjercicio;
    }

    public ArrayList<Byte> getImagen() {
        return imagen;
    }

    public void setImagen(ArrayList<Byte> imagen) {
        this.imagen = imagen;
    }

     
 
    
    public void generarEjercicio(String textoEjercicio) {   
        this.textoEjercicio=textoEjercicio;
             
    }
       
}
