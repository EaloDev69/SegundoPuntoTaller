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
 * Tests unitarios para la clase Rectangulo
 * @author USUARIO
 */
public class RectanguloIT {
    
    private Rectangulo rectangulo;
    
    public RectanguloIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("=== Iniciando tests de Rectangulo ===");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("=== Tests de Rectangulo completados ===");
    }
    
    @BeforeEach
    public void setUp() {
        // Crear un rectángulo de prueba antes de cada test
        // Rectángulo de (0,0) a (4,3) - base 4, altura 3
        rectangulo = new Rectangulo(0, 0, 4, 3);
    }
    
    @AfterEach
    public void tearDown() {
        rectangulo = null;
    }

    /**
     * Test del constructor con coordenadas
     */
    @Test
    public void testConstructorConCoordenadas() {
        System.out.println("testConstructorConCoordenadas");
        Rectangulo rect = new Rectangulo(1.0, 1.0, 5.0, 4.0);
        assertNotNull(rect);
        assertEquals(12.0, rect.calcularArea(), 0.001);
    }

    /**
     * Test del constructor con objetos Punto
     */
    @Test
    public void testConstructorConPuntos() {
        System.out.println("testConstructorConPuntos");
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 2);
        Rectangulo rect = new Rectangulo(p1, p2);
        assertNotNull(rect);
        assertEquals(6.0, rect.calcularArea(), 0.001);
    }

    /**
     * Test de cálculo de área - caso normal
     */
    @Test
    public void testCalcularArea() {
        System.out.println("testCalcularArea");
        // Rectángulo de 4x3 = área 12
        double resultado = rectangulo.calcularArea();
        assertEquals(12.0, resultado, 0.001);
    }

    /**
     * Test de cálculo de área - rectángulo con coordenadas negativas
     */
    @Test
    public void testCalcularAreaConNegativas() {
        System.out.println("testCalcularAreaConNegativas");
        Rectangulo rect = new Rectangulo(-2, -3, 2, 1);
        // Base: 4, Altura: 4, Área: 16
        assertEquals(16.0, rect.calcularArea(), 0.001);
    }

    /**
     * Test de cálculo de área - cuadrado
     */
    @Test
    public void testCalcularAreaCuadrado() {
        System.out.println("testCalcularAreaCuadrado");
        Rectangulo cuadrado = new Rectangulo(0, 0, 5, 5);
        assertEquals(25.0, cuadrado.calcularArea(), 0.001);
    }

    /**
     * Test estaDentro - punto dentro del rectángulo
     */
    @Test
    public void testEstaDentroPuntoInterior() {
        System.out.println("testEstaDentroPuntoInterior");
        // Punto (2, 1.5) debe estar dentro del rectángulo (0,0) a (4,3)
        boolean resultado = rectangulo.estaDentro(2.0, 1.5);
        assertTrue(resultado);
    }

    /**
     * Test estaDentro - punto fuera del rectángulo
     */
    @Test
    public void testEstaDentroPuntoExterior() {
        System.out.println("testEstaDentroPuntoExterior");
        // Punto (5, 5) debe estar fuera del rectángulo (0,0) a (4,3)
        boolean resultado = rectangulo.estaDentro(5.0, 5.0);
        assertFalse(resultado);
    }

    /**
     * Test estaDentro - punto en el borde
     */
    @Test
    public void testEstaDentroPuntoEnBorde() {
        System.out.println("testEstaDentroPuntoEnBorde");
        boolean resultado = rectangulo.estaDentro(4.0, 3.0);
        assertTrue(resultado);
    }

    /**
     * Test mover - dirección horizontal
     */
    @Test
    public void testMoverHorizontal() {
        System.out.println("testMoverHorizontal");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        rect.mover(5.0, "horizontal");
        
        // Verificar que el área no cambió
        assertEquals(12.0, rect.calcularArea(), 0.001);
        
        // Verificar que se movió (el punto original 2,1.5 ahora debe estar en 7,1.5)
        assertTrue(rect.estaDentro(7.0, 1.5));
        assertFalse(rect.estaDentro(2.0, 1.5));
    }

    /**
     * Test mover - dirección vertical
     */
    @Test
    public void testMoverVertical() {
        System.out.println("testMoverVertical");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        rect.mover(3.0, "vertical");
        
        // Verificar que el área no cambió
        assertEquals(12.0, rect.calcularArea(), 0.001);
        
        // Verificar que se movió verticalmente
        assertTrue(rect.estaDentro(2.0, 4.5));
        assertFalse(rect.estaDentro(2.0, 1.5));
    }

    /**
     * Test mover - dirección inválida (no debe hacer nada)
     */
    @Test
    public void testMoverDireccionInvalida() {
        System.out.println("testMoverDireccionInvalida");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        double areaAntes = rect.calcularArea();
        
        rect.mover(5.0, "diagonal");
        
        // El área debe ser la misma
        assertEquals(areaAntes, rect.calcularArea(), 0.001);
    }

    /**
     * Test cambiarEscala con dos factores
     */
    @Test
    public void testCambiarEscalaDobleFactor() {
        System.out.println("testCambiarEscalaDobleFactor");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        
        // Escalar 2x en X y 3x en Y
        rect.cambiarEscala(2.0, 3.0);
        
        String dimensiones = rect.obtenerDimensiones();
        assertTrue(dimensiones.contains("8.0") && dimensiones.contains("9.0"));
    }

    /**
     * Test cambiarEscala con factor único - caso normal
     */
    @Test
    public void testCambiarEscalaFactorUnico() {
        System.out.println("testCambiarEscalaFactorUnico");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        double areaOriginal = rect.calcularArea();
        
        // Escalar 2x uniformemente
        rect.cambiarEscala(2.0);
        
        // El área debe ser 4x la original (2^2)
        assertEquals(areaOriginal * 4, rect.calcularArea(), 0.001);
    }

    /**
     * Test cambiarEscala con factor pequeño (< 0.1)
     */
    @Test
    public void testCambiarEscalaFactorPequeno() {
        System.out.println("testCambiarEscalaFactorPequeno");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        
        // Debe mostrar advertencia pero funcionar
        rect.cambiarEscala(0.05);
        
        // Verificar que se aplicó la escala
        assertTrue(rect.calcularArea() < 1.0);
    }

    /**
     * Test cambiarEscala con factor grande (> 10)
     */
    @Test
    public void testCambiarEscalaFactorGrande() {
        System.out.println("testCambiarEscalaFactorGrande");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        
        // Debe mostrar advertencia pero funcionar
        rect.cambiarEscala(15.0);
        
        // Verificar que se aplicó la escala
        assertTrue(rect.calcularArea() > 1000.0);
    }

    /**
     * Test cambiarEscala con factor negativo (no debe aplicarse)
     */
    @Test
    public void testCambiarEscalaFactorNegativo() {
        System.out.println("testCambiarEscalaFactorNegativo");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        double areaOriginal = rect.calcularArea();
        
        // No debe aplicarse con factor negativo
        rect.cambiarEscala(-2.0);
        
        // El área debe permanecer igual
        assertEquals(areaOriginal, rect.calcularArea(), 0.001);
    }

    /**
     * Test cambiarEscala con factor cero (no debe aplicarse)
     */
    @Test
    public void testCambiarEscalaFactorCero() {
        System.out.println("testCambiarEscalaFactorCero");
        Rectangulo rect = new Rectangulo(0, 0, 4, 3);
        double areaOriginal = rect.calcularArea();
        
        rect.cambiarEscala(0.0);
        
        // El área debe permanecer igual
        assertEquals(areaOriginal, rect.calcularArea(), 0.001);
    }

    /**
     * Test del método toString
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        String resultado = rectangulo.toString();
        
        assertNotNull(resultado);
        assertTrue(resultado.contains("Rectangulo"));
        assertTrue(resultado.contains("Area"));
        assertTrue(resultado.contains("12.0"));
    }

    /**
     * Test obtenerDimensiones
     */
    @Test
    public void testObtenerDimensiones() {
        System.out.println("testObtenerDimensiones");
        String resultado = rectangulo.obtenerDimensiones();
        
        assertNotNull(resultado);
        assertTrue(resultado.contains("Base"));
        assertTrue(resultado.contains("Altura"));
        assertTrue(resultado.contains("4.0"));
        assertTrue(resultado.contains("3.0"));
    }

    /**
     * Test obtenerDimensiones con coordenadas negativas
     */
    @Test
    public void testObtenerDimensionesConNegativas() {
        System.out.println("testObtenerDimensionesConNegativas");
        Rectangulo rect = new Rectangulo(-2, -3, 2, 1);
        String resultado = rect.obtenerDimensiones();
        
        assertTrue(resultado.contains("4.0"));
    }
}