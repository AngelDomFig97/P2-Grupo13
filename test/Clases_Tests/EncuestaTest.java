package Clases_Tests;

import Clases.Encuesta;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncuestaTest {
    
    public EncuestaTest() {
    }

    @Test
    public void testGetPreguntasYrespuestas() {
        String esperado = "Probando el getPreguntasYrespuestas desde jUnit.";
        Encuesta encPrueba = new Encuesta(esperado);
        ArrayList<String> resultado = encPrueba.getPreguntasYrespuestas();
        assertEquals(esperado, resultado.get(0));
    }

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
