package Primitivas;

/**
 *
 * @author Yasmin Hammoud
 */
public class ColaSimple {

    private NodoSimple front, rear;

    public ColaSimple() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    //Agregar vértice al final de la cola 
    void enQueue(String vertex) {

        NodoSimple newVertex = new NodoSimple(vertex);

        // Si la cola está vacía, el inicio y el final serán el nuevo vértice
        if (isEmpty()) {
            front = rear = newVertex;
        } else {
            //Se agrega un nuevo nodo al final de la cola, y se cambia el "rear" 
            rear.setpNext(newVertex);
            rear = newVertex;
        }
    }
    
    // Eliminar el primer elemento de la cola 
    public String deQueue() { // Cambir a Vertice
        if (!isEmpty()) {
            // Se almacena el primer elemento para devolverlo, antes de eliminarlo
            NodoSimple tempVertex = front;
            front = front.getpNext();

            // Si el inicio se vuelve NULL, entonces "reseteamos la cola"
            if (front == null) {
                rear = null;
            }
            return tempVertex.getsData();
        } else {
            return null;
        }
    }

}

