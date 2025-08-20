public class Stack<E> {
    public static final int CAPACITY = 1000;
    private LinkedList commands;
    private int size = commands.ListSize;
    
    public Stack(){
        this.commands = new LinkedList();
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public int size(){
        return (this.size);
    }

    public void push(E value){
        // Create a new node and add it to the linked list
        Node<E> newNode = new Node<>(value);
        if (this.commands.firstNode == null) {
            this.commands.setFirstNode(newNode);
        } else {
            newNode.setNext(this.commands.firstNode);
            this.commands.setFirstNode(newNode);
        }
        this.size++;
    }

    public E pop() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La Pila esta Vacia");
        }
        
        E result = (E) this.commands.firstNode.getData();
        this.commands.firstNode = this.commands.firstNode.next;
        this.size--;
        return result;
    }

    public E peek() throws Exception{
        if (this.isEmpty()){
            throw new Exception("La Pila esta vacia");
        }
        return (E) this.commands.firstNode.getData();
    }
}
