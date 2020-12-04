package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

public class Profesional extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombreTituloProf;
    private String fechaGraduacion;
    private Pais paisObtuvoTitulo;
    private Pais[] listaEnumPais = inicializoListaEnumPaises();
    private ArrayList<Mensaje> casillaDeEntrada;
    private String contraseña;
    //Constructor

    public Profesional() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario",
              "no ingreso fecha nacimiento", null,"no ingreso contrasñea");
        this.setFotoPerfil(new javax.swing
                           .ImageIcon(getClass()
                           .getResource
                           ("/imagenes/predeterminadaProfesional.png")));
        this.nombreTituloProf = "no ingreso titulo prof";
        this.fechaGraduacion = "no ingreso fecha graduacion";
        this.paisObtuvoTitulo = Pais.URUGUAY;
        this.casillaDeEntrada = new ArrayList<>();
    }

    // Metodos de la clase profesional

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public String getNombreTituloProf() {
        return nombreTituloProf;
    }

    public void setNombreTituloProf(String nombreTituloProf) {
        if(!nombreTituloProf.trim().isEmpty()){
            this.nombreTituloProf = nombreTituloProf;
        }
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        if(!fechaGraduacion.trim().isEmpty()){
            this.fechaGraduacion = fechaGraduacion;
        }
    }

    public Pais getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setPaisObtuvoTitulo(Pais paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }

    public Pais[] getListaEnumPais() {
        return listaEnumPais;
    }

    public void setListaEnumPais(Pais[] listaEnumPais) {
        this.listaEnumPais = Optional
                .ofNullable(listaEnumPais)
                .orElse(null);

    }

    public enum Pais {
        ALEMANIA, ARGENTINA, AUSTRALIA, AUSTRIA, BRASIL, CANADÁ, CHILE, CHINA,
        COLOMBIA, COREA_DEL_SUR, CUBA, ECUADOR, EGIPTO, ESPAÑA, ESTADOS_UNIDOS,
        FRANCIA, GRECIA, HOLANDA, INDIA, INGLATERRA, ISRAEL, ITALIA, JAPÓN,
        MÉXICO, PARAGUAY, PERÚ, PORTUGAL, RUSIA, SUDÁFRICA, URUGUAY, VENEZUELA
    }

    public Pais[] inicializoListaEnumPaises() {
        return new Pais[] {
            Pais.ALEMANIA, Pais.ARGENTINA, Pais.AUSTRALIA,
            Pais.AUSTRIA, Pais.BRASIL, Pais.CANADÁ,
            Pais.CHILE, Pais.CHINA, Pais.COLOMBIA,
            Pais.COREA_DEL_SUR, Pais.CUBA, Pais.ECUADOR,
            Pais.EGIPTO, Pais.ESPAÑA, Pais.ESTADOS_UNIDOS,
            Pais.FRANCIA, Pais.GRECIA, Pais.HOLANDA,
            Pais.INDIA, Pais.INGLATERRA, Pais.ISRAEL,
            Pais.ITALIA, Pais.JAPÓN, Pais.MÉXICO, Pais.PARAGUAY,
            Pais.PERÚ, Pais.PORTUGAL, Pais.RUSIA, Pais.SUDÁFRICA,
            Pais.URUGUAY, Pais.VENEZUELA
        };
    }

    //redefino toString
    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
}
