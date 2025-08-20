import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

    Node firstNode;
    int ListSize;

    public LinkedList() {
        this.firstNode = null;
        this.ListSize = 0;
    }

    public LinkedList(Node firstNode) {
        this.firstNode = firstNode;
        this.ListSize = 1;
    }

    public void InsertString(String Data){
        Node newNode = new Node(Data);
        int i = 0;
        if (this.firstNode.next == null) {
            this.firstNode.next = newNode;
            this.ListSize++;
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
            this.ListSize++;
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


    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }
}
