package GestionBBDD;

import Clases.SubForo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CRUD_SubForo {
    public static Boolean insertarSubForo(ArrayList<SubForo> listaSubForos){
        try{
            FileOutputStream file = new FileOutputStream("BaseDeDatos\\SubForos.txt");
            try (ObjectOutputStream finalFile = new ObjectOutputStream(file)) {
                finalFile.writeObject(listaSubForos);
                System.out.println("Se ha creado correctamente el subforo.");
            }
            return true;
        } catch (IOException e){
            System.out.println("Ha habido un problema a la hora de dar de alta el subForo.");
        }
        return null;
    }
    
    public static ArrayList<SubForo> seleccionarSubForo(){
        ArrayList<SubForo> listaSubForos = new ArrayList<>();
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\SubForos.txt")) {
            ObjectInputStream inputFile = new ObjectInputStream(file);
            listaSubForos = (ArrayList<SubForo>) inputFile.readObject();
        }catch (IOException | ClassNotFoundException e) {
            return listaSubForos;
        }
        return listaSubForos;
    }
    
    public Boolean actualizarSubForo(SubForo subForo){
        return true;
    }
    
    public Boolean borrarSubForo(SubForo subForo){
        ArrayList<SubForo> listaSubForos;
        try (FileInputStream file = new FileInputStream("BaseDeDatos\\SubForos.txt"); ObjectInputStream inputFile = new ObjectInputStream(file)) {
            listaSubForos = (ArrayList<SubForo>) inputFile.readObject();
            for (SubForo subForoActual : listaSubForos){
                //Se borraria el elemento de la lista
            }
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return true;
           
    }
}
