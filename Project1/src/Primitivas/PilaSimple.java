/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

// *********** EQUIPO *********** FIDEL BARREAT - ALEJANDRO GUZMAN - YASMIN HAMMOUD
public class PilaSimple {

    private NodoSimple top;

    public PilaSimple() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Agregar elemento en la cima de la pila 
    public void push(String vertex) {

        NodoSimple newVertex = new NodoSimple(vertex);

        if (isEmpty()) {
            top = newVertex;
        } else {
            newVertex.setpNext(top);
            top = newVertex;
        }
    }

    // Eliminar elemento de la cima de la pila    --- HAY QUE VERIFICAR SI ESTO DEBE DEVOLVER EL NODO ---- 
    public String pop() {

        if (isEmpty()) {
            return null;
        } else {
            NodoSimple tempVertex = top;
            top = top.getpNext();
            return tempVertex.getsData();
        }
    }

    public NodoSimple getTop() {
        return top;
    }

    public void setTop(NodoSimple top) {
        this.top = top;
    }

}
