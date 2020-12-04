package dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MensajeTest {
    
    public MensajeTest() {
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
    public void testConstructor(){
        Mensaje nuevo = new Mensaje();
        
    }
    
    @Test
    public void testGetContenido(){
        String expResult = "mensaje";
        Mensaje instance = new Mensaje();
        instance.setContenido("mensaje");
        assertEquals(expResult, instance.getContenido());
    }
    
    @Test
    public void testSetAsunto(){
        String expResult = "asunto";
        Mensaje instance = new Mensaje();
        instance.setAsunto("asunto");
        assertEquals(expResult, instance.getAsunto());
    }
    
    @Test
    public void testToString() {
        Mensaje instance = new Mensaje();
        String expResult = "Mensaje de: "+ instance.getOrigen().getNombreUsuario() 
               + " con Asunto: " + instance.getAsunto();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testSetOrigen(){
        Mensaje instance = new Mensaje();
        Persona expResult = new Profesional();
        instance.setOrigen(expResult);
        assertEquals(expResult, instance.getOrigen());
    }
     @Test
     public void testGetOrigen(){
        Mensaje instance = new Mensaje();
        Persona expResult = new Profesional();
        instance.setOrigen(expResult);
        Persona result = instance.getOrigen();
        assertEquals(expResult, result);
    }
     
     @Test
     public void testSetDestino(){
        Mensaje instance = new Mensaje();
        Persona expResult = new Profesional();
        instance.setDestino(expResult);
        assertEquals(expResult, instance.getDestino());
    }
    
     @Test
     public void testGetDestino(){
        Mensaje instance = new Mensaje();
        Persona expResult = new Usuario();
        instance.setDestino(expResult);
        Persona result = instance.getDestino();
        assertEquals(expResult, result);
    }
    
    
}
