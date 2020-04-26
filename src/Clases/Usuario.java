package Clases;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre;
    private String apellidos;
    private String nick;
    private String contraseña;
    private String email;
    private String tipoUsuario;
    private boolean penalizado;
    
    public Usuario (){   
    }
    
    private boolean esUserURJC (Usuario user) {
        return true;
    }
    
    private boolean tipoUsuario (Usuario user) {
        return true;
    }
    
    public void penalizarUsuario (Usuario user) {  
        user.penalizado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean getPenalizado() {
        return penalizado;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }
}