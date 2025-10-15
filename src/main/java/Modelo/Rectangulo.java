/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Rectangulo extends Figura {
    

    public Rectangulo(Punto p1, Punto p2) {
        super(p1, p2);
    }
    
    // Constructor sobrecargado con coordenadas separadas
    public Rectangulo(double x1, double y1, double x2, double y2) {
        super(new Punto(x1, y1), new Punto(x2, y2));
    }
    
    // Sobrescritura del método calcularArea (más específico para rectángulo)
    public double calcularArea() {
        double base = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        return base * altura;
    }
    
    // Sobrecarga: verificar si un punto está dentro usando coordenadas directas
    public boolean estaDentro(double x, double y) {
        Punto punto = new Punto(x, y);
        return super.estaDentro(punto);
    }
    
    // Sobrecarga: mover solo horizontalmente
    public void mover(double unidades, String direccion) {
        if (direccion.equalsIgnoreCase("horizontal")) {
            super.mover(unidades, 0);
        } else if (direccion.equalsIgnoreCase("vertical")) {
            super.mover(0, unidades);
        }
    }
    
    
}
