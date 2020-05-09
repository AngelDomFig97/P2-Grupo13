package Clases;

import java.io.Serializable;

public class Ejercicio implements Serializable{
  
    private String textoEjercicio;
    
    public Ejercicio(String textoEjercicio){
        this.textoEjercicio = textoEjercicio;
    }

    public String getTextoEjercicio() {
        return textoEjercicio;
    }

    public void setTextoEjercicio(String textoEjercicio) {
        this.textoEjercicio = textoEjercicio;
    }    
}
