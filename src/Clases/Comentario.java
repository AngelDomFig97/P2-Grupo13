package Clases;

import GestionBBDD.CRUD_Comentario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Comentario implements Serializable {
    
    private String nombreUsuario;
    private int puntuacion;
    private Date fechaCreacion;
    private String texto;
    private ArrayList<Voto> listaVotos = new ArrayList<>();
    private ArrayList<Comentario> contestacionesComentarios = new ArrayList<>();

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Voto> getListaVotos() {
        return listaVotos;
    }

    public void setListaVotos(ArrayList<Voto> listaVotos) {
        this.listaVotos = listaVotos;
    }

    public ArrayList<Comentario> getContestacionesComentarios() {
        return contestacionesComentarios;
    }

    public void addContestacionesComentarios(Comentario comentario) {
        contestacionesComentarios.add(comentario);
    }

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
    
    public void crearComentario(ArrayList<Comentario> listaComentarios, Comentario comment){
        listaComentarios.add(comment);
        CRUD_Comentario.insertarComentario(listaComentarios);
    }
}
