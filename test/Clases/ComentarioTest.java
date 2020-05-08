/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
     * Test of incrementarPuntuacion method, of class Comentario.
     */
    @Test
    public void testIncrementarPuntuacion() {
        int puntuacion = 1;
        Comentario pruebaComentario = new Comentario();
        Usuario user = new Usuario();
        pruebaComentario.incrementarPuntuacion(pruebaComentario, user);
        int puntuacionComment = pruebaComentario.getPuntuacion();
        assertEquals(puntuacion, puntuacionComment);
    }

    /**
     * Test of decrementarPuntuacion method, of class Comentario.
     */
    @Test
    public void testDecrementarPuntuacion() {
    }

    /**
     * Test of crearComentario method, of class Comentario.
     */
    @Test
    public void testCrearComentario() {
    }
    
}
