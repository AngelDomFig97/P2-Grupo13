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
 * @author Angel Dominguez
 */
public class EjercicioTest {
    
    public EjercicioTest() {
    }

    @Test
    public void testgetTextoEjercicio() {
        String esperado = "Probando el getTextoEjercicio desde jUnit.";
        Ejercicio ejerPrueba = new Ejercicio(esperado);
        String resultado = ejerPrueba.getTextoEjercicio();
        assertEquals(esperado, resultado);
    }
    
}
