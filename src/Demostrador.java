
import Clases.Usuario;
import Clases.Web;
import java.util.ArrayList;

public class Demostrador {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Web pruebaWeb = new Web();
        Usuario user = new Usuario();
        user.setNombre("Angel");
        user.setApellidos("Dominguez Figueros");
        user.setNick("Gelote97");
        user.setContraseña("manduca");
        user.setEmail("a.dominguezf.2018@alumnos.urjc.es");
        user.setTipoUsuario("Alumno");
        user.setPenalizado(false);
        listaUsuarios.add(user);
        //pruebaWeb.registrarse(listaUsuarios);
        
        Boolean iniciarSesion = pruebaWeb.iniciarSesion(user.getNick(), user.getContraseña());
        if (iniciarSesion)
            System.out.println("se ha iniciado sesion correctamente.");
        else
            System.out.println("la contraseña o el usuario introducidos son incorrectos.");
    }   
}
