package Clases;

public class Web {
    
    private String mensajePopUp;

    public String getMensajePopUp() {
        return mensajePopUp;
    }

    public void setMensajePopUp(String mensajePopUp) {
        this.mensajePopUp = mensajePopUp;
    }
    
    public Usuario registrarse (){
        return new Usuario();
    }
    
    public Boolean iniciarSesion (){
        return true;
    }
    
    public Entrada mostrarEntradasPopulares (){
        return new Entrada();
    }
    
    public void mostrarPopUp (String mensaje){
        
    }
}
