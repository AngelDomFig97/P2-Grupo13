package Clases;

import java.io.Serializable;
import java.util.Date;


public class Notificacion implements Serializable {
    
    private String texto ;      
    private Date fechaNotificacion;
    private SubForo subForo;
    private Entrada  entrada;

    public Notificacion(){   
    }
    public Notificacion(String texto, Date fechaNotificacion, SubForo subForo, Entrada entrada) {
        this.texto = texto;
        this.fechaNotificacion = fechaNotificacion;
        this.subForo = subForo;
        this.entrada = entrada;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public SubForo getSubForo() {
        return subForo;
    }

    public void setSubForo(SubForo subForo) {
        this.subForo = subForo;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    
    
    
    
}
