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
    
    private String nombre;
    private int id_Profesor;
    private ArrayList<Entrada> listaEntradas = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public SubForo(String nombre, int id_Profesor){
        this.nombre = nombre;
        this.id_Profesor = id_Profesor;
    }
    
    public boolean vistoBueno(boolean torf){
        boolean bool = torf;
        return bool;
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
    
    public void darBajaUsuario(Usuario u){
        listaUsuarios.remove(u);
    }
}
