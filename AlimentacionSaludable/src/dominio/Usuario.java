package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.Serializable;
import java.util.Optional;

public class Usuario extends Persona implements Serializable {

    //Atributos
    private static final long serialVersionUID = 6106269076155338045L;
    private Nacionalidades nacionalidad;
    private Nacionalidades[] listaEnumNac;
    private double pesoKg;
    private double alturaCm;
    private Preferencias preferenciasAlimentarias;
    private Restricciones restricciones;
    private boolean[] listaRestricciones;
    private PlanDeAlimentacion plan;
    private boolean necesitoPlan;
    private Profesional profesionalAsignado;
    private String sexo;
    private ArrayList<ComidaPorDia> historialComidas;
    private ComidaPorDia historialDelDia;
    private ArrayList<Mensaje> casillaDeEntrada;
    private String fechaUltimaAdicion;
    private String contraseña;
    private String noSeIngreso= "no se ingreso";
    //Costructor
    public Usuario(Nacionalidades nacionalidad, double pesoKg, double alturaCm,
            Preferencias preferenciasAlimentarias, Restricciones restricciones,
            PlanDeAlimentacion plan, String sexo, String nombre,
            String apellidos, String nombreUsuario, String fechaNacimiento,
            ImageIcon fotoPerfil, String unaContraseña) {
        super(nombre, apellidos, nombreUsuario, fechaNacimiento, fotoPerfil,unaContraseña);
        this.nacionalidad = nacionalidad;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
        this.preferenciasAlimentarias = preferenciasAlimentarias;
        this.restricciones = restricciones;
        this.listaRestricciones = new boolean[5];
        this.plan = plan;
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.sexo = sexo;
        this.historialComidas = new ArrayList<>();
        this.historialDelDia = new ComidaPorDia();
        this.listaEnumNac = inicializoListaEnum();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = noSeIngreso;
        this.contraseña = unaContraseña;
    }

    public Usuario() {
        super("no ingreso nombre", "no ingreso apellido", "no ingreso usuario",
              "no ingreso fecha nacimiento", null, "no ingreso contraseña");
        this.setFotoPerfil(new javax
                           .swing.ImageIcon(getClass()
                           .getResource
                           ("/imagenes/predeterminadaUsuario.jpg")));
        this.nacionalidad = Nacionalidades.URUGUAYA;
        this.pesoKg = 0;
        this.alturaCm = 0;
        this.preferenciasAlimentarias = Preferencias.NINGUNA;
        this.restricciones = Restricciones.NINGUNA;
        this.listaRestricciones = new boolean[5];
        this.necesitoPlan = false;
        this.profesionalAsignado = new Profesional();
        this.plan = new PlanDeAlimentacion(this);
        this.sexo = noSeIngreso;
        this.historialComidas = new ArrayList<>();
        this.historialDelDia = new ComidaPorDia();
        this.listaEnumNac = inicializoListaEnum();
        this.casillaDeEntrada = new ArrayList<>();
        this.fechaUltimaAdicion = noSeIngreso;
    }

    // Metodos de la clase usuario
    public String getFechaUltimaAdicion() {
        return fechaUltimaAdicion;
    }

    public void setFechaUltimaAdicion(String fechaUltimaAdicion) {
        this.fechaUltimaAdicion = fechaUltimaAdicion;
    }

    public ComidaPorDia getHistorialDelDia() {
        return historialDelDia;
    }

    public void setHistorialDelDia(ComidaPorDia historialDelDia) {
        this.historialDelDia = historialDelDia;
    }

    public Profesional getProfesionalAsignado() {
        return profesionalAsignado;
    }

    public void setProfesionalAsignado(Profesional profesionalAsignado) {
        this.profesionalAsignado = profesionalAsignado;
    }

    public ArrayList<Mensaje> getCasillaDeEntrada() {
        return casillaDeEntrada;
    }

    public void setCasillaDeEntrada(ArrayList<Mensaje> casillaDeEntrada) {
        this.casillaDeEntrada = casillaDeEntrada;
    }

    public Nacionalidades getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidades nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Nacionalidades[] getListaEnumNac() {
        return listaEnumNac;
    }

    public void setListaEnumNac(Nacionalidades[] listaEnumNac) {
        this.listaEnumNac = Optional
                .ofNullable(listaEnumNac)
                .orElse(null);
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if(pesoKg > 0 && pesoKg < 501){
            this.pesoKg = pesoKg;
        }
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        if(alturaCm > 0 && alturaCm < 266){
            this.alturaCm = alturaCm;
        }
    }

    public Preferencias getPreferenciasAlimentarias() {
        return preferenciasAlimentarias;
    }

    public void setPreferenciasAlimentarias(Preferencias
                                            preferenciasAlimentarias) {
        this.preferenciasAlimentarias = preferenciasAlimentarias;
    }

    public Restricciones getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(Restricciones restricciones) {
        this.restricciones = restricciones;
    }

    public PlanDeAlimentacion getPlan() {
        return plan;
    }

    public void setPlan(PlanDeAlimentacion plan) {
        this.plan = plan;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo.equals("Masculino") || sexo.equals("Femenino")){
            this.sexo = sexo;
        }
    }

    public boolean[] getListaRestricciones() {
        return listaRestricciones;
    }

    public void setListaRestricciones(boolean[] listaRestricciones) {
        this.listaRestricciones = Optional
                .ofNullable(listaRestricciones)
                .orElse(null);
    }

    public boolean isNecesitoPlan() {
        return necesitoPlan;
    }

    public void setNecesitoPlan(boolean necesitoPlan) {
        this.necesitoPlan = necesitoPlan;
    }

    public ArrayList<ComidaPorDia> getHistorialComidas() {
        return historialComidas;
    }

    public void setHistorialComidas(ArrayList<ComidaPorDia> historialComidas) {
        this.historialComidas = historialComidas;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }
    
    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public enum Nacionalidades {
        ALEMANA, ARGENTINA, AUSTRALIANA, AUSTRIACA, BRASILEÑA, CANADIENSE,
        CHILENA, CHINA, COLOMBIANA, CUBANA, ECUATORIANA, EGIPCIA,
        ESPAÑOLA, ESTADOUNIDENSE, FRANCESA, GRIEGA, HOLANDESA, INDIA, INGLESA,
        ISRAELI, ITALIANA, JAPONESA, MEXICANA, PARAGUAYA, PERUANA, PORTUGUESA,
        RUSA, SUDÁFRICANA, SURCOREANA, URUGUAYA, VENEZOLANA
    }

    String[] inicializoListaNacionalidades() {
        String[] listaPaisesPivot = {"ALEMANA", "AUSTRALIANA", "AUSTRIACA",
            "BRASILEÑA","CANADIENSE", "CHILENA", "CHINA", "COLOMBIANA",
            "SURCOREANA", "CUBANA", "ECUATORIANA", "EGIPCIA",
            "ESPAÑOLA", "ESTADOUNIDENSE", "FRANCESA", "GRIEGA",
            "HOLANDESA", "INDIA", "INGLESA", "ISRAELI", "ITALIANA",
            "JAPONESA", "MEXICANA", "PARAGUAYA", "PERUANA",
            "PORTUGUESA", "RUSA", "SUDÁFRICANA", "URUGUAYA",
            "VENEZOLANA"};
        return listaPaisesPivot;
    }

    public Nacionalidades[] inicializoListaEnum() {
        return new Nacionalidades[] {Nacionalidades.ALEMANA, Nacionalidades.ARGENTINA,
            Nacionalidades.AUSTRALIANA, Nacionalidades.AUSTRIACA,
            Nacionalidades.BRASILEÑA, Nacionalidades.CANADIENSE,
            Nacionalidades.CHILENA, Nacionalidades.CHINA,
            Nacionalidades.COLOMBIANA, Nacionalidades.SURCOREANA,
            Nacionalidades.CUBANA, Nacionalidades.ECUATORIANA, 
            Nacionalidades.EGIPCIA, Nacionalidades.ESPAÑOLA, 
            Nacionalidades.ESTADOUNIDENSE, Nacionalidades.FRANCESA,
            Nacionalidades.GRIEGA, Nacionalidades.HOLANDESA,
            Nacionalidades.INDIA, Nacionalidades.INGLESA,
            Nacionalidades.ISRAELI, Nacionalidades.ITALIANA,
            Nacionalidades.JAPONESA, Nacionalidades.MEXICANA,
            Nacionalidades.PARAGUAYA, Nacionalidades.PERUANA,
            Nacionalidades.PORTUGUESA, Nacionalidades.RUSA,
            Nacionalidades.SUDÁFRICANA, Nacionalidades.URUGUAYA,
            Nacionalidades.VENEZOLANA};
    }

    public enum Preferencias {
        VEGANO, VEGETARIANO, MACROBIOTICO, ORGANICO, NINGUNA
    }

    public enum Restricciones {
        CELIACO, INOLERANTE_A_LA_LACTOSA, DIABETICO, HIPERTENSION, NINGUNA
    }

    @Override
    public String toString() {
        return "Usuario: " + this.getNombreUsuario();
    }
}
