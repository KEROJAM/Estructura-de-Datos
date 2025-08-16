public class Node <E> {
    public E Data;
    protected Node head;
    protected Node next;
    protected Node last;
    protected Node tail;

    public Node(E valData) {
        this.Data = valData;
        this.head = null;
        this.next = null;
        this.last = null;
        this.tail = null;
    }

    public void setData(E valData) {
        Data = valData;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public E getData() {
        if (Data.getClass() == Contacto.class) {
            return Data;
        } else {
            return Data;
        }
    }
}