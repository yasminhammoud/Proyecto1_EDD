package Primitivas;

/**
 *
 * @author Yasmin Hammoud
 */
public class ColaSimple {

    private NodoSimple front, rear;
    private int size;

    public ColaSimple() {
        this.front = null;
        this.rear = null;
        this.size = 0;
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
        size++;
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
            size--;
            return tempVertex.getsData();
        } else {
            return null;
        }
    }

    public NodoSimple getFront() {
        return front;
    }

    public void setFront(NodoSimple front) {
        this.front = front;
    }

    public NodoSimple getRear() {
        return rear;
    }

    public void setRear(NodoSimple rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

}
