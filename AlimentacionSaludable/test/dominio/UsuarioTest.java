package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test 
    public void testInicializoListaNacionalidades(){
        Usuario instance = new Usuario();
        String[] expResult = {"Alemana", "Australiana", "Austriaca",
            "Brasileña","Canadiense", "Chilena", "China", "Colombiana",
            "Surcoreana", "Cubana", "Ecuatoriana", "Egipcia",
            "Española", "EstadoUnidense", "Francesa", "Griega",
            "Holandesa", "India", "Inglesa", "Israeli", "Italiana",
            "Japonesa", "Méxicana", "Paraguaya", "Peruana",
            "Portuguesa", "Rusa", "Sudáfricana", "Uruguaya",
            "Venezolana"};
        String[] result = instance.inicializoListaNacionalidades();
        Assert.assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testGetAlturaCm(){
        Usuario instance = new Usuario();
        double expResult = 0;
        instance.setAlturaCm(0);
        double result = instance.getAlturaCm();
        assertEquals((int)expResult, (int)result);
    }
    
    @Test
    public void testSetProfesionalAsignado(){
        Usuario instance = new Usuario();
        Profesional expResult = new Profesional();
        instance.setProfesionalAsignado(expResult);
        assertEquals(expResult, instance.getProfesionalAsignado());
    }
    
    @Test
    public void tesGetProfesionalAsignado(){
        Usuario instance = new Usuario();
        Profesional expResult = new Profesional();
        instance.setProfesionalAsignado(expResult);
        Profesional result = instance.getProfesionalAsignado();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCasillaDeEntrada(){
        Usuario instance = new Usuario();
        ArrayList<Mensaje> expResult = new ArrayList();
        ArrayList<Mensaje> result = instance.getCasillaDeEntrada();
        instance.setCasillaDeEntrada(expResult);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetCasillaDeEntrada(){
        Usuario instance = new Usuario();
        ArrayList<Mensaje> expResult = new ArrayList();
        instance.setCasillaDeEntrada(expResult);
        assertEquals(expResult, instance.getCasillaDeEntrada());
    }
    
    @Test
    public void testGetContraseña(){
        Usuario instance = new Usuario();
        instance.setContraseña("contraseña");
        String expResult = "contraseña";
        String result = instance.getContraseña();
        assertEquals(expResult, result);
    }
    
    public void testSetContraseña(){
        Usuario instance = new Usuario();
        String contraseña = "contraseña";
        instance.setContraseña(contraseña);
        assertEquals(contraseña, instance.getContraseña());
    }
    
    @Test
    public void testGetFechaUltimaAdicion() {
        System.out.println("getFechaUltimaAdicion");
        Usuario instance = new Usuario();
        String expResult = "no se ingreso";
        String result = instance.getFechaUltimaAdicion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFechaUltimaAdicion() {
        System.out.println("setFechaUltimaAdicion");
        String fechaUltimaAdicion = "10/12/16";
        Usuario instance = new Usuario();
        instance.setFechaUltimaAdicion(fechaUltimaAdicion);
    }

    @Test
    public void testGetHistorialDelDia() {
        System.out.println("getHistorialDelDia");
        Usuario instance = new Usuario();
        ComidaPorDia expResult = new ComidaPorDia();
        ComidaPorDia result = instance.getHistorialDelDia();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetHistorialDelDia() {
        System.out.println("setHistorialDelDia");
        ComidaPorDia historialDelDia = new ComidaPorDia();
        Usuario instance = new Usuario();
        instance.setHistorialDelDia(historialDelDia);
        assertEquals(historialDelDia, instance.getHistorialDelDia());
    }


    @Test
    public void testGetNacionalidadEgipcia() {
        System.out.println("getNacionalidadEgipcia");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.EGIPCIA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.EGIPCIA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEgipcia() {
        System.out.println("setNacionalidadEgipcia");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.EGIPCIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadEspañola() {
        System.out.println("getNacionalidadEspañola");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.ESPAÑOLA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.ESPAÑOLA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEspañola() {
        System.out.println("setNacionalidadEspañola");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.ESPAÑOLA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadEstadoUnidense() {
        System.out.println("getNacionalidadEstadoUnidense");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.ESTADOUNIDENSE);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.ESTADOUNIDENSE;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadEstadoUnidense() {
        System.out.println("setNacionalidadEstadoUnidense");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.ESTADOUNIDENSE;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadFrancesa() {
        System.out.println("getNacionalidadFrancesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.FRANCESA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.FRANCESA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadFrancesa() {
        System.out.println("setNacionalidadFrancesa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.FRANCESA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadGriega() {
        System.out.println("getNacionalidadGriega");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.GRIEGA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.GRIEGA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadGriega() {
        System.out.println("setNacionalidadGriega");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.GRIEGA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadHolandesa() {
        System.out.println("getNacionalidadHolandesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.HOLANDESA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.HOLANDESA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadHolandesa() {
        System.out.println("setNacionalidadHolandesa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.GRIEGA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadIndia() {
        System.out.println("getNacionalidadIndia");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.INDIA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.INDIA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadIndia() {
        System.out.println("setNacionalidadIndia");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.INDIA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadInglesa() {
        System.out.println("getNacionalidadInglesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.INGLESA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.INGLESA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadInglesa() {
        System.out.println("setNacionalidadInglesa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.INGLESA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadIsraeli() {
        System.out.println("getNacionalidadIsraeli");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.ISRAELI);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.ISRAELI;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadIsraeli() {
        System.out.println("setNacionalidadIsraeli");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.ISRAELI;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadItaliana() {
        System.out.println("getNacionalidadItaliana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.ITALIANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.ITALIANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadItaliana() {
        System.out.println("setNacionalidadItaliana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.ITALIANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadJaponesa() {
        System.out.println("getNacionalidadJaponesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.JAPONESA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.JAPONESA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadJaponesa() {
        System.out.println("setNacionalidadJaponesa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.JAPONESA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadMéxicana() {
        System.out.println("getNacionalidadMéxicana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.MEXICANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.MEXICANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadMéxicana() {
        System.out.println("setNacionalidadMéxicana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.MEXICANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadParaguaya() {
        System.out.println("getNacionalidadParaguaya");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.PARAGUAYA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.PARAGUAYA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadParaguaya() {
        System.out.println("setNacionalidadParaguaya");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.PARAGUAYA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadPeruana() {
        System.out.println("getNacionalidadPeruana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.PERUANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.PERUANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadPeruana() {
        System.out.println("setNacionalidadPeruana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.PERUANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadPortuguesa() {
        System.out.println("getNacionalidadPortuguesa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.PORTUGUESA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.PORTUGUESA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadPortuguesa() {
        System.out.println("setNacionalidadPortuguesa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.PORTUGUESA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadRusa() {
        System.out.println("getNacionalidadRusa");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.RUSA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.RUSA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadRusa() {
        System.out.println("setNacionalidadRusa");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.RUSA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadSudáfricana() {
        System.out.println("getNacionalidadSudáfricana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.SUDÁFRICANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.SUDÁFRICANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadSudáfricana() {
        System.out.println("setNacionalidadSudáfricana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.SUDÁFRICANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadSurcoreana() {
        System.out.println("getNacionalidadSurcoreana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.SURCOREANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.SURCOREANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadSurcoreana() {
        System.out.println("setNacionalidadSurcoreana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.SURCOREANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadUruguaya() {
        System.out.println("getNacionalidadUruguaya");
        Usuario instance = new Usuario();
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.URUGUAYA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadUruguaya() {
        System.out.println("setNacionalidadUruguaya");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.URUGUAYA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetNacionalidadVenezolana() {
        System.out.println("getNacionalidadVenezolana");
        Usuario instance = new Usuario();
        instance.setNacionalidad(Usuario.Nacionalidades.VENEZOLANA);
        Usuario.Nacionalidades expResult = Usuario.Nacionalidades.VENEZOLANA;
        Usuario.Nacionalidades result = instance.getNacionalidad();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNacionalidadVenezolana() {
        System.out.println("setNacionalidadVenezolana");
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.VENEZOLANA;
        Usuario instance = new Usuario();
        instance.setNacionalidad(nacionalidad);
        assertEquals(nacionalidad, instance.getNacionalidad());
    }

    @Test
    public void testGetListaEnumNac() {
        System.out.println("getListaEnumNac");
        Usuario instance = new Usuario();
        Usuario.Nacionalidades[] expResult = instance.inicializoListaEnum();
        Usuario.Nacionalidades[] result = instance.getListaEnumNac();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaEnumNac() {
        System.out.println("setListaEnumNac");
        Usuario instance = new Usuario();
        Usuario.Nacionalidades[] listaEnumNac = instance.inicializoListaEnum();
        instance.setListaEnumNac(listaEnumNac);
        assertArrayEquals(instance.getListaEnumNac(), listaEnumNac);
    }

    @Test
    public void testGetPesoKg() {
        System.out.println("getPesoKg");
        Usuario instance = new Usuario();
        double expResult = 0;
        double result = instance.getPesoKg();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetPesoKg() {
        System.out.println("setPesoKg");
        Usuario instance = new Usuario();
        double pesoKg = 0;
        instance.setPesoKg(pesoKg);
        assertEquals(instance.getPesoKg(), pesoKg, 0.0);
    }
    
    @Test
    public void testSetPesoKgInvalido() {
        System.out.println("setPesoKgInvalido");
        Usuario instance = new Usuario();
        double pesoKg = -1;
        instance.setPesoKg(pesoKg);
        assertFalse(instance.getPesoKg()==pesoKg);
    }
    
    
    @Test
    public void testSetSexoF() {
        System.out.println("setSexoM");
        String sexo = "Femenino";
        Usuario instance = new Usuario();
        instance.setSexo(sexo);
        assertEquals(sexo, instance.getSexo());
    }

    @Test
    public void testGetListaRestricciones() {
        System.out.println("getListaRestricciones");
        Usuario instance = new Usuario();
        boolean[] expResult = new boolean[5];
        boolean[] result = instance.getListaRestricciones();
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSetListaRestricciones() {
        System.out.println("setListaRestricciones");
        Usuario instance = new Usuario();
        boolean[] listaRestricciones = new boolean[5];
        instance.setListaRestricciones(listaRestricciones);
        assertArrayEquals(listaRestricciones,instance.getListaRestricciones());
    }

    @Test
    public void testIsNecesitoPlan() {
        System.out.println("isNecesitoPlan");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isNecesitoPlan();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNecesitoPlan() {
        System.out.println("setNecesitoPlan");
        boolean necesitoPlan = false;
        Usuario instance = new Usuario();
        instance.setNecesitoPlan(necesitoPlan);
        assertEquals(necesitoPlan,instance.isNecesitoPlan());
    }

    @Test
    public void testGetHistorialComidas() {
        System.out.println("getHistorialComidas");
        Usuario instance = new Usuario();
        ArrayList<ComidaPorDia> expResult = new ArrayList();
        ArrayList<ComidaPorDia> result = instance.getHistorialComidas();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetHistorialComidas() {
        System.out.println("setHistorialComidas");
        ArrayList<ComidaPorDia> historialComidas = new ArrayList();
        Usuario instance = new Usuario();
        instance.setHistorialComidas(historialComidas);
        assertEquals(instance.getHistorialComidas(),historialComidas);
    }

    

    @Test
    public void testInicializoListaEnum() {
        System.out.println("inicializoListaEnum");
        Usuario instance = new Usuario();
        Usuario.Nacionalidades[] expResult = instance.inicializoListaEnum();
        Usuario.Nacionalidades[] result = instance.inicializoListaEnum();
        assertArrayEquals(expResult, result);

    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "Usuario: "+ instance.getNombreUsuario();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

   
    
        @Test
    public void testEqualsFalse() {
        System.out.println("equalsFalse");
        Object obj = new Usuario();
        Usuario instance = new Usuario();
        instance.setNombreUsuario("prueba");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsTrue() {
        System.out.println("equalsTrue");
        Usuario obj = new Usuario();
        Usuario instance = new Usuario();
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }  
    
     @Test (expected = NullPointerException.class)
    public void testEqualsNull() {
        System.out.println("equalsNull");
        Usuario obj =  null;
        Usuario instance = new Usuario();
        assert(obj.equals(instance));
    } 
    
    @Test
    public void pruebaConstructorConParametros() {
        String nombre = "nombre";
        String apellido = "apellido";
        String usuario = "usuario";
        String fNacimiento = "19/12/2012";
        Usuario.Nacionalidades nacionalidad = Usuario.Nacionalidades.URUGUAYA;
        double peso = 19.0;
        double altura = 19.0;
        Usuario.Preferencias preferencias = Usuario.Preferencias.MACROBIOTICO;
        Usuario.Restricciones restricciones = Usuario.Restricciones.CELIACO;
        String sexo = "Masculino";
        ImageIcon fotoPerfil = new javax.swing.ImageIcon(getClass().getResource("/imagenes/predeterminadaUsuario.jpg"));
        String contraseña = "contraseña";
        
        Usuario esperado = new Usuario();
        PlanDeAlimentacion plan = new PlanDeAlimentacion(esperado);
        esperado.setNombre(nombre);
        esperado.setApellidos(apellido);
        esperado.setFechaNacimiento(fNacimiento);
        esperado.setNacionalidad(Usuario.Nacionalidades.URUGUAYA);
        esperado.setPesoKg(peso);
        esperado.setAlturaCm(altura);
        esperado.setPreferenciasAlimentarias(Usuario.Preferencias.MACROBIOTICO);
        esperado.setRestricciones(Usuario.Restricciones.CELIACO);
        esperado.setPlan(plan);
        esperado.setSexo(sexo);
        esperado.setFotoPerfil(fotoPerfil);
        esperado.setContraseña(contraseña);
        
        Usuario nuevo = new Usuario(nacionalidad,peso,altura,preferencias,restricciones,plan,sexo,nombre,apellido,usuario,fNacimiento,fotoPerfil,contraseña);
        assertEquals(nuevo,esperado);
    }
    
    @Test
    public void pruebaValues(){
        Usuario.Nacionalidades[] listaNac = Usuario.Nacionalidades.values();
    }
    
    @Test
    public void pruebaValues2(){
        Usuario.Restricciones[] listaNac = Usuario.Restricciones.values();
    }
    
    @Test
    public void pruebaValues3(){
        Usuario.Preferencias[] listaNac = Usuario.Preferencias.values();
    }
    
}
