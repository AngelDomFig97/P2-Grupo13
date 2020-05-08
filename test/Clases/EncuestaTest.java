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
 * @author Adrian
 */
public class EncuestaTest {
    
    public EncuestaTest() {
    }

    /**
     * Test of getPreguntasYrespuestas method, of class Encuesta.
     */
    @Test
    public void testGetPreguntasYrespuestas() {
        String esperado = "Probando el getPreguntasYrespuestas desde jUnit.";
        Encuesta encPrueba = new Encuesta(esperado);
        ArrayList<String> resultado = encPrueba.getPreguntasYrespuestas();
        assertEquals(esperado, resultado.get(0));
    }

    /**
     * Test of setPreguntasYrespuestas method, of class Encuesta.
     */
    @Test
    public void testSetPreguntasYrespuestas() {
    }

    /**
     * Test of generarEncuesta method, of class Encuesta.
     */
    @Test
    public void testGenerarEncuesta() {
    }
    
}
