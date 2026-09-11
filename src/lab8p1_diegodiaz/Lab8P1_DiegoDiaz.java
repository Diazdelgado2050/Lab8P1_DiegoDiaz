/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_diegodiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab8P1_DiegoDiaz {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Videojuego> inventario = new ArrayList<>();
        String[][] estantes = new String[3][4];

        int opcion = 0;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Registrar Videojuego");
            System.out.println("2. Mostrar videojuegos registrados");
            System.out.println("3. Buscar videojuego por codigo");
            System.out.println("4. Actualizar videojuego");
            System.out.println("5. Eliminar videojuego");
            System.out.println("6. Mostar estantes");
            System.out.println("7. Mostrar videojuegos con poco Stock");
            System.out.println("Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Fin... de... el...programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida del menu");

            }

        } while (opcion != 0);

    }

    public static void estantes(String[][] estantes) {
        for (int i = 0; i < estantes.length; i++) {
            for (int j = 0; j < estantes[i].length; j++) {
                estantes[i][j] = "Libre";
            }

        }
    }
    public static Videojuego buscarcode(ArrayList<Videojuego> inventario, int codigo ){
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).Gcodigo() == codigo) {
               return inventario.get(i);
            }
        }
        return null;
    }

    public static void registarJuego(ArrayList<Videojuego> inventario, String[][] estantes) {
        if (inventario.size() >= 12) {
            System.out.println("Maximo de juegos en el estante (maximo 12)");
            return;
        }
        
        System.out.println("=== Registrar Videojuegos ===");
        System.out.println("Codigo: ");
        int cod = leer.nextInt();
        
        
        if (buscarcode(inventario, cod) != null ) {
            System.out.println("Ya existe un codigo con ese juego");
            return;
        }
        

    }
}
