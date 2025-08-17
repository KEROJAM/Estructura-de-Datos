public class DataTypeExamples {
    public static void MostrarEjemplos(){
        LinkedList SecuencialEjem = new LinkedList(new Node("A"));
        SecuencialEjem.InsertString("B");
        SecuencialEjem.InsertString("C");
        SecuencialEjem.InsertString("D");
        System.out.print("Secuencial: ");
        SecuencialEjem.printList("-->" );
        System.out.println();
        System.out.print("Doble: ");
        LinkedList DobleEjem = new LinkedList(new Node("1"));
        DobleEjem.InsertString("2");
        DobleEjem.InsertString("3");
        DobleEjem.InsertString("4");
        DobleEjem.printList("-->" );
        System.out.println();
        DobleEjem.printList("<--");
        System.out.println("\nCircular:");
        SecuencialEjem.printList("o");
        LinkedList SumaEjem = new LinkedList(new Node("1"));
        SumaEjem.InsertString("2");
        SumaEjem.InsertString("3");
        SumaEjem.InsertString("4");
        System.out.println("Se van a sumar el primer y tercer valor");
        Node CurrNode = SumaEjem.firstNode;
        int i = 0;
        Node u = null;
        Node o = null;
        while (CurrNode.next != null){
            if (i == 0){
                u = CurrNode.Data;
                CurrNode = CurrNode.next;
                i++;
            } else if (i == 3) {
                o = CurrNode.Data;
                i++;
            } else {
                CurrNode = CurrNode.next;
                i++;
            }
        }
        System.out.print(Integer.parseInt(u) + Integer.parseInt(o));
    }

    public static void HacerOperaciones(){}
}
