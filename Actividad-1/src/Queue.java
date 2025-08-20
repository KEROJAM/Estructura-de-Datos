public class Queue<E> {
    private LinkedList processes;
    private int size;

    public Queue() {
        this.processes = new LinkedList();
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    // Enqueue - Agregar elemento al final de la cola (FIFO)
    public void enqueue(E value) {
        if (this.processes.firstNode == null) {
            // Primer elemento
            Node<E> newNode = new Node<>(value);
            this.processes.firstNode = newNode;
            this.processes.firstNode.setHead(newNode);
            this.processes.firstNode.setTail(newNode);
        } else {
            // Agregar al final usando el metodo de LinkedList
            this.processes.InsertString(value.toString());
        }
        this.size++;
    }

    // Dequeue - Remover elemento del frente de la cola (FIFO)
    public E dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("La Cola esta vacia");
        }

        E result = (E) this.processes.firstNode.Data;
        
        if (this.processes.firstNode.next == null) {
            // Solo hay un elemento
            this.processes.firstNode = null;
        } else {
            // Mover el primer nodo al siguiente
            this.processes.firstNode = this.processes.firstNode.next;
        }
        
        this.size--;
        return result;
    }

    // Peek - Ver el primer elemento sin removerlo
    public E peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("La Cola esta Vacia");
        }
        return (E) this.processes.firstNode.Data;
    }

    // Mostrar todos los elementos de la cola
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

    // Metodo adicional para obtener el número de procesos
    public int getProcessCount() {
        return this.size;
    }

    // Metodo para limpiar la cola
    public void clear() {
        this.processes.firstNode = null;
        this.size = 0;
    }
}
