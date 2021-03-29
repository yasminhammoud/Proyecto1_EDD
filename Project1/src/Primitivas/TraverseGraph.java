/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;


import oracleofbacon.GrafoMatriz;


// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class TraverseGraph {

    // Primer camino encontrado - Grados de separación BFS //
    public String[] BreadthFirstSearch(GrafoMatriz graph, String source, String destination) {

        //String edges;
        int startingVertex;
        String[] searchRoute;
        startingVertex = graph.numVertice(source);
        //if (startingVertex < 0) {
            //JOptionPane.showMessageDialog(null, "El vértice origen no existe");
        //}
        ColaSimple cola = new ColaSimple();
        boolean visited[] = new boolean[graph.getNumVerts()];
        searchRoute = new String[graph.getNumVerts()];
        
         // vértice origen queda marcado
        visited[startingVertex] = true;
        searchRoute[startingVertex] = source;

        cola.enQueue(source);

        while (cola.getFront().getsData() == null ? destination != null : !cola.getFront().getsData().equals(destination)) {

            String frontQueue = cola.deQueue();
            int positionFront = graph.numVertice(frontQueue);
            searchRoute[positionFront] = frontQueue;
                 
            // inserta en la cola los adyacentes no marcados
            //for (int i = 0; i < graph.getNumVerts(); i++) {
               //if ((graph.getMatAd()[positionFront][i] == 1) && (visited[i] == false)) {
             // se marca vertice u con número de arcos hasta el
             //   m[i] = m[w] + 1;
              //      cola.enQueue(graph.getVertex(i));
              //}
                }
        return searchRoute;
    }
}
    // Todos los caminos encontrados 
    /*
        public String[] allRoutesBFS(GrafoMatriz graph, String source, String destination) {
        String[] array = new String[5];
        return array;
        }
     */


