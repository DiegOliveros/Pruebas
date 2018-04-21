/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casosdeprueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolivero
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int x = 2;
        int y = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.sumar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if (result !=expResult)
               {
                   fail("The test case is a prototype.");
               }
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int x = 4;
        int y = 2;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.restar(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if (result !=expResult)
               {
                   fail("The test case is a prototype.");
               }
    }
    
}
