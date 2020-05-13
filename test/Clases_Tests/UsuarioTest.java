
package Clases_Tests;

import Clases.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    public UsuarioTest() {
    }
                
    @Test
    public void testSetNombre() {
        String esperado = "Probando el setNombre desde jUnit.";
        Usuario ejerPrueba = new Usuario();
        ejerPrueba.setNombre(esperado);
        String resultado = ejerPrueba.getNombre();
        assertEquals(esperado, resultado);
    }
}
