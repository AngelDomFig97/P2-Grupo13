package Clases;

import org.junit.Test;
import static org.junit.Assert.*;

public class EjercicioTest {
    
    public EjercicioTest() {
    }

    @Test
    public void testGetTextoEjercicio() {
        String esperado = "Probando el getTextoEjercicio desde jUnit.";
        Ejercicio ejerPrueba = new Ejercicio(esperado);
        String resultado = ejerPrueba.getTextoEjercicio();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testSetTextoEjercicio(){
        String esperado = "Probando el setTextoEjercicio desde jUnit.";
        Ejercicio ejerPrueba = new Ejercicio("Empezamos con un texto que no es el esperado.");
        ejerPrueba.setTextoEjercicio(esperado);
        String resultado = ejerPrueba.getTextoEjercicio();
        assertEquals(esperado, resultado);
    }
    
}
