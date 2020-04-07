/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Angel Dominguez
 */
public class SubForo {
    
    private String nombre;
    private int id_Profesor;
    private ArrayList<Entrada> listaEntradas = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public boolean vistoBueno(Entrada e){
        boolean bool = true;
        return bool;
    }
    
    public Notificacion crearNotificacion(Entrada id){
        Notificacion n = new Notificacion();
        return n;
    }
    
    public void suscribirUsuario(Usuario u){
        
    }
    
    public void darBajaUsuario(Usuario u){
        
    }
}
