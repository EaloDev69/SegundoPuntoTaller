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
    
}
