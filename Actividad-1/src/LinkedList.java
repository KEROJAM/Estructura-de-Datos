import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

    Node firstNode;

    public LinkedList() {
        this.firstNode = null;
    }

    public LinkedList(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void InsertObject(Object Data){
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
            this.firstNode.tail.setHead(this.firstNode);
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
            this.firstNode.setHead(this.firstNode);
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
                System.out.print(currNode.Data);
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
                Node CurrNode = this.firstNode;
                while (CurrNode.next !=null){
                    System.out.print(CurrNode.Data + " " + FlowList + " ");
                    CurrNode = CurrNode.next;
                }
                System.out.print(CurrNode.Data + " " + FlowList + " ");
                Node Head = this.firstNode.head;
                while (Head.next !=null){
                    System.out.print(Head.Data + " " +FlowList + " ");
                    Head = Head.next;
                }
                System.out.print(CurrNode.Data);
                System.out.println();
                break;
        }
    }
    public void Addition(){
        Node CurrNode = this.firstNode;
        int i = 0;
        String u = "";
        String o = "";
        while (CurrNode.next != null){
            if (i == 0){
                u = CurrNode.Data.toString();
            } else if (i == 2) {
                o = CurrNode.Data.toString();
            }
            i++;
            CurrNode = CurrNode.next;
        }
        System.out.print(Integer.parseInt(u) + Integer.parseInt(o));
    }

    public int AgregarContacto(int times, String NombreContacto, String DireccionContacto, int NumeroTelefonico) throws IOException {
        if (times == 0) {
            setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
        } else {
            InsertObject(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
        }
        times++;
        return times;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }
}
