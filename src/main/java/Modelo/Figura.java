/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Figura {
    protected Punto p1;  // Vértice inferior izquierdo
    protected Punto p2;  // Vértice superior derecho
    protected Punto p3;  // Vértice superior izquierdo (opcional)
    protected Punto p4;  // Vértice inferior derecho (opcional)

    public Figura(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;

        this.p3 = new Punto(p1.getX(), p2.getY());
        this.p4 = new Punto(p2.getX(), p1.getY());
    }
    

    public Punto getP1() {
        return p1;
    }
    
    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    
    public Punto getP2() {
        return p2;
    }
    
    public void setP2(Punto p2) {
        this.p2 = p2;
    }
    
    public Punto getP3() {
        return p3;
    }
    
    public Punto getP4() {
        return p4;
    }
    
     public boolean estaDentro(Punto punto) {
        double minX = Math.min(p1.getX(), p2.getX());
        double maxX = Math.max(p1.getX(), p2.getX());
        double minY = Math.min(p1.getY(), p2.getY());
        double maxY = Math.max(p1.getY(), p2.getY());
        
        return punto.getX() >= minX && punto.getX() <= maxX &&
               punto.getY() >= minY && punto.getY() <= maxY;
    }
    

    public void mover(double dx, double dy) {
        p1.setX(p1.getX() + dx);
        p1.setY(p1.getY() + dy);
        p2.setX(p2.getX() + dx);
        p2.setY(p2.getY() + dy);
        p3.setX(p3.getX() + dx);
        p3.setY(p3.getY() + dy);
        p4.setX(p4.getX() + dx);
        p4.setY(p4.getY() + dy);
    }
    
    @Override
    public String toString() {
        return "Figura con vértices: " + p1 + ", " + p2 + ", " + p3 + ", " + p4;
    }
    
}
