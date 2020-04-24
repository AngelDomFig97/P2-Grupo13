
import Clases.Ejercicio;
import Clases.Entrada;
import Clases.SubForo;
import Clases.Usuario;
import Clases.Web;
import GestionBBDD.CRUD_Entrada;
import GestionBBDD.CRUD_SubForo;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Demostrador {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarListaUsuario();
        ArrayList<SubForo> listaSubForos = CRUD_SubForo.seleccionarSubForo();
        ArrayList<Entrada> listaEntradas = CRUD_Entrada.seleccionarEntrada();
        Usuario user = CRUD_Usuario.seleccionarUsuario("Alfonsot32");
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
        foro1.setNombreForo("Foro de Fisica");
        foro1.setNickCreador(userActual);
        if(user.getTipoUsuario().equals("Profesor"))
            foro1.crearSubForo(listaSubForos, foro1);
        else 
            System.out.println("Solo los profesores pueden crear subforos.");
        foro1.suscribirUsuario(usuario1);
        listaSubForos = CRUD_SubForo.seleccionarSubForo();
        System.out.println("Lista de foros disponibles:");
        for (SubForo subForoActual : listaSubForos){
            System.out.println("- " + subForoActual.getNombreForo());
        }
        
        Entrada entrada1 = new Entrada();
        entrada1.setIdEntrada("5817");
        entrada1.setTitulo("Ejercicios de diodos");
        entrada1.setContenidoEntrada("A continuacion inserto una serie de ejercicios de circuitos con diodos para que practiqueis para el examen.");
        entrada1.setPuntuacion(0);
        Date fecha = new Date();
        entrada1.setFechaCreacion(fecha);
        entrada1.setFechaUpdate(null);
        entrada1.setSubforo(foro1);
        entrada1.setEjercicio(new Ejercicio());
        entrada1.CrearEntrada(listaEntradas, entrada1);
        foro1.anadirEntrada(entrada1);
        
        listaEntradas = CRUD_Entrada.seleccionarEntrada();
        System.out.println("Lista de entradas en el subforo: ");
        for (Entrada EntradaActual : listaEntradas){
            System.out.println("- " + EntradaActual.getTitulo());
        }
        
    }   
}
