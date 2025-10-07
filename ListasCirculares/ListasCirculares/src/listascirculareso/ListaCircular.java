package listas;

public class ListaCircular {
    Nodo ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    public void insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        } else {
            nuevo.siguiente = nuevo;
        }
        ultimo = nuevo;
    }

    public void mostrarLista() {
        if (ultimo == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo auxiliar = ultimo.siguiente;
        System.out.print("Lista: ");
        do {
            System.out.print(auxiliar.dato + " ");
            auxiliar = auxiliar.siguiente;
        } while (auxiliar != ultimo.siguiente);
        System.out.println();
    }

    public void eliminar(int elemento) {
        if (ultimo == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = ultimo.siguiente;
        Nodo anterior = ultimo;
        boolean encontrado = false;

        do {
            if (actual.dato == elemento) {
                encontrado = true;
                if (actual == ultimo && actual == ultimo.siguiente) {
                    // Solo un nodo
                    ultimo = null;
                } else {
                    anterior.siguiente = actual.siguiente;
                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        if (encontrado) {
            System.out.println("Elemento " + elemento + " eliminado.");
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public boolean buscar(int elemento) {
        if (ultimo == null) return false;

        Nodo aux = ultimo.siguiente;
        do {
            if (aux.dato == elemento) return true;
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);

        return false;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }
}
