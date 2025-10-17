/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class RectanguloIT {
    
    public RectanguloIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcularArea method, of class Rectangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        Rectangulo instance = null;
        double expResult = 0.0;
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaDentro method, of class Rectangulo.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("estaDentro");
        double x = 0.0;
        double y = 0.0;
        Rectangulo instance = null;
        boolean expResult = false;
        boolean result = instance.estaDentro(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mover method, of class Rectangulo.
     */
    @Test
    public void testMover() {
        System.out.println("mover");
        double unidades = 0.0;
        String direccion = "";
        Rectangulo instance = null;
        instance.mover(unidades, direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEscala method, of class Rectangulo.
     */
    @Test
    public void testCambiarEscala_double_double() {
        System.out.println("cambiarEscala");
        double factorX = 0.0;
        double factorY = 0.0;
        Rectangulo instance = null;
        instance.cambiarEscala(factorX, factorY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEscala method, of class Rectangulo.
     */
    @Test
    public void testCambiarEscala_double() {
        System.out.println("cambiarEscala");
        double factor = 0.0;
        Rectangulo instance = null;
        instance.cambiarEscala(factor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rectangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rectangulo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDimensiones method, of class Rectangulo.
     */
    @Test
    public void testObtenerDimensiones() {
        System.out.println("obtenerDimensiones");
        Rectangulo instance = null;
        String expResult = "";
        String result = instance.obtenerDimensiones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
