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
public class Entrada {
    
    private String idEntrada,titulo,contenidoEntrada;
    private Integer puntuacion;
    private Date fechaCreacion, fechaUpdate;
    private ArrayList<Comentario> comentarios = new ArrayList<>();
    private SubForo subforo;
    private Encuesta encuesta;
    private Ejercicio ejercicio;

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