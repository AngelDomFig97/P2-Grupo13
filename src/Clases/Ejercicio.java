
package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sun.misc.IOUtils;


public class Ejercicio {
  
    private String textoEjercicio;   
    private ArrayList<Byte> imagen = new ArrayList<Byte>();

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
