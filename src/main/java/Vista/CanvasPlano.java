/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Rectangulo;
import Modelo.Punto;

public class CanvasPlano {
    private int ancho;
    private int alto;
    
    // Constructor
    public CanvasPlano(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    

    public void dibujarRectangulo(Rectangulo rectangulo) {
        System.out.println("\n=== PLANO CARTESIANO ===");
        System.out.println("Rectangulo actual:");
        System.out.println(rectangulo.toString());
        System.out.println(rectangulo.obtenerDimensiones());
        System.out.println("\nVertices:");
        System.out.println("  P1 (inferior izquierdo): " + rectangulo.getP1());
        System.out.println("  P2 (superior derecho): " + rectangulo.getP2());
        System.out.println("  P3 (superior izquierdo): " + rectangulo.getP3());
        System.out.println("  P4 (inferior derecho): " + rectangulo.getP4());
        System.out.println("========================\n");
    }
    
    public void mostrarArea(Rectangulo rectangulo) {
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea() + " unidades cuadradas");
    }
    

    public void verificarPunto(Rectangulo rectangulo, Punto punto) {
        boolean dentro = rectangulo.estaDentro(punto);
        if (dentro) {
            System.out.println("El punto " + punto + " SI esta dentro del rectangulo");
        } else {
            System.out.println("El punto " + punto + " NO esta dentro del rectangulo");
        }
    }
    

    public void verificarPunto(Rectangulo rectangulo, double x, double y) {
        boolean dentro = rectangulo.estaDentro(x, y);
        Punto punto = new Punto(x, y);
        if (dentro) {
            System.out.println("El punto " + punto + " SI esta dentro del rectangulo");
        } else {
            System.out.println("El punto " + punto + " NO esta dentro del rectangulo");
        }
    }
    

    public void mostrarMovimiento(String direccion, double unidades) {
        String sentido;
        if (direccion.equalsIgnoreCase("horizontal")) {
            sentido = (unidades > 0) ? "derecha" : "izquierda";
        } else {
            sentido = (unidades > 0) ? "arriba" : "abajo";
        }
        System.out.println("Rectangulo movido " + Math.abs(unidades) + 
                         " unidades hacia " + sentido);
    }
    

    public void mostrarCambioEscala(double factor) {
        System.out.println("Escala cambiada con factor: " + factor);
    }
    

    public void limpiarPantalla() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
    
    // Método para mostrar mensaje genérico
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
