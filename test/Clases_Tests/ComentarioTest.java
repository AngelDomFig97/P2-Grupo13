package Clases_Tests;

import Clases.Comentario;
import Clases.Usuario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComentarioTest {
    
    public ComentarioTest() {
    }
    
    @Test
    public void testAddContestacionesComentarios() {
        ArrayList<Comentario> lista = new ArrayList<>();
        lista.add(new Comentario());
        Comentario c = new Comentario();
        c.addContestacionesComentarios(new Comentario());
        ArrayList<Comentario> resultado = c.getContestacionesComentarios();
        assertEquals(lista.size(), resultado.size());
    }

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

    @Test
    public void testCrearComentario() {
        
    }
    
}
