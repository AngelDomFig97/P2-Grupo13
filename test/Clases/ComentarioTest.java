/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bugat
 */
public class ComentarioTest {
    
    public ComentarioTest() {
    }
    
    /**
     * Test of addContestacionesComentarios method, of class Comentario.
     */
    @Test
    public void testAddContestacionesComentarios() {
        ArrayList<Comentario> lista = new ArrayList<>();
        lista.add(new Comentario());
        Comentario c = new Comentario();
        c.addContestacionesComentarios(new Comentario());
        ArrayList<Comentario> resultado = c.getContestacionesComentarios();
        assertEquals(lista.size(), resultado.size());
    }
    
    /**
     * Test of incrementarPuntuacion method, of class Comentario.
     */
    @Test
    public void testIncrementarPuntuacion() {
        int puntuacion = 6;
        Comentario pruebaComentario = new Comentario();
        Usuario user = new Usuario();
        pruebaComentario.setPuntuacion(5);
        pruebaComentario.incrementarPuntuacion(pruebaComentario, user);
        int puntuacionComment = pruebaComentario.getPuntuacion();
        assertEquals(puntuacion, puntuacionComment);
    }

    /**
     * Test of decrementarPuntuacion method, of class Comentario.
     */
    @Test
    public void testDecrementarPuntuacion() {
        int puntuacion = 4;
        Comentario pruebaComentario = new Comentario();
        Usuario user = new Usuario();
        pruebaComentario.setPuntuacion(5);
        pruebaComentario.decrementarPuntuacion(pruebaComentario, user);
        int puntuacionComment = pruebaComentario.getPuntuacion();
        assertEquals(puntuacion, puntuacionComment);
    }

    /**
     * Test of crearComentario method, of class Comentario.
     */
    @Test
    public void testCrearComentario() {
        
    }
    
}
