/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

import javax.swing.JOptionPane;
import oracleofbacon.GrafoMatriz;

/**
 *
 * @author Yasmin Hammoud
 */
public class TraverseGraph {

    // Primer camino encontrado - Grados de separación BFS //
    public String[] BreadthFirstSearch(GrafoMatriz graph, String source, String destination) {

        String edges;
        int startingVertex;
        String[] searchRoute;
        startingVertex = graph.numVertice(source);
        if (startingVertex < 0) {
            JOptionPane.showMessageDialog(null, "El vértice origen no existe");
        }
        ColaSimple cola = new ColaSimple();

        boolean visited[] = new boolean[graph.getNumVerts()];

        searchRoute = new String[graph.getNumVerts()];

        // inicializa los vértices como no marcados
        for (int i = 0; i < graph.getNumVerts(); i++) {
            searchRoute[i] = "";
        }

        searchRoute[startingVertex] = ""; // vértice origen queda marcado

        cola.enQueue(String.valueOf(startingVertex));

        while (!cola.isEmpty()) {

            int frontQueue;
            String vertexEliminated = cola.deQueue();
            frontQueue = Integer.parseInt(vertexEliminated);

            //System.out.println("Vértice " + graph.verts[w] + "visitado");
            
            // inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < graph.getNumVerts(); u++) {
              //  if ((graph.matAd[w][u] == 1) && (m[u] == true)) {
// se marca vertice u con número de arcos hasta el
                 ///   m[u] = m[w] + 1;
                    cola.enQueue(String.valueOf(u));
                }
            }
        return searchRoute;
    }

    // Todos los caminos encontrados 
    /*
        public String[] allRoutesBFS(GrafoMatriz graph, String source, String destination) {
        String[] array = new String[5];
        return array;
        }
     */
}
