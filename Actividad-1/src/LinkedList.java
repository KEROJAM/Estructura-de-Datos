public class LinkedList {
    Node firstNode;
    public LinkedList() {
        this.firstNode = null;
    }

    public LinkedList(Node firstNode){
        this.firstNode = firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }
}
