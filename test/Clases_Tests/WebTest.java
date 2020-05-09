/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Tests;

import Clases.Usuario;
import Clases.Web;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class WebTest {

    /**
     * Test of registrarse method, of class Web.
     */
    @Test
    public void testRegistrarse() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Usuario nuevoUser = new Usuario();
        nuevoUser.setNombre("angel");
        nuevoUser.setNick("Gelote97");
        nuevoUser.setContrasena("bocataDeAtun");
        Web instance = new Web();
        boolean expResult = true;
        boolean result = instance.registrarse(listaUsuarios, nuevoUser);
        assertEquals(expResult, result);
    }

    /**
     * Test of iniciarSesion method, of class Web.
     */
    @Test
    public void testIniciarSesion() {
        String nick = "Gelote97";
        String contrasena = "bocataDeAtun";
        Web instance = new Web();
        Boolean expResult = true;
        Boolean result = instance.iniciarSesion(nick, contrasena);
        assertEquals(expResult, result);
    }
    
}
