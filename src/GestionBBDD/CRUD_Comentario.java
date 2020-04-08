/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBBDD;

import Clases.Comentario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Angel Dominguez
 */
public class CRUD_Comentario {
    public Boolean insertarComentario(ArrayList<Comentario> listaComentarios){
        try {
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Comentario.txt");
            try(ObjectOutputStream finalFile = new ObjectOutputStream(file)){
                finalFile.writeObject(listaComentarios);
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha ocurrido un error al almacenar los comentarios.");
        }
        return true;
    }
    
    public Boolean actualizarComentario(Comentario coment){
        return true;
    }
    
    public ArrayList<Comentario> seleccionarComentario(Comentario coment){
        ArrayList<Comentario> listaComentarios = null;
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\SubForos.txt");
            ObjectInputStream inputFile = new ObjectInputStream(file)) {
            listaComentarios = (ArrayList<Comentario>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaComentarios;
    }
    
    public Boolean borrarComentario(Comentario coment){
        return true;
    }
}
