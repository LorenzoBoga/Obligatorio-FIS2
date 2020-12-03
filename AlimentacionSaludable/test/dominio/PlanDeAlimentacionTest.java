package dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanDeAlimentacionTest {
    
    public PlanDeAlimentacionTest() {
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
     public void testSetUsuario(){
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setUsuario(user);
        assertEquals(user, instance.getUsuario());
    }
    
     @Test
     public void testGetUsuario(){
        Usuario expResult = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(expResult);
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testSetListaLunes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaLunes(expResult);
        assertEquals(expResult, instance.getListaLunes());
    }
    
    @Test 
    public void testGetListaLunes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaLunes(expResult);
        ArrayList<Alimento> result = instance.getListaLunes();
        assertEquals(expResult, result);
    }
    
    @Test 
    public void testSetListaMartes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaMartes(expResult);
        assertEquals(expResult, instance.getListaMartes());
    }
    
    @Test 
    public void testGetListaMartes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaMartes(expResult);
        ArrayList<Alimento> result = instance.getListaMartes();
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testSetListaMiercoles(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaMiercoles(expResult);
        assertEquals(expResult, instance.getListaMiercoles());
    }
    
    @Test 
    public void testGetListaMiercoles(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaMiercoles(expResult);
        ArrayList<Alimento> result = instance.getListaMiercoles();
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testSetListaJueves(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaJueves(expResult);
        assertEquals(expResult, instance.getListaJueves());
    }
    
    @Test 
    public void testGetListaJueves(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaJueves(expResult);
        ArrayList<Alimento> result = instance.getListaJueves();
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testSetListaViernes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaViernes(expResult);
        assertEquals(expResult, instance.getListaViernes());
    }
    
    @Test 
    public void testGetListaViernes(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaViernes(expResult);
        ArrayList<Alimento> result = instance.getListaViernes();
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testSetListaSabado(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaSabado(expResult);
        assertEquals(expResult, instance.getListaSabado());
    }
    
    @Test 
    public void testGetListaSabado(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaSabado(expResult);
        ArrayList<Alimento> result = instance.getListaSabado();
        assertEquals(expResult, result);
    }
    
     @Test 
    public void testSetListaDomingo(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaDomingo(expResult);
        assertEquals(expResult, instance.getListaDomingo());
    }
    
    @Test 
    public void testGetListaDomingo(){
        ArrayList<Alimento> expResult = new ArrayList();
        Usuario user = new Usuario();
        PlanDeAlimentacion instance = new PlanDeAlimentacion(user);
        instance.setListaDomingo(expResult);
        ArrayList<Alimento> result = instance.getListaDomingo();
        assertEquals(expResult, result);
    }
}
