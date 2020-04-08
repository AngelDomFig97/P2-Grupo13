package Clases;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String nick;
    private String contraseña;
    private String email;
    private String tipoUsuario;
    private String penalizado;
    
    public Usuario (){   
    }
    
    private boolean esUserURJC (){
        return true;
    }
    
    private boolean tipoUsuario (){
        return true;
    }
    
    public void penalizarUsuario (){       
    }
}
