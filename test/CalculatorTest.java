/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    public CalculatorTest() {
    }

    Calculadora c1;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        c1 = new Calculadora();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSuma() {
        int resultado = c1.sumar(5, 3);
        assertEquals(8, resultado);
        assertNotEquals(12, resultado);
    }
    
    @Test
    public void testResta() {
        int resultado = c1.restar(10, 5);
        assertEquals(5, resultado);
        assertNotEquals(7, resultado);
    }
}
