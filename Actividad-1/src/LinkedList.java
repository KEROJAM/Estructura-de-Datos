public class LinkedList {
    Node firstNode;
    public LinkedList() {
        this.firstNode = null;
    }

    public LinkedList(Node firstNode){
        this.firstNode = firstNode;
    }

    public LinkedList InsertNumber (int value){
        Node newNode = new Node(value);
        LinkedList List = new LinkedList();
        if (List.firstNode == null ){
            List.firstNode = newNode;
        } else {
            Node last = List.firstNode;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return List;
    }

    public LinkedList InsertString (String value){
        Node newNode = new Node(value);
        LinkedList List = new LinkedList();
        if (List.firstNode == null ){
            List.firstNode = newNode;
        } else {
            Node last = List.firstNode;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return List;
    }

    public static void printList(LinkedList List){
        Node currNode = List.firstNode;
        System.out.print("LinkedList: ");
        while (currNode != null){
            System.out.print(currNode.Data + " ");
            currNode = currNode.next;
        }
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }
}
