package GestionBBDD_Tests;

import Clases.Comentario;
import GestionBBDD.CRUD_Comentario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class CRUD_ComentarioTest {
    
    public CRUD_ComentarioTest() {
    }
    
    //testInsertarComentario y testSeleccionarComentario funcionaran de la misma manera puesto que para insertar un comentario se debe seleccionar una lista de comentarios, 
    //y a su vez esa misma lista se insertara y se volvera a seleccionar para ver si coinciden.
    @Test
    public void testInsertarComentario() {
        ArrayList<Comentario> listaComentariosEsperado = CRUD_Comentario.seleccionarComentario();
        CRUD_Comentario.insertarComentario(listaComentariosEsperado);
        ArrayList<Comentario> listaComentariosResultado = CRUD_Comentario.seleccionarComentario();
        assertEquals(listaComentariosEsperado.size(), listaComentariosResultado.size());
    }
    
    @Test
    public void testSeleccionarComentario() {
        ArrayList<Comentario> listaComentariosEsperado = CRUD_Comentario.seleccionarComentario();
        CRUD_Comentario.insertarComentario(listaComentariosEsperado);
        ArrayList<Comentario> listaComentariosResultado = CRUD_Comentario.seleccionarComentario();
        assertEquals(listaComentariosEsperado.size(), listaComentariosResultado.size());
    }
}
