package Clases_Tests;

import Clases.Usuario;
import Clases.Web;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class WebTest {

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
