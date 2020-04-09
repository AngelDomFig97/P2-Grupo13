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
    private ArrayList<Comentario> contestacionesComentarios;
    
//    public ArrayList<Entrada> comentarEntrada(ArrayList<Entrada> e, String nombreUsuario, int puntuacion, Date fechaCreacion, String texto){
//        this.nombreUsuario = nombreUsuario;
//        this.puntuacion = puntuacion;
//        this.fechaCreacion = fechaCreacion;
//        this.texto = texto;
//        e.add();
//        return e;
//    }
    
    public Comentario(String nombreUsuario, int puntuacion, Date fechaCreacion, String texto, ArrayList<Comentario> contestacionesComentarios){
        this.nombreUsuario = nombreUsuario;
        this.puntuacion = puntuacion;
        this.fechaCreacion = fechaCreacion;
        this.texto = texto;
        this.contestacionesComentarios = contestacionesComentarios;
    }
    
    public Comentario(){    
    }
    
    public void contestarComentario(Comentario c, String nombreUsuario, int puntuacion, Date fechaCreacion, String texto){
        Comentario com = new Comentario(nombreUsuario, puntuacion, fechaCreacion, texto, null);
        c.contestacionesComentarios.add(com);
    }
    
    public void incrementarPuntuacion(Comentario c, Usuario u){
        c.puntuacion += 1;
    }
    
    public void decrementarPuntuacion(Comentario c, Usuario u){
        c.puntuacion -= 1;
    }
}
