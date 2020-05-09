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
        ArrayList<String> esperado = new ArrayList<>();
        String esp = "Probando el setPreguntasYrespuestas desde jUnit.";
        esperado.add(esp);
        Encuesta encPrueba = new Encuesta("Empezamos con un texto que no es el esperado.");
        encPrueba.setPreguntasYrespuestas(esperado);
        ArrayList<String> resultado;
        resultado = encPrueba.getPreguntasYrespuestas();
        assertEquals(esperado, resultado);
    }

}
