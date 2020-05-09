/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class EntradaTest {

    /**
     * Test of CrearEntrada method, of class Entrada.
     */
    @Test
    public void testCrearEntrada() {
        ArrayList<Entrada> listaentradas = new ArrayList<>();
        Entrada nuevaEntrada = new Entrada();
        nuevaEntrada.setIdEntrada("5817");
        nuevaEntrada.setTitulo("Ejercicios de diodos");
        Entrada instance = new Entrada();
        instance.CrearEntrada(listaentradas, nuevaEntrada);
    }

    /**
     * Test of anadirComentario method, of class Entrada.
     */
    @Test
    public void testAnadirComentario() {
        Comentario comentario = new Comentario();
        Entrada instance = new Entrada();
        instance.anadirComentario(comentario);
    }
}
