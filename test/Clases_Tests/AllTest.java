/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Tests;
import GestionBBDD_Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ComentarioTest.class, 
                EjercicioTest.class,
                EncuestaTest.class,
                EntradaTest.class,
                SubForoTest.class, 
                UsuarioTest.class, 
                WebTest.class,
                CRUD_ComentarioTest.class,
                CRUD_EntradaTests.class,
                CRUD_SubForoTests.class,
                CRUD_UsuarioTest.class
})

public class AllTest {
    
    
    
}
