package GestionBBDD;

import Clases.Entrada;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CRUD_Entrada {
    public Boolean insertarEntrada(ArrayList<Entrada> listaEntradas){
        try {
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Entradas.txt");
            try(ObjectOutputStream finalFile = new ObjectOutputStream(file)){
                finalFile.writeObject(listaEntradas);
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha ocurrido un error al almacenar la entrada.");
        }
        return true;
    }
    public Boolean actualizarEntrada(Entrada entrada){
        return true;
    }
    public ArrayList<Entrada> seleccionarComentario(Entrada coment){
        ArrayList<Entrada> listaComentarios = null;
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Entradas.txt");
            ObjectInputStream inputFile = new ObjectInputStream(file)) {
            listaComentarios = (ArrayList<Entrada>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaComentarios;
    }
    public Boolean borrarEntrada(Entrada entrada){
        return true;
    }
}
