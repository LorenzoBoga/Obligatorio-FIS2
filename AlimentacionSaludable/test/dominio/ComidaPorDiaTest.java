package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComidaPorDiaTest {
    
    public ComidaPorDiaTest() {
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
    public void testGetComidasIngeridas() {
        System.out.println("getComidasIngeridas");
        ComidaPorDia instance = new ComidaPorDia();
        ArrayList<Alimento> expResult = new ArrayList();
        ArrayList<Alimento> result = instance.getComidasIngeridas();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        ComidaPorDia instance = new ComidaPorDia();
        String expResult = "Comidas ingeridas el: "+ instance.getFecha();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testConstructor() {
        String fecha = "";
        ArrayList<Alimento> comidasIngeridas = new ArrayList();
        ComidaPorDia result = new ComidaPorDia(comidasIngeridas,fecha);
        ComidaPorDia expResult = new ComidaPorDia();
        expResult.setComidasIngeridas(comidasIngeridas);
        expResult.setFecha(fecha);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetFecha() {
        String expResult = "";
        ComidaPorDia instance = new ComidaPorDia();
        instance.setFecha(expResult);
        assertEquals(expResult, instance.getFecha());
    }
    
     @Test
    public void testSetComidasIngeridas() {
        ArrayList<Alimento> expResult = new ArrayList();
        ComidaPorDia instance = new ComidaPorDia();
        instance.setComidasIngeridas(expResult);
        assertEquals(expResult, instance.getComidasIngeridas());
    }
}
