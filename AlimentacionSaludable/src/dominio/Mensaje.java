package dominio;

import java.io.Serializable;


public class Mensaje implements Serializable{
    
    //Atributos
     private static final long serialVersionUID = 6106269076155338045L;
    private Persona origen;
    private Persona destino;
    private String asunto;
    private String contenido;
    
    //Constructor
    public Mensaje() {
        Persona p = (Persona) new Usuario();
        this.origen = p;
        this.destino = p;
        this.asunto = "no tiene texto";
        this.contenido = "no tiene texto";
    }
    
    //Metodos de la clase Mensaje

    public Persona getOrigen() {
        return origen;
    }

    public void setOrigen(Persona origen) {
        this.origen = origen;
    }

    public Persona getDestino() {
        return destino;
    }

    public void setDestino(Persona destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    //Redefino toString

    @Override
    public String toString() {
        return "Mensaje de: "+ origen.getNombreUsuario() 
               + " con Asunto: " + asunto;
    }
    
}
