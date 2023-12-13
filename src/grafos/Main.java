package grafos;

public class Main {
    public static void main(String[] args) {
        // MatrizAdjacencia
        /*
        int numVertices = 3;
        MatrizAdjacencia grafo = new MatrizAdjacencia(numVertices, false, false);

        grafo.inserirAresta(0, 1);
        grafo.inserirAresta(0, 2);
        grafo.inserirAresta(1, 2);

        grafo.mostrarAdjacencia();
        System.out.println();

        MatrizAdjacencia grafo2 = new MatrizAdjacencia(numVertices, true, false);
        grafo2.inserirAresta(0, 1, 3);
        grafo2.inserirAresta(1, 2, 5);
        grafo2.inserirAresta(2, 0, 1);

        grafo2.mostrarAdjacencia();
        System.out.println();
        */

        // ListaAdjacencia

        ListaAdjacencia grafo = new ListaAdjacencia(3, false);

        grafo.adicionaAresta(0, 1);
        grafo.adicionaAresta(0, 2);
        grafo.adicionaAresta(1, 2);

        grafo.mostrarListaAdjacencias();

        System.out.println("**************************");

        grafo.mostrarListaAdjacenciasDoVertice(0);

        System.out.println("**************************");

        grafo.removeAresta(0, 1);

        grafo.mostrarListaAdjacencias();

        System.out.println("**************************");

        System.out.println(grafo.adjacente(1, 2));
        System.out.println(grafo.adjacente(0, 1));
    }
}
