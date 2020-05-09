package GestionBBDD;

import Clases.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class CRUD_Usuario  {
    
    public static boolean insertUsuario(ArrayList<Usuario> listaUsuarios){
        try{
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\Usuarios.txt");
            try (ObjectOutputStream finalFile = new ObjectOutputStream(file)) {
                finalFile.writeObject(listaUsuarios);
                System.out.println("Se ha registrado correctamente.");
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha habido un problema a la hora de dar de alta el usuario.");
        }
        return false;
    }
    
    public static ArrayList<Usuario> seleccionarListaUsuario(){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Usuarios.txt");) {
            ObjectInputStream inputFile = new ObjectInputStream(file);
            listaUsuarios = (ArrayList<Usuario>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            return listaUsuarios;
        }
        return listaUsuarios;
    }
    
    public boolean updateUsuario(Usuario u){
        return true;
    }
    
    public boolean deleteUsuario(Usuario u){
        return true;
    }
    
    public static Usuario seleccionarUsuario(String nick){
        Usuario user = new Usuario();
        ArrayList<Usuario> listaUsuarios;
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\Usuarios.txt");) {
            ObjectInputStream inputFile = new ObjectInputStream(file);
            listaUsuarios = (ArrayList<Usuario>) inputFile.readObject();
            for (Usuario usuarioActual : listaUsuarios){
                if(usuarioActual.getNick().equals(nick)){
                    user = usuarioActual;
                    return user;
                }
            }
        }catch (IOException | ClassNotFoundException e) {
            return user;
        }
        return new Usuario();
    }
}
