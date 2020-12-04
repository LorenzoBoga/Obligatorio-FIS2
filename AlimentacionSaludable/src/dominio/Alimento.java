package dominio;

import java.io.Serializable;
import java.util.Optional;

public class Alimento implements Serializable {

    //Atrubutos
    private static final long serialVersionUID = 6106269076155338045L;
    private String nombre;
    private TipoAlimento tipo;
    private TipoAlimento[] listaEnumTipoAlimento = inicializoEnumTipoAlimento();
    private Nutrientes[] listaEnumNutrientes = inicializoEnumNutrientes();
    private boolean[] listaNutrientesSeleccionados;

    //Constructor
    public Alimento() {
        this.nombre = "sin nombre";
        this.tipo = TipoAlimento.OTRO;
        this.listaNutrientesSeleccionados = new boolean[listaEnumNutrientes.length];
    }

    //Metodos de la clase Aliemntos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlimento tipo) {
        this.tipo = tipo;
    }

    public Nutrientes[] getListaEnumNutrientes() {
        return listaEnumNutrientes;
    }

    public void setListaEnumNutrientes(Nutrientes[] listaEnumNutrientes) {
        this.listaEnumNutrientes = Optional
                .ofNullable(listaEnumNutrientes)
                .orElse(null);
    }

    public TipoAlimento[] getListaEnumTipoAlimento() {
        return listaEnumTipoAlimento;
    }

    public void setListaEnumTipoAlimento(TipoAlimento[] listaEnumTipoAlimento) {
        this.listaEnumTipoAlimento = Optional
                .ofNullable(listaEnumTipoAlimento)
                .orElse(null);
    }

    public boolean[] getListaNutrientesSeleccionados() {
        return listaNutrientesSeleccionados;
    }

    public void setListaNutrientesSeleccionados(boolean[] listaNutrientesSeleccionados) {
        this.listaNutrientesSeleccionados = Optional
                .ofNullable(listaNutrientesSeleccionados)
                .orElse(null);
    }

    public enum TipoAlimento {
        FRUTA, CEREAL, LEGUMBRE, CARNES_BLANCAS, CARNES_ROJAS, VEGETALES,
        EMBUTIDOS, LACTEOS, BEBIDAS, MARISCOS, POSTRES, OTRO,
        PROVENIENTE_DE_ANIMALES
    }

    public TipoAlimento[] inicializoEnumTipoAlimento() {
        return new TipoAlimento[] {
            TipoAlimento.BEBIDAS, TipoAlimento.CARNES_BLANCAS,
            TipoAlimento.CARNES_ROJAS, TipoAlimento.CEREAL,
            TipoAlimento.EMBUTIDOS, TipoAlimento.FRUTA,
            TipoAlimento.LACTEOS, TipoAlimento.LEGUMBRE,
            TipoAlimento.MARISCOS, TipoAlimento.OTRO,
            TipoAlimento.POSTRES, TipoAlimento.PROVENIENTE_DE_ANIMALES,
            TipoAlimento.VEGETALES
        };
    }

    public enum Nutrientes {
        PROTEINAS, LIPIDOS, HIDRATOS_DE_CARBONO, VITAMINAS, MINERALES, AGUA,
        FIBRA, NINGUNA
    }

    public Nutrientes[] inicializoEnumNutrientes() {
        return new Nutrientes[]{
            Nutrientes.AGUA, Nutrientes.FIBRA,
            Nutrientes.HIDRATOS_DE_CARBONO,
            Nutrientes.LIPIDOS, Nutrientes.MINERALES,
            Nutrientes.PROTEINAS, Nutrientes.VITAMINAS
        };
    }

    //redefino toString
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        return 7;
    }

    @Override
    public boolean equals(Object obj) {
        boolean retorno=true;
        if (obj == null) {
            retorno= false;
        }
        if (retorno && getClass() != obj.getClass()) {
            retorno= false;
        }
        if (retorno) {
            retorno=this.nombre.equals(((Alimento) obj).nombre);
        }
        return retorno;
    }
}
