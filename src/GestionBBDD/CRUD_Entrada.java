package GestionBBDD;

import Clases.Entrada;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CRUD_Entrada {
    public static Boolean insertarEntrada(ArrayList<Entrada> listaEntradas){
        try{
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Entradas.txt");
            try (ObjectOutputStream finalFile = new ObjectOutputStream(file)) {
                finalFile.writeObject(listaEntradas);
                System.out.println("Se ha insertado correctamente la entrada.");
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha habido un problema a la hora de insertar la entrada.");
        }
        return false;
    }
    public Boolean actualizarEntrada(Entrada entrada){
        return true;
    }
    public static ArrayList<Entrada> seleccionarEntrada(){
        ArrayList<Entrada> listaEntradas = new ArrayList<>();
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Entradas.txt")) {
            ObjectInputStream inputFile = new ObjectInputStream(file);
            listaEntradas = (ArrayList<Entrada>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            return listaEntradas;
        }
        return listaEntradas;
    }
    public Boolean borrarEntrada(Entrada entrada){
        return true;
    }
}
