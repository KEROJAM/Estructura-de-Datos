public class LinkedList {

    Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public LinkedList(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void InsertContact(Contacto Contact) {
        Node newNode = new Node(Contact);
        if (this.firstNode.next == null) {
            this.firstNode = newNode;
        } else {
            Node last = this.firstNode;
            Node next = this.firstNode;
            while (last.next != null) {
                last = last.next;
                next = last.next;
            }
            next.next = newNode;
        }
    }

    public void InsertString(String Data){
        Node newNode = new Node(Data);
        if (this.firstNode.next == null) {
            this.firstNode.next = newNode;
        } else {
            Node last = this.firstNode;
            Node next = this.firstNode.next;
            while (next.next != null) {
                next.last = next.next;
                next = next.next;
                this.firstNode.tail = last;
            }
            next.next = newNode;
            this.firstNode.tail = newNode;
        }
    }

    public void printList(LinkedList List, String FlowList) {
        switch (FlowList) {
            case "-->":
                Node currNode = List.firstNode;
                while (currNode != null) {
                    System.out.println(currNode.last);
                    System.out.print(currNode.Data + FlowList);
                    currNode = currNode.next;
                }
                break;
            case "<--":
                Node tail = List.firstNode.tail;
                while (tail.last != null) {
                    System.out.print(tail.Data + FlowList);
                    tail = tail.last;
                }
                System.out.println("test");
                break;
            case "o":

        }
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }
}
