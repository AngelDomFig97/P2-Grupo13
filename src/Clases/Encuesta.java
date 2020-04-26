package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Encuesta implements Serializable{
    
    private ArrayList<String> preguntasYrespuestas = new ArrayList<>(); 

    public Encuesta(String opciones){
        preguntasYrespuestas.add(opciones);
    }
    
    public ArrayList<String> getPreguntasYrespuestas() {
        return preguntasYrespuestas;
    }

    public void setPreguntasYrespuestas(ArrayList<String> preguntasYrespuestas) {
        this.preguntasYrespuestas = preguntasYrespuestas;
    }
      
     
    public Encuesta generarEncuesta(){
         return null;
        
    }
      
    
    
    
}
