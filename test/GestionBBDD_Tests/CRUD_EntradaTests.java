package GestionBBDD_Tests;

import Clases.Entrada;
import GestionBBDD.CRUD_Entrada;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class CRUD_EntradaTests {
    
    public CRUD_EntradaTests() {
        
    }
    
    //testInsertarEntrada y testSeleccionarEntrada funcionaran de la misma manera puesto que para insertar una entrada se debe seleccionar una lista de entradas, 
    //y a su vez esa misma lista se insertara y se volvera a seleccionar para ver si coinciden.
    @Test
    public void testInsertarEntrada() {
        ArrayList<Entrada> listaEntradasEsperado = CRUD_Entrada.seleccionarEntrada();
        CRUD_Entrada.insertarEntrada(listaEntradasEsperado);
        ArrayList<Entrada> listaEntradasResultado = CRUD_Entrada.seleccionarEntrada();
        assertEquals(listaEntradasEsperado.size(), listaEntradasResultado.size());
    }
    
    @Test
    public void testSeleccionarEntrada() {
        ArrayList<Entrada> listaEntradasEsperado = CRUD_Entrada.seleccionarEntrada();
        CRUD_Entrada.insertarEntrada(listaEntradasEsperado);
        ArrayList<Entrada> listaEntradasResultado = CRUD_Entrada.seleccionarEntrada();
        assertEquals(listaEntradasEsperado.size(), listaEntradasResultado.size());
    }
    
}
