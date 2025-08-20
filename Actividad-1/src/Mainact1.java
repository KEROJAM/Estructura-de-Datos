import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainact1 {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList Secuencial = new LinkedList();
    static LinkedList Doble = new LinkedList();
    static LinkedList Circular = new LinkedList();


    public static void EliminarContacto() throws IOException {
       System.out.print("| Intruduce el nombre del contacto al que quieres eliminar:");
       String ConNombre = input.readLine();
       Node curContact = Secuencial.firstNode;
       while (curContact.next != null || curContact.next == null){
           if (curContact.Data.toString().contains(ConNombre)){
               curContact.last.setNext(curContact.next);
               System.out.println("| Contacto eliminado");
               break;
           } else {
               curContact = curContact.next;
           }
       }
    }
    public static void ModificarContacto() throws IOException {
        System.out.print("| Introduce el nombre del contacto al que quieres modificar: ");
        String ModNomb = input.readLine();
        Node next = null;
        Node last = null;
        Node head = null;
        Node tail = null;
        Node curContact = Secuencial.firstNode;
        while (curContact.next != null || curContact.next == null){
            if (curContact.Data.toString().contains(ModNomb)){
                System.out.println("| Introduzca los siguientes elementos para modificar el contacto:");
                System.out.print("| Nombre:");
                String NombreContacto = input.readLine();
                System.out.print("| Direccion:");
                String DireccionContacto = input.readLine();
                System.out.print("| Numero Telefonico:");
                int NumeroTelefonico = Integer.parseInt(input.readLine());
                curContact.setData(new Contacto(NombreContacto, DireccionContacto,NumeroTelefonico));
                System.out.println("| Contacto eliminado");
                break;
            } else {
                curContact = curContact.next;
            }
        }
    }
    public static void BuscarContacto() throws IOException {
        System.out.print("| Introduce el nombre del contacto al que quieres buscar:");
        String ConNombre = input.readLine();
        Node curContact = Secuencial.firstNode;
        while (curContact.next != null || curContact.next == null){
            if (curContact.Data.toString().contains(ConNombre)){
                System.out.println(curContact.Data.toString());
                break;
            } else {
                curContact = curContact.next;
            }
        }
    }
    public static void MostrarContactos(){
        Node currNode = Secuencial.firstNode;
        while (currNode.next != null ) {
            System.out.print(currNode.Data.toString());
            System.out.println("\n*------------------------------*");
            currNode = currNode.next;
        }
        System.out.println(currNode.Data.toString());
    }
    public static void main(String[] args) throws IOException {
        boolean x = true;
        int[] Opciones = {1,2,3,4,5,6,7};
        int Times = 0;
        LinkedList Secuencial = new LinkedList();
        LinkedList Doble = new LinkedList();
        LinkedList Circular = new LinkedList();
        while(x) {
            System.out.println("*----------* Menu *------------*");
            System.out.println("| 1.- Agregar Contacto         |");
            System.out.println("| 2.- Eliminar Contacto        |");
            System.out.println("| 3.- Buscar Contacto          |");
            System.out.println("| 4.- Modificar Contactos      |");
            System.out.println("| 5.- Mostrar Contactos        |");
            System.out.println("| 6.- Mostrar Ejemplos         |");
            System.out.println("| 7.- Quit                     |");
            System.out.println("*------------------------------*");
            System.out.print("| Elija una Opcion:");
            //try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                try {
                                    System.out.println("| Introduzca los siguientes elementos para agregar el contacto:");
                                    System.out.print("| Nombre:");
                                    String NombreContacto = input.readLine();
                                    System.out.print("| Direccion:");
                                    String DireccionContacto = input.readLine();
                                    System.out.print("| Numero Telefonico:");
                                    int NumeroTelefonico = Integer.parseInt(input.readLine());
                                    System.out.println("*------------------------------*");
                                    Times = Secuencial.AgregarContacto(Times, NombreContacto, DireccionContacto, NumeroTelefonico);
                                    Times = Doble.AgregarContacto(Times, NombreContacto, DireccionContacto, NumeroTelefonico);
                                    Times--;
                                    Times = Circular.AgregarContacto(Times, NombreContacto, DireccionContacto, NumeroTelefonico);
                                    Times--;
                                } catch (Exception NumberFormatException){
                                System.out.println("El numero telefonico tiene que ser un numero no puede ser una letra");
                                }
                                break;
                            case 2:
                                EliminarContacto();
                                break;
                            case 3:
                                BuscarContacto();
                                break;
                            case 4:
                                ModificarContacto();
                                break;
                            case 5:
                                MostrarContactos();
                                break;
                            case 6:
                                DataTypeExamples.MostrarEjemplos();
                                break;
                            case 7:
                                x = false;
                        }
                    }
                }
            /*} catch (Exception InputMismatchException) {
                System.out.println("Esa no es una opcion");
            }*/
        }
    }
}