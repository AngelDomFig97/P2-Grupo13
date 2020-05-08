
import Clases.Comentario;
import Clases.Ejercicio;
import Clases.Encuesta;
import Clases.Entrada;
import Clases.Notificacion;
import Clases.SubForo;
import Clases.Usuario;
import Clases.Web;
import GestionBBDD.CRUD_Comentario;
import GestionBBDD.CRUD_Entrada;
import GestionBBDD.CRUD_SubForo;
import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;
import java.util.Date;

public class Demostrador {

    public static void main(String[] args) {
        //Aqui se recogen todos los datos de la aplicacion en una lista, para mantener la persistencia de datos
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarListaUsuario();
        ArrayList<SubForo> listaSubForos = CRUD_SubForo.seleccionarSubForo();
        ArrayList<Entrada> listaEntradas = CRUD_Entrada.seleccionarEntrada();
        ArrayList<Comentario> listaComentarios = CRUD_Comentario.seleccionarComentario();
        String userActual, passActual;
        //Datos del nuevo usuario que vamos a insertar
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Angel");
        usuario1.setApellidos("Dominguez Figueros");
        usuario1.setNick("Gelote97");
        usuario1.setContrasena("bocataDeAtun");
        usuario1.setEmail("a.dominguezf.2018@alumnos.urcj.es");
        usuario1.setTipoUsuario("Alumno");
        usuario1.setPenalizado(false);
        Web web1 = new Web();
        web1.registrarse(listaUsuarios, usuario1);
        listaUsuarios = CRUD_Usuario.seleccionarListaUsuario();
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Alfonso");
        usuario2.setApellidos("Timón");
        usuario2.setNick("Alfonsot32");
        usuario2.setContrasena("transistorSalvaje");
        usuario2.setEmail("a.timon@urcj.es");
        usuario2.setTipoUsuario("Profesor");
        usuario2.setPenalizado(false);
        web1.registrarse(listaUsuarios, usuario2);
        //Estos seran el nick y la contrasena de usuario que va a estar logeado
        Usuario user = CRUD_Usuario.seleccionarUsuario("Alfonsot32");
        userActual = user.getNick();
        passActual = user.getContrasena();
        //Comprobamos si el inicio de sesion es correcto
        Boolean inicioSesionCorrecto = web1.iniciarSesion(userActual, passActual);
        if(inicioSesionCorrecto)
            System.out.println("Se ha iniciado sesion correctamente con el nick " + userActual);
        else
            System.out.println("El usuario o la contrasena introducida no son correctos.");
        //Aqui se creara un nuevo subForo
        SubForo foro1 = new SubForo();
        foro1.setNombreForo("Foro de Fisica");
        foro1.setNickCreador(userActual);
        //Solo se podra crear si el usuario logeado es un profesor
        if(user.getTipoUsuario().equals("Profesor"))
            foro1.crearSubForo(listaSubForos, foro1);
        else 
            System.out.println("Solo los profesores pueden crear subforos.");
        //Aqui se suscribira un usuario al subforo
        foro1.suscribirUsuario(usuario1);
        listaSubForos = CRUD_SubForo.seleccionarSubForo();
        //Se imprimirá una lista con todos los foros disponibles
        System.out.println("Lista de foros disponibles:");
        for (SubForo subForoActual : listaSubForos){
            System.out.println("- " + subForoActual.getNombreForo());
        }
        //Crearemos una nueva entrada en el subforo seleccionado
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
        //Aqui se mostraran todas las entradas disponibles de un subforo
        listaEntradas = CRUD_Entrada.seleccionarEntrada();
        System.out.println("Lista de entradas en el subforo: ");
        for (Entrada EntradaActual : listaEntradas){
            System.out.println("- " + EntradaActual.getTitulo());
        }
        //Usaremos esto para crear un comentario de una entrada, o para responder a otro comentario
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
        //lista de todos los comentarios creados en la aplicacion
        listaComentarios = CRUD_Comentario.seleccionarComentario();
        System.out.println("Lista de comentarios en la entrada:");
        for (Comentario comentarioActual : listaComentarios)
            System.out.println("- " + comentarioActual.getTexto());
        //Crearemos una segunda entrada con una encuesta
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
        Notificacion notify = foro1.crearNotificacion(entrada2, foro1, "Se ha creado una entrada en el subforo " + foro1.getNombreForo(), fecha);
        //Estos seran el nick y la contrasena de usuario que va a estar logeado
        user = CRUD_Usuario.seleccionarUsuario("Gelote97");
        userActual = user.getNick();
        passActual = user.getContrasena();
        //Iniciamos sesion con un alumno suscrito al foro para que reciba la notificacion de la creacion de la entrada
        inicioSesionCorrecto = web1.iniciarSesion(userActual, passActual);
        if(inicioSesionCorrecto)
            System.out.println("Se ha iniciado sesion correctamente con el nick " + userActual);
        else
            System.out.println("El usuario o la contrasena introducida no son correctos.");
        for (Usuario userSuscrito : foro1.getListaUsuarios()){
            if (userSuscrito.getNick().equals(userActual))
                web1.mostrarPopUp(notify);
            else 
                System.out.println("El usuario actual no esta suscrito a esta entrada");
        }
        //Volvemos a mostrar todas las entradas disponibles para un subforo
        listaEntradas = CRUD_Entrada.seleccionarEntrada();
        System.out.println("Lista de entradas en el subforo: ");
        for (Entrada EntradaActual : listaEntradas){
            System.out.println("- " + EntradaActual.getTitulo());
        }
    }   
}
