/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBBDD_Tests;

import Clases.Usuario;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bugat
 */
public class CRUD_UsuarioTest {
    
    public CRUD_UsuarioTest() {
    }

    /**
     * Test of insertUsuario method, of class CRUD_Usuario.
     */
    @Test
    public void testInsertUsuario() {
        ArrayList<Usuario> listaUsuariosEsperada = CRUD_Usuario.seleccionarListaUsuario();
        CRUD_Usuario.insertUsuario(listaUsuariosEsperada);
        ArrayList<Usuario> listaUsuariosResultado = CRUD_Usuario.seleccionarListaUsuario();
        assertEquals(listaUsuariosEsperada.size(), listaUsuariosResultado.size());
    }

    /**
     * Test of seleccionarListaUsuario method, of class CRUD_Usuario.
     */
    @Test
    public void testSeleccionarListaUsuario() {
        ArrayList<Usuario> listaUsuariosEsperada = CRUD_Usuario.seleccionarListaUsuario();
        CRUD_Usuario.insertUsuario(listaUsuariosEsperada);
        ArrayList<Usuario> listaUsuariosResultado = CRUD_Usuario.seleccionarListaUsuario();
        assertEquals(listaUsuariosEsperada.size(), listaUsuariosResultado.size());
    }

    /**
     * Test of seleccionarUsuario method, of class CRUD_Usuario.
     */
    @Test
    public void testSeleccionarUsuario() {
    }
    
}
