package Clases;

import GestionBBDD.CRUD_SubForo;
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
    
    public boolean registrarse (ArrayList<Usuario> listaUsuarios){
        CRUD_Usuario.insertUsuario(listaUsuarios);
        return true;
    }
   
    public Boolean iniciarSesion (String nick, String contraseña){
        ArrayList<Usuario> listaUsuarios = CRUD_Usuario.seleccionarUsuario();
        for (Usuario usuarioActual : listaUsuarios){
            if (usuarioActual.getNick().equals(nick)){
                if (usuarioActual.getContraseña().equals(contraseña))
                    return true;
                else 
                    return false;
            }
        }   
        return false;
    }
    
    public void crearSubForo (ArrayList<SubForo> listaSubForos, SubForo nuevoSubForo){
        listaSubForos.add(nuevoSubForo);
        CRUD_SubForo.insertarSubForo(listaSubForos);
    }
    
    public Entrada mostrarEntradasPopulares (){
        return new Entrada();
    }
    
    public void mostrarPopUp (String mensaje){
        
    }
}
