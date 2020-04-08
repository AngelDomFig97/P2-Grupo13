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
public class SubForo {
    
    private String nombreForo;
    private String nickCreador;
    private ArrayList<Entrada> listaEntradas = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public SubForo(){
    }
    
    public boolean vistoBueno(Entrada nuevaEntrada){
        return true;
    }
    
    public Notificacion crearNotificacion(Entrada id, SubForo subf, String texto, Date fecha){
        Notificacion n = new Notificacion(texto, fecha, subf, id);
        return n;
    }
    
    public void anadirEntrada(Entrada e){
        listaEntradas.add(e);
    }
    
    public void suscribirUsuario(Usuario u){
        listaUsuarios.add(u); 
    }
    
    public void darBajaUsuario(Usuario user){
        listaUsuarios.remove(user);
    }

    public String getNombreForo() {
        return nombreForo;
    }

    public void setNombreForo(String nombreForo) {
        this.nombreForo = nombreForo;
    }

    public String getNickCreador() {
        return nickCreador;
    }

    public void setNickCreador(String nickCreador) {
        this.nickCreador = nickCreador;
    }

    public ArrayList<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
}
