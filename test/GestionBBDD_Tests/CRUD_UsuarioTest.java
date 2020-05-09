package GestionBBDD_Tests;

import Clases.Usuario;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


public class CRUD_UsuarioTest {
    
    public CRUD_UsuarioTest() {
    }

    @Test
    public void testInsertUsuario() {
        ArrayList<Usuario> listaUsuariosEsperada = CRUD_Usuario.seleccionarListaUsuario();
        CRUD_Usuario.insertUsuario(listaUsuariosEsperada);
        ArrayList<Usuario> listaUsuariosResultado = CRUD_Usuario.seleccionarListaUsuario();
        assertEquals(listaUsuariosEsperada.size(), listaUsuariosResultado.size());
    }

    @Test
    public void testSeleccionarListaUsuario() {
        ArrayList<Usuario> listaUsuariosEsperada = CRUD_Usuario.seleccionarListaUsuario();
        CRUD_Usuario.insertUsuario(listaUsuariosEsperada);
        ArrayList<Usuario> listaUsuariosResultado = CRUD_Usuario.seleccionarListaUsuario();
        assertEquals(listaUsuariosEsperada.size(), listaUsuariosResultado.size());
    }

//    Para que esta prueba funcione debe haber algun usuario en la base datos.
    @Test
    public void testSeleccionarUsuario() {
        String usuario = "Gelote97";
        Usuario usuarioDevuelto = CRUD_Usuario.seleccionarUsuario(usuario);
        String resultado = usuarioDevuelto.getNick();
        assertEquals(usuario, resultado);
    }
    
}
