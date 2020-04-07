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
    private ArrayList<Comentario> comentarios;
    private SubForo subforo;
    private Encuesta encuesta;
    private Ejercicio ejercicio;
    
    
    public ArrayList<Entrada> selectEntradasPopulares(){
        
        return null;
    }
    public Entrada rellenarEntrada(){
        
        return null;
    }
    public Entrada rellenarEntradaProfesor(){
        
        return null;
    }
}
