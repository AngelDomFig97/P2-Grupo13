
import Clases.SubForo;
import Clases.Usuario;
import Clases.Web;
import GestionBBDD.CRUD_SubForo;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;

public class Demostrador {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarUsuario();
        ArrayList<SubForo> listaSubForos = CRUD_SubForo.seleccionarSubForo();
        String userActual, passActual;
        userActual = "Alfonsot32";
        passActual = "transistorSalvaje";
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Angel");
        usuario1.setApellidos("Dominguez Figueros");
        usuario1.setNick("Gelote97");
        usuario1.setContraseña("bocataDeAtun");
        usuario1.setEmail("a.dominguezf.2018@alumnos.urcj.es");
        usuario1.setTipoUsuario("Alumno");
        usuario1.setPenalizado(false);
        Web web1 = new Web();
//        web1.registrarse(listaUsuarios, usuario1);
        Boolean inicioSesionCorrecto = web1.iniciarSesion(userActual, passActual);
        if(inicioSesionCorrecto)
            System.out.println("Se ha iniciado sesion correctamente");
        else
            System.out.println("El usuario o la contraseña introducida no son correctos.");
        
        SubForo foro1 = new SubForo();
        foro1.crearSubForo(listaSubForos, foro1);
        foro1.setNombreForo("Foro de Fisica");
        foro1.setNickCreador(userActual);
        foro1.suscribirUsuario(usuario1);
//        foro1.setListaUsuarios(listaUsuarios);
    }   
}
