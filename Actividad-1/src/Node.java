public class Node {
    public int Number;
    private Node next;

    public Node (int valNumber) {
        this.Number = valNumber;
        this.next = null;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getNumber() {
        return Number;
    }

    public Node getNext() {
        return next;
    }
}
