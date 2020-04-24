package Clases;

import GestionBBDD.CRUD_Entrada;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Entrada implements Serializable{
    
    private String idEntrada,titulo,contenidoEntrada;
    private Integer puntuacion;
    private Date fechaCreacion, fechaUpdate;
    private ArrayList<Comentario> comentarios = new ArrayList<>();
    private SubForo subforo;
    private Encuesta encuesta;
    private Ejercicio ejercicio;

    public void CrearEntrada (ArrayList<Entrada> listaentradas, Entrada nuevaEntrada){
        listaentradas.add(nuevaEntrada);
        CRUD_Entrada.insertarEntrada(listaentradas);
    }
    
    public String getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(String idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenidoEntrada() {
        return contenidoEntrada;
    }

    public void setContenidoEntrada(String contenidoEntrada) {
        this.contenidoEntrada = contenidoEntrada;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    public void anadirComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public SubForo getSubforo() {
        return subforo;
    }

    public void setSubforo(SubForo subforo) {
        this.subforo = subforo;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }
    
    
    public ArrayList<Entrada> selectEntradasPopulares(){
        
        return null;
    }

    public Entrada() {
    }
    

    public Entrada rellenarEntradaProfesor(String titulo, String contenidoEntrada, int puntuacion, Date fechaCreacion, Date fechaUpdate, ArrayList<Comentario> comentarios, SubForo subforo, Encuesta encuesta, Ejercicio ejercicio) {
        this.titulo = titulo;
        this.contenidoEntrada = contenidoEntrada;
        this.puntuacion = puntuacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaUpdate = fechaUpdate;
        this.comentarios = comentarios;
        this.subforo = subforo;
        this.encuesta = encuesta;
        this.ejercicio = ejercicio;
        return null;
    }



}