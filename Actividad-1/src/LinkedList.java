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
        if (this.firstNode == null) {
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
        if (this.firstNode == null) {
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

    public void printList(LinkedList List, String FlowList) {
        switch (FlowList) {
            case "-->":
                Node currNode = List.firstNode;
                while (currNode != null) {
                    System.out.print(currNode.Data + FlowList);
                    currNode = currNode.next;
                }
            case "<--":
                Node lastNode = List.firstNode.tail;
                while (lastNode.last != null) {
                    System.out.print(lastNode.Data + FlowList);
                    lastNode = lastNode.last;
                }
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
