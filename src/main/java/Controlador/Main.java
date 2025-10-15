/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controlador;

/**
 *
 * @author USUARIO
 */
import Modelo.Rectangulo;
import Vista.CanvasPlano;
import Vista.MenuOpciones;

public class Main {
    
    public static void main(String[] args) {
        // Inicialización de componentes
        MenuOpciones menu = new MenuOpciones();
        CanvasPlano canvas = new CanvasPlano(800, 600);
        Escala escala = new Escala();
        
        // Crear rectángulo inicial
        System.out.println("=== CREACION DEL RECTANGULO ===");
        double[] coordenadas = menu.leerRectangulo();
        Rectangulo rectangulo = new Rectangulo(coordenadas[0], coordenadas[1], 
                                                coordenadas[2], coordenadas[3]);
        
        canvas.mostrarMensaje("\nRectangulo creado exitosamente!");
        canvas.dibujarRectangulo(rectangulo);
        menu.pausar();
        

        boolean continuar = true;
        
        while (continuar) {
            menu.mostrarMenu();
            int opcion = menu.leerOpcion();
            
            switch (opcion) {
                case 1: // Calcular área
                    canvas.limpiarPantalla();
                    canvas.mostrarArea(rectangulo);
                    menu.pausar();
                    break;
                    
                case 2: // Verificar si un punto está dentro
                    canvas.limpiarPantalla();
                    System.out.println("\n=== VERIFICAR PUNTO ===");
                    double[] punto = menu.leerPunto();
                    canvas.verificarPunto(rectangulo, punto[0], punto[1]);
                    menu.pausar();
                    break;
                    
                case 3: // Mover el rectángulo
                    canvas.limpiarPantalla();
                    System.out.println("\n=== MOVER RECTANGULO ===");
                    String direccion = menu.leerDireccion();
                    double unidades = menu.leerUnidades();
                    rectangulo.mover(unidades, direccion);
                    canvas.mostrarMovimiento(direccion, unidades);
                    canvas.dibujarRectangulo(rectangulo);
                    menu.pausar();
                    break;
                    
                case 4: // Cambiar escala
                    canvas.limpiarPantalla();
                    System.out.println("\n=== CAMBIAR ESCALA ===");
                    int tipoEscala = menu.leerTipoEscala();
                    
                    if (tipoEscala == 1) {
                        double factor = menu.leerFactorEscala();
                        escala.aplicarEscala(rectangulo, factor);
                        canvas.mostrarCambioEscala(factor);
                    } else {
                        double[] factores = menu.leerFactoresEscala();
                        escala.aplicarEscala(rectangulo, factores[0], factores[1]);
                        canvas.mostrarMensaje("Escala aplicada: X=" + factores[0] + ", Y=" + factores[1]);
                    }
                    
                    canvas.dibujarRectangulo(rectangulo);
                    menu.pausar();
                    break;
                    
                case 5: // Mostrar información del rectángulo
                    canvas.limpiarPantalla();
                    canvas.dibujarRectangulo(rectangulo);
                    menu.pausar();
                    break;
                    
                case 6: // Salir
                    canvas.limpiarPantalla();
                    canvas.mostrarMensaje("Gracias por usar el programa!");
                    continuar = false;
                    break;
                    
                default:
                    menu.mostrarError("Opcion no valida. Intente nuevamente.");
                    menu.pausar();
                    break;
            }
        }
        
        // Cerrar recursos
        menu.cerrar();
    }
}