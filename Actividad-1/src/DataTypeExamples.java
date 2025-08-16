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
    }

    public static void HacerOperaciones(){}
}
