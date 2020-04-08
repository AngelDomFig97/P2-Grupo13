
import Clases.SubForo;
import Clases.Usuario;
import GestionBBDD.CRUD_SubForo;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;

public class Demostrador {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarUsuario();
        ArrayList<SubForo> listaSubForos = CRUD_SubForo.seleccionarSubForo();
    }   
}
