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
 * Tests de Integración para la clase Figura
 * @author USUARIO
 */
public class FiguraIT {
    
    private Figura figura;
    private Punto p1;
    private Punto p2;
    
    public FiguraIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("=== INICIANDO TESTS DE INTEGRACION - FIGURA ===");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("=== TESTS DE INTEGRACION FINALIZADOS ===");
    }
    
    @BeforeEach
    public void setUp() {
        // Crear objetos antes de cada test
        p1 = new Punto(0.0, 0.0);
        p2 = new Punto(4.0, 3.0);
        figura = new Figura(p1, p2);
    }
    
    @AfterEach
    public void tearDown() {
        // Limpiar después de cada test
        figura = null;
        p1 = null;
        p2 = null;
    }

    /**
     * Test of getP1 method, of class Figura.
     */
    @Test
    public void testGetP1() {
        System.out.println("Test: getP1");
        Punto result = figura.getP1();
        assertNotNull(result, "P1 no debería ser null");
        assertEquals(0.0, result.getX(), 0.001, "X de P1 debería ser 0.0");
        assertEquals(0.0, result.getY(), 0.001, "Y de P1 debería ser 0.0");
    }

    /**
     * Test of setP1 method, of class Figura.
     */
    @Test
    public void testSetP1() {
        System.out.println("Test: setP1");
        Punto nuevoPunto = new Punto(10.0, 10.0);
        figura.setP1(nuevoPunto);
        assertEquals(10.0, figura.getP1().getX(), 0.001, "X de P1 debería ser 10.0");
        assertEquals(10.0, figura.getP1().getY(), 0.001, "Y de P1 debería ser 10.0");
    }

    /**
     * Test of getP2 method, of class Figura.
     */
    @Test
    public void testGetP2() {
        System.out.println("Test: getP2");
        Punto result = figura.getP2();
        assertNotNull(result, "P2 no debería ser null");
        assertEquals(4.0, result.getX(), 0.001, "X de P2 debería ser 4.0");
        assertEquals(3.0, result.getY(), 0.001, "Y de P2 debería ser 3.0");
    }

    /**
     * Test of setP2 method, of class Figura.
     */
    @Test
    public void testSetP2() {
        System.out.println("Test: setP2");
        Punto nuevoPunto = new Punto(8.0, 6.0);
        figura.setP2(nuevoPunto);
        assertEquals(8.0, figura.getP2().getX(), 0.001, "X de P2 debería ser 8.0");
        assertEquals(6.0, figura.getP2().getY(), 0.001, "Y de P2 debería ser 6.0");
    }

    /**
     * Test of getP3 method, of class Figura.
     */
    @Test
    public void testGetP3() {
        System.out.println("Test: getP3");
        Punto result = figura.getP3();
        assertNotNull(result, "P3 no debería ser null");
        assertEquals(0.0, result.getX(), 0.001, "X de P3 debería ser 0.0");
        assertEquals(3.0, result.getY(), 0.001, "Y de P3 debería ser 3.0");
    }

    /**
     * Test of getP4 method, of class Figura.
     */
    @Test
    public void testGetP4() {
        System.out.println("Test: getP4");
        Punto result = figura.getP4();
        assertNotNull(result, "P4 no debería ser null");
        assertEquals(4.0, result.getX(), 0.001, "X de P4 debería ser 4.0");
        assertEquals(0.0, result.getY(), 0.001, "Y de P4 debería ser 0.0");
    }

    /**
     * Test of estaDentro method, of class Figura.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("Test: estaDentro");
        Punto puntoInside = new Punto(2.0, 1.5);
        boolean result = figura.estaDentro(puntoInside);
        assertTrue(result, "El punto (2.0, 1.5) debería estar dentro");
    }
    
    /**
     * Test of estaDentro con punto fuera.
     */
    @Test
    public void testEstaDentroFuera() {
        System.out.println("Test: estaDentro - punto fuera");
        Punto puntoOutside = new Punto(10.0, 10.0);
        boolean result = figura.estaDentro(puntoOutside);
        assertFalse(result, "El punto (10.0, 10.0) no debería estar dentro");
    }
    
    /**
     * Test of estaDentro con punto en el borde.
     */
    @Test
    public void testEstaDentroBorde() {
        System.out.println("Test: estaDentro - punto en borde");
        Punto puntoBorde = new Punto(4.0, 3.0);
        boolean result = figura.estaDentro(puntoBorde);
        assertTrue(result, "El punto en el borde debería considerarse dentro");
    }

    /**
     * Test of mover method, of class Figura.
     */
    @Test
    public void testMover() {
        System.out.println("Test: mover");
        double dx = 5.0;
        double dy = 3.0;
        figura.mover(dx, dy);
        assertEquals(5.0, figura.getP1().getX(), 0.001, "P1.X debería ser 5.0");
        assertEquals(3.0, figura.getP1().getY(), 0.001, "P1.Y debería ser 3.0");
        assertEquals(9.0, figura.getP2().getX(), 0.001, "P2.X debería ser 9.0");
        assertEquals(6.0, figura.getP2().getY(), 0.001, "P2.Y debería ser 6.0");
    }
    
    /**
     * Test of mover con valores negativos.
     */
    @Test
    public void testMoverNegativo() {
        System.out.println("Test: mover - valores negativos");
        figura.mover(-2.0, -1.0);
        assertEquals(-2.0, figura.getP1().getX(), 0.001, "P1.X debería ser -2.0");
        assertEquals(-1.0, figura.getP1().getY(), 0.001, "P1.Y debería ser -1.0");
        assertEquals(2.0, figura.getP2().getX(), 0.001, "P2.X debería ser 2.0");
        assertEquals(2.0, figura.getP2().getY(), 0.001, "P2.Y debería ser 2.0");
    }

    /**
     * Test of toString method, of class Figura.
     */
    @Test
    public void testToString() {
        System.out.println("Test: toString");
        String result = figura.toString();
        assertNotNull(result, "toString no debería retornar null");
        assertTrue(result.contains("Figura"), "toString debería contener 'Figura'");
        assertTrue(result.contains("vértices"), "toString debería contener 'vértices'");
        assertFalse(result.isEmpty(), "toString no debería estar vacío");
    }
    
    /**
     * Test de integración: crear figura, moverla y verificar punto
     */
    @Test
    public void testIntegracionMoverYVerificar() {
        System.out.println("Test de Integración: mover y verificar punto");
        // Punto que está dentro antes de mover
        Punto punto = new Punto(2.0, 1.5);
        assertTrue(figura.estaDentro(punto), "Punto debería estar dentro antes de mover");
        
        // Mover la figura
        figura.mover(5.0, 5.0);
        
        // Ahora el punto no debería estar dentro
        assertFalse(figura.estaDentro(punto), "Punto no debería estar dentro después de mover");
        
        // Pero este nuevo punto sí
        Punto nuevoPunto = new Punto(7.0, 6.5);
        assertTrue(figura.estaDentro(nuevoPunto), "Nuevo punto debería estar dentro");
    }
    
    /**
     * Test de integración: modificar puntos y verificar coordenadas
     */
    @Test
    public void testIntegracionModificarPuntos() {
        System.out.println("Test de Integración: modificar puntos");
        
        // Verificar estado inicial
        assertEquals(0.0, figura.getP1().getX(), 0.001);
        assertEquals(0.0, figura.getP1().getY(), 0.001);
        
        // Modificar P2
        Punto nuevoP2 = new Punto(8.0, 6.0);
        figura.setP2(nuevoP2);
        
        // Verificar que P2 cambió
        assertEquals(8.0, figura.getP2().getX(), 0.001);
        assertEquals(6.0, figura.getP2().getY(), 0.001);
        
        // P1 debe permanecer igual
        assertEquals(0.0, figura.getP1().getX(), 0.001);
        assertEquals(0.0, figura.getP1().getY(), 0.001);
    }
    
    /**
     * Test de integración: verificar que p3 y p4 se calculan correctamente
     */
    @Test
    public void testIntegracionVerticesCalculados() {
        System.out.println("Test de Integración: vértices calculados");
        
        // P3 debería ser (p1.x, p2.y)
        assertEquals(figura.getP1().getX(), figura.getP3().getX(), 0.001, 
                    "P3.X debería ser igual a P1.X");
        assertEquals(figura.getP2().getY(), figura.getP3().getY(), 0.001, 
                    "P3.Y debería ser igual a P2.Y");
        
        // P4 debería ser (p2.x, p1.y)
        assertEquals(figura.getP2().getX(), figura.getP4().getX(), 0.001, 
                    "P4.X debería ser igual a P2.X");
        assertEquals(figura.getP1().getY(), figura.getP4().getY(), 0.001, 
                    "P4.Y debería ser igual a P1.Y");
    }
    
    /**
     * Test de integración: mover y verificar todos los vértices
     */
    @Test
    public void testIntegracionMoverTodosVertices() {
        System.out.println("Test de Integración: mover todos los vértices");
        
        double dx = 3.0;
        double dy = 2.0;
        
        // Guardar posiciones originales
        double p1XOriginal = figura.getP1().getX();
        double p1YOriginal = figura.getP1().getY();
        double p2XOriginal = figura.getP2().getX();
        double p2YOriginal = figura.getP2().getY();
        double p3XOriginal = figura.getP3().getX();
        double p3YOriginal = figura.getP3().getY();
        double p4XOriginal = figura.getP4().getX();
        double p4YOriginal = figura.getP4().getY();
        
        // Mover la figura
        figura.mover(dx, dy);
        
        // Verificar que todos los puntos se movieron correctamente
        assertEquals(p1XOriginal + dx, figura.getP1().getX(), 0.001, "P1.X movido incorrectamente");
        assertEquals(p1YOriginal + dy, figura.getP1().getY(), 0.001, "P1.Y movido incorrectamente");
        assertEquals(p2XOriginal + dx, figura.getP2().getX(), 0.001, "P2.X movido incorrectamente");
        assertEquals(p2YOriginal + dy, figura.getP2().getY(), 0.001, "P2.Y movido incorrectamente");
        assertEquals(p3XOriginal + dx, figura.getP3().getX(), 0.001, "P3.X movido incorrectamente");
        assertEquals(p3YOriginal + dy, figura.getP3().getY(), 0.001, "P3.Y movido incorrectamente");
        assertEquals(p4XOriginal + dx, figura.getP4().getX(), 0.001, "P4.X movido incorrectamente");
        assertEquals(p4YOriginal + dy, figura.getP4().getY(), 0.001, "P4.Y movido incorrectamente");
    }
    
    /**
     * Test de integración: puntos en esquinas del rectángulo
     */
    @Test
    public void testIntegracionPuntosEnEsquinas() {
        System.out.println("Test de Integración: puntos en esquinas");
        
        // Verificar que las 4 esquinas están dentro
        assertTrue(figura.estaDentro(figura.getP1()), "P1 debería estar dentro");
        assertTrue(figura.estaDentro(figura.getP2()), "P2 debería estar dentro");
        assertTrue(figura.estaDentro(figura.getP3()), "P3 debería estar dentro");
        assertTrue(figura.estaDentro(figura.getP4()), "P4 debería estar dentro");
    }
    
    /**
     * Test de integración: estaDentro con múltiples puntos
     */
    @Test
    public void testIntegracionMultiplesPuntos() {
        System.out.println("Test de Integración: múltiples puntos");
        
        // Puntos dentro
        assertTrue(figura.estaDentro(new Punto(0.0, 0.0)), "Esquina inferior izquierda");
        assertTrue(figura.estaDentro(new Punto(2.0, 1.5)), "Centro");
        assertTrue(figura.estaDentro(new Punto(4.0, 3.0)), "Esquina superior derecha");
        
        // Puntos fuera
        assertFalse(figura.estaDentro(new Punto(-1.0, 1.5)), "Fuera por la izquierda");
        assertFalse(figura.estaDentro(new Punto(5.0, 1.5)), "Fuera por la derecha");
        assertFalse(figura.estaDentro(new Punto(2.0, -1.0)), "Fuera por abajo");
        assertFalse(figura.estaDentro(new Punto(2.0, 4.0)), "Fuera por arriba");
    }
}