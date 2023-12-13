package grafos;

import java.util.*;

class Aresta {
    int origem, destino, peso;

    public Aresta(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }
}

public class ListaAdjacencia {
    private int nVertices;
    private List<List<Aresta>> adjacencias;
    private boolean direcionado;

    public ListaAdjacencia(int nVertices, boolean direcionado) {
        this.nVertices = nVertices;
        this.direcionado = direcionado;
        this.adjacencias = new ArrayList<>(nVertices);
        for (int i = 0; i < nVertices; i++) {
            adjacencias.add(new ArrayList<Aresta>());
        }
    }

    public void adicionaAresta(int u, int v, int peso) {
        Aresta aresta = new Aresta(u, v, peso);
        adjacencias.get(u).add(aresta);
        if (!direcionado) {
            Aresta arestaInvertida = new Aresta(v, u, peso);
            adjacencias.get(v).add(arestaInvertida);
        }
    }

    public void adicionaAresta(int u, int v) {
        adicionaAresta(u, v, 1);
    }

    public void mostrarListaAdjacencias() {
        for (int i = 0; i < nVertices; i++) {
            System.out.print("Vértice " + i + ": ");
            for (Aresta aresta : adjacencias.get(i)) {
                System.out.print("(" + aresta.destino + ", Peso:" + aresta.peso + ")");
            }
            System.out.println();
        }
    }

    public void removeAresta(int u, int v) {
        List<Aresta> arestasU = adjacencias.get(u);
        for (Aresta aresta : arestasU) {
            if (aresta.destino == v) {
                arestasU.remove(aresta);
                break;
            }
        }
        if (!direcionado) {
            List<Aresta> arestasV = adjacencias.get(v);
            for (Aresta aresta : arestasV) {
                if (aresta.destino == u) {
                    arestasV.remove(aresta);
                    break;
                }
            }
        }
    }

    public boolean adjacente(int u, int v) {
        for (Aresta aresta : adjacencias.get(u)) {
            if (aresta.destino == v) {
                return true;
            }
        }
        return false;
    }

    public void mostrarListaAdjacenciasDoVertice(int vertice) {
        System.out.print("Vértice " + vertice + ": ");
        for (Aresta aresta : adjacencias.get(vertice)) {
            System.out.print("(" + aresta.destino + ", Peso:" + aresta.peso + ")");
        }
        System.out.println();
    }
}