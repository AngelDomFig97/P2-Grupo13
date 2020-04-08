package GestionBBDD;

import Clases.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CRUD_Usuario {
    
    public static boolean insertUsuario(ArrayList<Usuario> listaUsuarios){
        try{
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Usuarios.txt");
            try (ObjectOutputStream finalFile = new ObjectOutputStream(file)) {
                finalFile.writeObject(listaUsuarios);
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha habido un problema a la hora de dar de alta el usuario.");
        }
        boolean bool = true;
        return bool;
    }
    
    public static ArrayList<Usuario> seleccionarUsuario(){
        ArrayList<Usuario> listaUsuarios = null;

        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Usuarios.txt"); ObjectInputStream inputFile = new ObjectInputStream(file)) {
            listaUsuarios = (ArrayList<Usuario>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaUsuarios;
    }
    
    public boolean updateUsuario(Usuario u){
        return true;
    }
    
    public boolean deleteUsuario(Usuario u){
        return true;
    }
    
}
