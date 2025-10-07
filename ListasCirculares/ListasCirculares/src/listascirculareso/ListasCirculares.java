package listas;

import java.util.Scanner;

public class ListasCirculares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcion, elemento;

        do {
            System.out.println("\n--- MENU LISTA CIRCULAR ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar nodo");
            System.out.println("4. Buscar nodo");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar: ");
                    elemento = entrada.nextInt();
                    lista.insertar(elemento);
                    System.out.println("Elemento insertado correctamente.");
                    break;

                case 2:
                    lista.mostrarLista();
                    break;

                case 3:
                    System.out.print("Ingrese el elemento a eliminar: ");
                    elemento = entrada.nextInt();
                    lista.eliminar(elemento);
                    break;

                case 4:
                    System.out.print("Ingrese el elemento a buscar: ");
                    elemento = entrada.nextInt();
                    if (lista.buscar(elemento))
                        System.out.println("El elemento " + elemento + " SI se encuentra en la lista.");
                    else
                        System.out.println("El elemento " + elemento + " NO esta en la lista.");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}