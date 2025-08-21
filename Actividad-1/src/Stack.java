import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementación de una pila (LIFO) genérica basada en {@link LinkedList}.
 * Permite apilar comandos con {@link #push()}, desapilar con {@link #pop()} y consultar con {@link #peek()}.
 */
public class Stack<E> {
    public LinkedList commands;
    private int size;
    
    public Stack(){
        this.commands = new LinkedList();
        this.size = commands.ListSize;
    }

    /**
     * Indica si la pila está vacía.
     * @return true si no hay elementos
     */
    public boolean isEmpty(){
        return (this.size == 0);
    }

    /**
     * Devuelve el número de elementos en la pila.
     * @return tamaño de la pila
     */
    public int size(){
        return (this.size);
    }

    /**
     * Inserta (empuja) un nuevo elemento al tope de la pila.
     * El dato se lee de la entrada estándar y se guarda como String en un {@link Node}.
     * @throws IOException si falla la lectura de la entrada
     */
    public void push() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String Data = input.readLine();
        Node newNode = new Node(Data);
        int i = 0;
        if (this.commands.firstNode == null) {
            this.commands.firstNode = newNode;
            this.commands.firstNode.setTail(newNode);
            this.size++;
        } else {
            if (this.commands.firstNode.next == null) {
                this.commands.firstNode.setNext(newNode);
                newNode.setLast(this.commands.firstNode);
                this.commands.firstNode.setTail(newNode);
                newNode.setHead(this.commands.firstNode);
                this.commands.firstNode.setHead(this.commands.firstNode);
                this.size++;
                return;
            }
            Node currNode = this.commands.firstNode;
            Node lastNode = this.commands.firstNode;
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
            this.commands.firstNode.setTail(newNode);
            newNode.setLast(currNode);
            newNode.setHead(this.commands.firstNode);
            this.commands.firstNode.setHead(this.commands.firstNode);
            this.size++;
        }
    }

    /**
     * Elimina (desapila) el último elemento insertado (tope) y devuelve un mensaje.
     * Nota: devuelve un mensaje genérico de ejecución, no el dato eliminado.
     * @return mensaje de confirmación de ejecución del comando
     * @throws Exception si la pila está vacía
     */
    public String pop() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La Pila esta Vacia");
        }
        // El stack debe eliminar el último elemento insertado (tail)
        Node tail = this.commands.firstNode.tail;
        // Fallback si por alguna razón no está seteada la cola
        if (tail == null) {
            tail = this.commands.firstNode;
            while (tail.next != null) {
                tail = tail.next;
            }
        }

        if (tail == this.commands.firstNode) {
            this.commands.setFirstNode(null);
        } else {
            Node prev = tail.last;
            if (prev != null) {
                prev.setNext(null);
            }
            this.commands.firstNode.setTail(prev);
            tail.setLast(null);
            tail.setNext(null);
        }

        this.size--;
        return "| Comando Ejecutado!           |";
    }

    /**
     * Obtiene el primer elemento de la estructura subyacente sin eliminar.
     * Nota: en esta implementación devuelve el dato del primer nodo, no del tope real.
     * @return representación en String del elemento
     * @throws Exception si la pila está vacía
     */
    public String peek() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La Pila esta vacia");
        }
        return this.commands.firstNode.getData().toString();
    }
}
