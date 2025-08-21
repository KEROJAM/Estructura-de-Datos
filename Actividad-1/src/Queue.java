import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue<E> {
    public LinkedList processes;
    private int size;

    public Queue() {
        this.processes = new LinkedList();
        this.size = processes.ListSize;
    }

    /**
     * Indica si la cola está vacía.
     * @return true si no hay elementos, false en caso contrario
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Devuelve el número de elementos en la cola.
     * @return tamaño de la cola
     */
    public int size() {
        return this.size;
    }

    /**
     * Inserta un nuevo elemento al final de la cola. El dato se lee de la entrada estándar
     * y se almacena como String dentro de un {@link Node}.
     * @throws IOException si ocurre un error al leer desde la entrada
     */
    public void enqueue() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String Data = input.readLine();
        Node newNode = new Node(Data);
        int i = 0;
        if (this.processes.firstNode == null) {
            this.processes.firstNode = newNode;
            this.processes.firstNode.setTail(newNode);
            this.size++;
            return;
        }

        if (this.processes.firstNode.next == null) {
            this.processes.firstNode.setNext(newNode);
            newNode.setLast(this.processes.firstNode);
            this.processes.firstNode.setTail(newNode);
            newNode.setHead(this.processes.firstNode);
            this.processes.firstNode.setHead(this.processes.firstNode);
            this.size++;
            return;
        }

        {
            Node currNode = this.processes.firstNode;
            Node lastNode = this.processes.firstNode;
            while (currNode.next != null) {
                currNode = currNode.next;
                if (i == 0) {
                    i++;
                } else if (i == 1) {
                    lastNode = lastNode.next;
                    currNode.setLast(lastNode);
                    i++;
                } else {
                    lastNode = lastNode.next;
                }
            }
            currNode.setNext(newNode);
            currNode.setLast(lastNode);
            this.processes.firstNode.setTail(newNode);
            newNode.setLast(currNode);
            newNode.setHead(this.processes.firstNode);
            this.processes.firstNode.setHead(this.processes.firstNode);
            this.size++;
        }
    }

    /**
     * Remueve y devuelve el primer elemento de la cola.
     * @return representación en String del elemento removido
     * @throws Exception si la cola está vacía
     */
    public String dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("La Cola esta vacia");
        }

        String result = this.processes.firstNode.Data.toString();

        Node oldFirst = this.processes.firstNode;
        Node newFirst = oldFirst.next;

        if (newFirst == null) {
            this.processes.firstNode = null;
        } else {
            oldFirst.setNext(null);
            oldFirst.setHead(null);
            newFirst.setLast(null);
            newFirst.setHead(newFirst);
            newFirst.setTail(oldFirst.tail != null ? oldFirst.tail : newFirst.tail);
            this.processes.firstNode = newFirst;
        }

        this.size--;
        return result;
    }

    /**
     * Obtiene el primer elemento de la cola sin removerlo.
     * @return representación en String del primer elemento
     * @throws Exception si la cola está vacía
     */
    public String peek() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La Cola esta vacia");
        }
        return this.processes.firstNode.getData().toString();
    }

    /**
     * Muestra todos los elementos de la cola con su posición.
     * @throws Exception si la cola está vacía
     */
    public void show() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("La Cola esta Vacia");
        }
        
        System.out.println("Procesos en la cola:");
        Node current = this.processes.firstNode;
        int position = 1;
        
        while (current != null) {
            System.out.println("Proceso " + position + ": " + current.Data);
            current = current.next;
            position++;
        }
    }

    /**
     * Devuelve el conteo de procesos en la cola.
     * @return número de procesos
     */
    public int getProcessCount() {
        return this.size;
    }

    /**
     * Elimina todos los elementos de la cola y reinicia su tamaño a 0.
     */
    public void clear() {
        this.processes.firstNode = null;
        this.size = 0;
    }
}
