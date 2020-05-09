/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBBDD_Tests;

import Clases.SubForo;
import GestionBBDD.CRUD_SubForo;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angel Dominguez
 */
public class CRUD_SubForoTests {
    
    public CRUD_SubForoTests() {
    }
    
    //testInsertarEntrada y testSeleccionarEntrada funcionaran de la misma manera puesto que para insertar una entrada se debe seleccionar una lista de entradas, 
    //y a su vez esa misma lista se insertara y se volvera a seleccionar para ver si coinciden.
    @Test
    public void testInsertarSubForo() {
        ArrayList<SubForo> listaSubForosEsperado = CRUD_SubForo.seleccionarSubForo();
        CRUD_SubForo.insertarSubForo(listaSubForosEsperado);
        ArrayList<SubForo> listaSubForosResultado = CRUD_SubForo.seleccionarSubForo();
        assertEquals(listaSubForosEsperado.size(), listaSubForosResultado.size());
    }
    
    @Test
    public void testSeleccionarSubForo() {
        ArrayList<SubForo> listaSubForosEsperado = CRUD_SubForo.seleccionarSubForo();
        CRUD_SubForo.insertarSubForo(listaSubForosEsperado);
        ArrayList<SubForo> listaSubForosResultado = CRUD_SubForo.seleccionarSubForo();
        assertEquals(listaSubForosEsperado.size(), listaSubForosResultado.size());
    }
    
}
