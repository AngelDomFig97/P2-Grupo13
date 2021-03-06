package GestionBBDD;

import Clases.Comentario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class CRUD_Comentario {
    public static Boolean insertarComentario(ArrayList<Comentario> listaComentarios){
        try {
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Comentarios.txt");
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
    
    public static ArrayList<Comentario> seleccionarComentario(){
        ArrayList<Comentario> listaComentarios = new ArrayList<>();
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Comentarios.txt")) {
            ObjectInputStream inputFile = new ObjectInputStream(file);
            listaComentarios = (ArrayList<Comentario>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            return listaComentarios;
        }
        return listaComentarios;
    }
    
    public Boolean borrarComentario(Comentario coment){
        return true;
    }
}
