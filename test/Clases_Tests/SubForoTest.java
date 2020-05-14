package Clases_Tests;

import Clases.Entrada;
import Clases.Notificacion;
import Clases.SubForo;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubForoTest {
    SubForo sf;
    public SubForoTest() {
        sf  = new SubForo("Foro de prueba jUnit", "Nick de creador de prueba", new ArrayList<>(), new ArrayList<>());
    }

    @Test
    public void testCrearNotificacion() {
        Date fecha = new Date();
        SubForo sfNot = new SubForo();
        Entrada entradaNot = new Entrada();
        Notificacion notEsperada = new Notificacion("notificacion de prueba", fecha, sfNot, entradaNot);
        
        Notificacion notResultado = sf.crearNotificacion(entradaNot, sfNot, "notificacion de prueba", fecha);
        assertEquals(notEsperada.getTexto(), notResultado.getTexto());
        assertEquals(notEsperada.getFechaNotificacion(), notResultado.getFechaNotificacion());
        assertEquals(notEsperada.getSubForo(), notResultado.getSubForo());
        assertEquals(notEsperada.getEntrada(), notResultado.getEntrada());
    }
    
    //vistoBueno No se va a realizar una prueba de este metodo porque solo hace un return true
    //CrearSubforo no se va a realizar una prueba de este metodo puesto que es un void y no devuelve nada, se probara el metodo insertarSubForo
    
    @Test
    public void testAnadirEntrada() {
        SubForo sfEnt = new SubForo();
        ArrayList<Entrada> listaEntradas;
        listaEntradas = sfEnt.getListaEntradas();
        sfEnt.anadirEntrada(new Entrada());
        assertEquals(listaEntradas.size(), sfEnt.getListaEntradas().size());
    }
    
    @Test
    public void testSuscribirUsuario(){
        SubForo sfEnt = new SubForo();
        ArrayList<Usuario> listaUsuarios;
        listaUsuarios = sfEnt.getListaUsuarios();
        sfEnt.suscribirUsuario(new Usuario());
        assertEquals(listaUsuarios.size(), sfEnt.getListaUsuarios().size());
    }
    
    @Test
    public void testGetNombreForo(){
        String esperado = "Foro de prueba jUnit";
        String resultado = sf.getNombreForo();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testGetNickCreador(){
        String esperado = "Nick de creador de prueba";
        String resultado = sf.getNickCreador();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testGetListaEntradas(){
        ArrayList<Entrada> esperado = new ArrayList<>();
        ArrayList<Entrada> resultado = sf.getListaEntradas();
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testGetListaUsuarios(){
        ArrayList<Usuario> esperado = new ArrayList<>();
        ArrayList<Usuario> resultado = sf.getListaUsuarios();
        assertEquals(esperado, resultado);
    }
}
