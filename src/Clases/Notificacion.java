package Clases;

import java.util.Date;


public class Notificacion {
    
    private String texto ;      
    private Date fechaNotificacion;
    private SubForo subForo;
    private Entrada  entrada;

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
