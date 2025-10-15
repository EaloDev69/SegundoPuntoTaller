/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundopuntotaller_miguelangelealovalle;

import Modelo.Rectangulo;

public class Escala {
    
    public void aplicarEscala(Rectangulo rectangulo, double factor) {
        rectangulo.cambiarEscala(factor);
    }
    
    public void aplicarEscala(Rectangulo rectangulo, double factorX, double factorY) {
        rectangulo.cambiarEscala(factorX, factorY);
    }
    
    public void aumentarEscala(Rectangulo rectangulo, double porcentaje) {
        double factor = 1 + (porcentaje / 100);
        rectangulo.cambiarEscala(factor);
    }
    
    public void reducirEscala(Rectangulo rectangulo, double porcentaje) {
        double factor = 1 - (porcentaje / 100);
        if (factor > 0) {
            rectangulo.cambiarEscala(factor);
        } else {
            System.out.println("Error: El porcentaje de reduccion es demasiado grande");
        }
    }
    
    public boolean validarFactor(double factor) {
        if (factor <= 0) {
            System.out.println("Error: El factor debe ser mayor que 0");
            return false;
        }
        if (factor > 100) {
            System.out.println("Advertencia: Factor muy grande, podria causar problemas");
            return true; // Permite pero advierte
        }
        if (factor < 0.01) {
            System.out.println("Advertencia: Factor muy pequeño, el rectangulo sera casi invisible");
            return true; // Permite pero advierte
        }
        return true;
    }
    
    public void escalarAncho(Rectangulo rectangulo, double factorX) {
        rectangulo.cambiarEscala(factorX, 1.0);
    }
    
    public void escalarAltura(Rectangulo rectangulo, double factorY) {
        rectangulo.cambiarEscala(1.0, factorY);
    }
    
    public void restaurarEscala(Rectangulo rectangulo, double anchoOriginal, double altoOriginal) {
        double anchoActual = Math.abs(rectangulo.getP2().getX() - rectangulo.getP1().getX());
        double altoActual = Math.abs(rectangulo.getP2().getY() - rectangulo.getP1().getY());
        
        double factorX = anchoOriginal / anchoActual;
        double factorY = altoOriginal / altoActual;
        
        rectangulo.cambiarEscala(factorX, factorY);
    }
    
    public void escalaInteligente(Rectangulo rectangulo, double factor) {
        if (validarFactor(factor)) {
            double areaActual = rectangulo.calcularArea();
            
            if (areaActual > 0) {
                if (areaActual < 10) {
                    // Si el área es pequeña, limitar reducción
                    if (factor < 1) {
                        System.out.println("Advertencia: El rectangulo ya es pequeño");
                        if (factor < 0.5) {
                            System.out.println("Factor ajustado a 0.5 para evitar rectangulo demasiado pequeño");
                            rectangulo.cambiarEscala(0.5);
                        } else {
                            rectangulo.cambiarEscala(factor);
                        }
                    } else {
                        rectangulo.cambiarEscala(factor);
                    }
                } else if (areaActual > 1000) {
                    // Si el área es grande, limitar aumento
                    if (factor > 1) {
                        System.out.println("Advertencia: El rectangulo ya es grande");
                        if (factor > 2) {
                            System.out.println("Factor ajustado a 2 para evitar rectangulo demasiado grande");
                            rectangulo.cambiarEscala(2);
                        } else {
                            rectangulo.cambiarEscala(factor);
                        }
                    } else {
                        rectangulo.cambiarEscala(factor);
                    }
                } else {
                    // Área normal, aplicar sin restricciones
                    rectangulo.cambiarEscala(factor);
                }
            }
        }
    }
}
