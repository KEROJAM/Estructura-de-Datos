public class DataTypeExamples {
    public static void MostrarEjemplos(){
        LinkedList SecuencialEjem = new LinkedList(new Node("A"));
        SecuencialEjem.InsertString("B");
        SecuencialEjem.InsertString("C");
        SecuencialEjem.InsertString("D");
        SecuencialEjem.InsertString("F");
        SecuencialEjem.InsertString("E");
        System.out.print("Sequencial: ");
        SecuencialEjem.printList("-->" );
        System.out.println();
        System.out.print("Doble: ");
        SecuencialEjem.printList("-->" );
        System.out.println();
        SecuencialEjem.printList("<--");
        System.out.println();
    }

    public static void HacerOperaciones(){}
}
