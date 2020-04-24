package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Comentario implements Serializable {
    
    private String nombreUsuario;
    private int puntuacion;
    private Date fechaCreacion;
    private String texto;
    private ArrayList<Voto> listaVotos = new ArrayList<>();
    private ArrayList<Comentario> contestacionesComentarios;

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
