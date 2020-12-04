package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlimentoTest {
    
    public AlimentoTest() {
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
    public void testToString() {
        Alimento instance = new Alimento();
        String expResult = instance.getNombre();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetNombre(){
        String expResult = "Nombre";
        Alimento instance = new Alimento();
        instance.setNombre("Nombre");
        assertEquals(expResult, instance.getNombre());
    }
    
    @Test
    public void testGetNombre() {
        Alimento instance = new Alimento();
        String expResult = "sin nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoBebidas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.BEBIDAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.BEBIDAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesBlancas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CARNES_BLANCAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CARNES_BLANCAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCarnesRojas() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CARNES_ROJAS);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CARNES_ROJAS;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTipoCereal() {
        System.out.println("getTipo");
        Alimento instance = new Alimento();
        instance.setTipo(Alimento.TipoAlimento.CEREAL);
        Alimento.TipoAlimento expResult = Alimento.TipoAlimento.CEREAL;
        Alimento.TipoAlimento result = instance.getTipo();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEquals(){
        Alimento instance = new Alimento();
        Alimento instance2 = new Alimento();
        boolean result = instance.equals(instance2);
        assertFalse(result);
    }
}
