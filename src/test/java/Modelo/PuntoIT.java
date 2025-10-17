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
 * Tests unitarios para la clase Punto
 * @author USUARIO
 */
public class PuntoIT {
    
    private Punto punto;
    
    public PuntoIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("=== Iniciando tests de Punto ===");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("=== Tests de Punto completados ===");
    }
    
    @BeforeEach
    public void setUp() {
        // Crear un punto de prueba antes de cada test
        punto = new Punto(3.5, 7.2);
    }
    
    @AfterEach
    public void tearDown() {
        punto = null;
    }

    /**
     * Test of getX method, of class Punto.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Punto instance = new Punto(5.0, 10.0);
        double expResult = 5.0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of setX method, of class Punto.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        double x = 15.5;
        Punto instance = new Punto(0.0, 0.0);
        instance.setX(x);
        assertEquals(x, instance.getX(), 0.001);
    }
    
    /**
     * Test of getY method, of class Punto.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Punto instance = new Punto(5.0, 10.0);
        double expResult = 10.0;
        double result = instance.getY();
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of setY method, of class Punto.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        double y = 20.5;
        Punto instance = new Punto(0.0, 0.0);
        instance.setY(y);
        assertEquals(y, instance.getY(), 0.001);
    }
    
    /**
     * Test of toString method, of class Punto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Punto instance = new Punto(3.5, 7.2);
        String expResult = "(3.5, 7.2)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test del constructor
     */
    @Test
    public void testConstructor() {
        System.out.println("testConstructor");
        Punto p = new Punto(5.0, 10.0);
        
        assertNotNull(p);
        assertEquals(5.0, p.getX(), 0.001);
        assertEquals(10.0, p.getY(), 0.001);
    }

    /**
     * Test del constructor con coordenadas negativas
     */
    @Test
    public void testConstructorConNegativos() {
        System.out.println("testConstructorConNegativos");
        Punto p = new Punto(-3.5, -7.8);
        
        assertEquals(-3.5, p.getX(), 0.001);
        assertEquals(-7.8, p.getY(), 0.001);
    }

    /**
     * Test del constructor con coordenadas cero
     */
    @Test
    public void testConstructorEnOrigen() {
        System.out.println("testConstructorEnOrigen");
        Punto p = new Punto(0.0, 0.0);
        
        assertEquals(0.0, p.getX(), 0.001);
        assertEquals(0.0, p.getY(), 0.001);
    }

    /**
     * Test getX con valor negativo
     */
    @Test
    public void testGetXNegativo() {
        System.out.println("testGetXNegativo");
        Punto p = new Punto(-15.3, 20.0);
        assertEquals(-15.3, p.getX(), 0.001);
    }

    /**
     * Test getX con valor cero
     */
    @Test
    public void testGetXCero() {
        System.out.println("testGetXCero");
        Punto p = new Punto(0.0, 5.0);
        assertEquals(0.0, p.getX(), 0.001);
    }

    /**
     * Test setX con valor negativo
     */
    @Test
    public void testSetXNegativo() {
        System.out.println("testSetXNegativo");
        punto.setX(-25.6);
        assertEquals(-25.6, punto.getX(), 0.001);
    }

    /**
     * Test setX con valor cero
     */
    @Test
    public void testSetXCero() {
        System.out.println("testSetXCero");
        punto.setX(0.0);
        assertEquals(0.0, punto.getX(), 0.001);
    }

    /**
     * Test setX múltiples veces
     */
    @Test
    public void testSetXMultiplesVeces() {
        System.out.println("testSetXMultiplesVeces");
        punto.setX(10.0);
        assertEquals(10.0, punto.getX(), 0.001);
        
        punto.setX(20.0);
        assertEquals(20.0, punto.getX(), 0.001);
        
        punto.setX(-5.0);
        assertEquals(-5.0, punto.getX(), 0.001);
    }

    /**
     * Test getY con valor negativo
     */
    @Test
    public void testGetYNegativo() {
        System.out.println("testGetYNegativo");
        Punto p = new Punto(10.0, -8.5);
        assertEquals(-8.5, p.getY(), 0.001);
    }

    /**
     * Test getY con valor cero
     */
    @Test
    public void testGetYCero() {
        System.out.println("testGetYCero");
        Punto p = new Punto(5.0, 0.0);
        assertEquals(0.0, p.getY(), 0.001);
    }

    /**
     * Test setY con valor negativo
     */
    @Test
    public void testSetYNegativo() {
        System.out.println("testSetYNegativo");
        punto.setY(-30.7);
        assertEquals(-30.7, punto.getY(), 0.001);
    }

    /**
     * Test setY con valor cero
     */
    @Test
    public void testSetYCero() {
        System.out.println("testSetYCero");
        punto.setY(0.0);
        assertEquals(0.0, punto.getY(), 0.001);
    }

    /**
     * Test setY múltiples veces
     */
    @Test
    public void testSetYMultiplesVeces() {
        System.out.println("testSetYMultiplesVeces");
        punto.setY(5.0);
        assertEquals(5.0, punto.getY(), 0.001);
        
        punto.setY(15.0);
        assertEquals(15.0, punto.getY(), 0.001);
        
        punto.setY(-10.0);
        assertEquals(-10.0, punto.getY(), 0.001);
    }

    /**
     * Test modificar ambas coordenadas
     */
    @Test
    public void testSetXYSimultaneo() {
        System.out.println("testSetXYSimultaneo");
        punto.setX(100.5);
        punto.setY(200.8);
        
        assertEquals(100.5, punto.getX(), 0.001);
        assertEquals(200.8, punto.getY(), 0.001);
    }

    /**
     * Test toString con coordenadas negativas
     */
    @Test
    public void testToStringConNegativos() {
        System.out.println("testToStringConNegativos");
        Punto p = new Punto(-5.0, -10.0);
        String resultado = p.toString();
        
        assertEquals("(-5.0, -10.0)", resultado);
    }

    /**
     * Test toString en el origen
     */
    @Test
    public void testToStringEnOrigen() {
        System.out.println("testToStringEnOrigen");
        Punto p = new Punto(0.0, 0.0);
        String resultado = p.toString();
        
        assertEquals("(0.0, 0.0)", resultado);
    }

    /**
     * Test toString con coordenadas mixtas
     */
    @Test
    public void testToStringMixto() {
        System.out.println("testToStringMixto");
        Punto p = new Punto(-15.5, 20.3);
        String resultado = p.toString();
        
        assertEquals("(-15.5, 20.3)", resultado);
    }

    /**
     * Test toString contiene paréntesis y coma
     */
    @Test
    public void testToStringFormato() {
        System.out.println("testToStringFormato");
        String resultado = punto.toString();
        
        assertTrue(resultado.startsWith("("));
        assertTrue(resultado.endsWith(")"));
        assertTrue(resultado.contains(","));
    }

    /**
     * Test con valores decimales 
     */
    @Test
    public void testPuntoConDecimalesAlta() {
        System.out.println("testPuntoConDecimalesAlta");
        Punto p = new Punto(3.141592653589793, 2.718281828459045);
        
        assertEquals(3.141592653589793, p.getX(), 0.000001);
        assertEquals(2.718281828459045, p.getY(), 0.000001);
    }

    /**
     * Test con valores muy grandes
     */
    @Test
    public void testPuntoConValoresGrandes() {
        System.out.println("testPuntoConValoresGrandes");
        Punto p = new Punto(1000000.0, 2000000.0);
        
        assertEquals(1000000.0, p.getX(), 0.001);
        assertEquals(2000000.0, p.getY(), 0.001);
    }

    /**
     * Test con valores muy pequeños
     */
    @Test
    public void testPuntoConValoresPequenos() {
        System.out.println("testPuntoConValoresPequenos");
        Punto p = new Punto(0.0001, 0.0002);
        
        assertEquals(0.0001, p.getX(), 0.00001);
        assertEquals(0.0002, p.getY(), 0.00001);
    }

    /**
     * Test independencia entre X e Y
     */
    @Test
    public void testIndependenciaXY() {
        System.out.println("testIndependenciaXY");
        
        // Modificar X no debe afectar Y
        double yOriginal = punto.getY();
        punto.setX(999.0);
        assertEquals(yOriginal, punto.getY(), 0.001);
        
        // Modificar Y no debe afectar X
        double xNuevo = punto.getX();
        punto.setY(888.0);
        assertEquals(xNuevo, punto.getX(), 0.001);
    }
}