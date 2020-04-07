/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Angel Dominguez
 */
public class Comentario {
    
    private String nombreUsuario;
    private int puntuacion;
    private Date fechaCreacion;
    private String texto;
    private ArrayList<Voto> listaVotos = new ArrayList<>();
    
    public void comentarEntrada(Entrada e){
        
    }
    
    public void contestarComentario(Comentario c){
        
    }
    
    public void incrementarPuntuacion(Comentario c, Usuario u){
        
    }
    
    public void decrementarPuntuacion(Comentario c, Usuario u){
        
    }
}
