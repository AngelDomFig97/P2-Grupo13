
package Clases;
        

public class Usuario {
    
    private String name, surname, nick, password, email, userType;
    private boolean penalized;
    
    public boolean isUserUrjc(Usuario user) {
    
        return false;        
    }
    
    public String typeUser(Usuario user) {
        
        return null;
    }
    
    public void setUserType(String type) {
        
        this.userType = type;
          
    }
    
    public void penalizeUser() {
        penalized = true;
    }
}
