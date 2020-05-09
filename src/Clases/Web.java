package Clases;

import GestionBBDD.CRUD_Usuario;
import java.util.ArrayList;
import java.util.Date;

public class Web {
    
    private String mensajePopUp;
    public Date fecha;
    public ArrayList<Entrada> listaEntradasPopulares = new ArrayList<>();

    public String getMensajePopUp() {
        return mensajePopUp;
    }

    public void setMensajePopUp(String mensajePopUp) {
        this.mensajePopUp = mensajePopUp;
    }
    
    public boolean registrarse (ArrayList<Usuario> listaUsuarios, Usuario nuevoUser){
        listaUsuarios.add(nuevoUser);
        CRUD_Usuario.insertUsuario(listaUsuarios);
        return true;
    }
   
    public Boolean iniciarSesion (String nick, String contrasena){
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarListaUsuario();
        for (Usuario usuarioActual : listaUsuarios){
            if (usuarioActual.getNick().equals(nick)){
                return usuarioActual.getContrasena().equals(contrasena);
            }
        }   
        return false;
    }
    
    public void mostrarPopUp (Notificacion mensaje){
        System.out.println(mensaje.getTexto());
    }
}
