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
    public void testGetTextoEjercicio() {
        String esperado = "Probando el getTextoEjercicio desde jUnit.";
        Ejercicio ejerPrueba = new Ejercicio(esperado);
        String resultado = ejerPrueba.getTextoEjercicio();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void textSetTextoEjercicio(){
        String esperado = "Probando el setTextoEjercicio desde jUnit.";
        Ejercicio ejerPrueba = new Ejercicio("Empezamos con un texto que no es el esperado.");
        ejerPrueba.setTextoEjercicio(esperado);
        String resultado = ejerPrueba.getTextoEjercicio();
        assertEquals(esperado, resultado);
    }
    
}
