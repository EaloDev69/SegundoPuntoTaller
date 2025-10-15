/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class MenuOpciones {
    private Scanner scanner;
    

    public MenuOpciones() {
        this.scanner = new Scanner(System.in);
    }
    

    public void mostrarMenu() {
        System.out.println("\n===== MENU DE OPCIONES =====");
        System.out.println("1. Calcular area del rectangulo");
        System.out.println("2. Verificar si un punto esta dentro");
        System.out.println("3. Mover el rectangulo");
        System.out.println("4. Cambiar escala del rectangulo");
        System.out.println("5. Mostrar informacion del rectangulo");
        System.out.println("6. Salir");
        System.out.println("============================");
        System.out.print("Seleccione una opcion: ");
    }
    

    public int leerOpcion() {
        try {
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            return opcion;
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar buffer en caso de error
            return -1;
        }
    }
    

    public double[] leerPunto() {
        double[] coordenadas = new double[2];
        System.out.print("Ingrese coordenada X: ");
        coordenadas[0] = scanner.nextDouble();
        System.out.print("Ingrese coordenada Y: ");
        coordenadas[1] = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return coordenadas;
    }
    

    public String leerDireccion() {
        System.out.println("\nDireccion de movimiento:");
        System.out.println("1. Horizontal");
        System.out.println("2. Vertical");
        System.out.print("Seleccione: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        if (opcion == 1) {
            return "horizontal";
        } else {
            return "vertical";
        }
    }
    
  
    public double leerUnidades() {
        System.out.print("Ingrese cantidad de unidades (+ o -): ");
        double unidades = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return unidades;
    }
    

    public double leerFactorEscala() {
        System.out.print("Ingrese el factor de escala: ");
        double factor = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return factor;
    }
    

    public double[] leerFactoresEscala() {
        double[] factores = new double[2];
        System.out.print("Ingrese factor X: ");
        factores[0] = scanner.nextDouble();
        System.out.print("Ingrese factor Y: ");
        factores[1] = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return factores;
    }

    public int leerTipoEscala() {
        System.out.println("\nTipo de escala:");
        System.out.println("1. Factor unico (X y Y iguales)");
        System.out.println("2. Factores separados (X y Y diferentes)");
        System.out.print("Seleccione: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        return opcion;
    }
    

    public double[] leerRectangulo() {
        double[] coordenadas = new double[4];
        System.out.println("\nIngrese las coordenadas del primer vertice (inferior izquierdo):");
        System.out.print("X1: ");
        coordenadas[0] = scanner.nextDouble();
        System.out.print("Y1: ");
        coordenadas[1] = scanner.nextDouble();
        
        System.out.println("\nIngrese las coordenadas del segundo vertice (superior derecho):");
        System.out.print("X2: ");
        coordenadas[2] = scanner.nextDouble();
        System.out.print("Y2: ");
        coordenadas[3] = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        return coordenadas;
    }
    

    public void mostrarError(String mensaje) {
        System.out.println("\nERROR: " + mensaje);
    }
    

    public void pausar() {
        System.out.print("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
    

    public void cerrar() {
        scanner.close();
    }
}
