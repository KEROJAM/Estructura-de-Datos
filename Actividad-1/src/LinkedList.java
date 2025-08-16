public class LinkedList {

    Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public LinkedList(Node firstNode) {
        this.firstNode = firstNode;
    }

    /*public void InsertContact(Contacto Contact) {
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
    }*/
    public void InsertContact(Contacto Data){
        Node newNode = new Node(Data);
        int i = 0;
        if (this.firstNode.next == null) {
            this.firstNode.next = newNode;
        } else {
            Node currNode = this.firstNode;
            Node lastNode = this.firstNode;
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
            this.firstNode.setTail(newNode);
            this.firstNode.tail.setLast(lastNode);
            newNode.setHead(this.firstNode);
        }
    }

    public void InsertString(String Data){
        Node newNode = new Node(Data);
        int i = 0;
        if (this.firstNode.next == null) {
            this.firstNode.next = newNode;
        } else {
            Node currNode = this.firstNode;
            Node lastNode = this.firstNode;
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
            this.firstNode.setTail(newNode);
            this.firstNode.tail.setLast(lastNode);
            newNode.setHead(this.firstNode);
        }
    }

    public void printList( String FlowList) {
        switch (FlowList) {
            case "-->":
                Node currNode = this.firstNode;
                while (currNode.next != null) {
                    System.out.print(currNode.Data + FlowList);
                    currNode = currNode.next;
                }
                break;
            case "<--":
                Node tail = this.firstNode.tail;
                while (tail.last != null) {
                    System.out.print(tail.Data + FlowList);
                    tail = tail.last;
                }
                System.out.print(tail.Data + FlowList);
                break;
            case "o":
                break;
        }
    }
}
