
import Clases.Comentario;
import Clases.Ejercicio;
import Clases.Encuesta;
import Clases.Entrada;
import Clases.SubForo;
import Clases.Usuario;
import Clases.Web;
import GestionBBDD.CRUD_Comentario;
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
        ArrayList<Comentario> listaComentarios = CRUD_Comentario.seleccionarComentario();
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
        entrada1.setEjercicio(new Ejercicio("1) En el siguiente circuito, utilizando el modelo de diodo con caída de voltaje constante (VƔ = 0,7V):"));
        entrada1.CrearEntrada(listaEntradas, entrada1);
        foro1.anadirEntrada(entrada1);
        
        listaEntradas = CRUD_Entrada.seleccionarEntrada();
        System.out.println("Lista de entradas en el subforo: ");
        for (Entrada EntradaActual : listaEntradas){
            System.out.println("- " + EntradaActual.getTitulo());
        }
        
        Comentario comment = new Comentario();
        comment.setNombreUsuario(userActual);
        comment.setTexto("Deberiais poder resolver el ejercicio en menos de media hora, habra uno similar en el examen proximo.");
        comment.setFechaCreacion(fecha);
        comment.setPuntuacion(0);
        entrada1.anadirComentario(comment);
        comment.crearComentario(listaComentarios, comment);
        Comentario comment2 = new Comentario();
        comment2.setNombreUsuario(usuario1.getNick());
        comment2.setTexto("Podriamos tener una clase de resolucion de dudas antes de realizar dicho examen?");
        comment2.setFechaCreacion(fecha);
        comment2.setPuntuacion(0);
        comment2.crearComentario(listaComentarios, comment2);
        comment.addContestacionesComentarios(comment2);
        
        listaComentarios = CRUD_Comentario.seleccionarComentario();
        System.out.println("Lista de comentarios en la entrada:");
        for (Comentario comentarioActual : listaComentarios)
            System.out.println("- " + comentarioActual.getTexto());
        
        Entrada entrada2 = new Entrada();
        entrada2.setIdEntrada("6894");
        entrada2.setTitulo("Encuesta de fecha de examen.");
        entrada2.setSubforo(foro1);
        entrada2.setContenidoEntrada("En la siguiente encuesta se encuentran las posibles fechas para la realizacion de vuestro proximo examen.");
        entrada2.setPuntuacion(0);
        entrada2.setFechaCreacion(fecha);
        entrada2.setFechaUpdate(null);
        entrada2.setEncuesta(new Encuesta("\"Que dia de examen prefieres:\n" +
            "1. 23\n" +
            "2. 21\n" +
            "3. 12\n" +
            "4. 19\""));
        entrada2.CrearEntrada(listaEntradas, entrada2);
        foro1.anadirEntrada(entrada2);
        
        listaEntradas = CRUD_Entrada.seleccionarEntrada();
        System.out.println("Lista de entradas en el subforo: ");
        for (Entrada EntradaActual : listaEntradas){
            System.out.println("- " + EntradaActual.getTitulo());
        }
    }   
}
