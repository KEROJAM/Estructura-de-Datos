import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList Secuencial = new LinkedList();
    static LinkedList Doble = new LinkedList();
    static LinkedList Circular = new LinkedList();

    public static int AgregarContacto(int times) throws IOException {
        try {
            System.out.println("| Introduzca los siguientes elementos para agregar el contacto:");
            System.out.print("| Nombre:");
            String NombreContacto = input.readLine();
            System.out.print("| Direccion:");
            String DireccionContacto = input.readLine();
            System.out.print("| Numero Telefonico:");
            int NumeroTelefonico = Integer.parseInt(input.readLine());
            System.out.println("\n*------------------------------*");
            if (times == 0) {
                Secuencial.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
                Doble.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
                Circular.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
            } else {
                Secuencial.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
                Doble.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
                Circular.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
            }
        } catch (Exception NumberFormatException){
            System.out.println("El numero telefonico tiene que ser un numero no puede ser una letra");
        }
        times++;
        return times;
    }
    public static void EliminarContacto() throws IOException {
       System.out.print("Intruduce el nombre del contacto al que quieres eliminar:");
       String ConNombre = input.readLine();
       Node curContact = Secuencial.firstNode;
       while (curContact.next != null){
           if (curContact.Data.toString().contains(ConNombre)){
               curContact.last.setNext(curContact.next);
               System.out.println("Contacto eliminado");
               break;
           } else {
               curContact = curContact.next;
           }
       }
    }
    public static void BuscarContacto() throws IOException {
        System.out.print("Introduce el nombre del contacto al que quieres buscar:");
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
        int[] Opciones = {1,2,3,4,5,6};
        int Times = 0;
        LinkedList Secuencial = new LinkedList();
        LinkedList Doble = new LinkedList();
        LinkedList Circular = new LinkedList();
        while(x) {
            System.out.println("*----------* Menu *------------*");
            System.out.println("| 1.- Agregar Contacto         |");
            System.out.println("| 2.- Eliminar Contacto        |");
            System.out.println("| 3.- Buscar Contacto          |");
            System.out.println("| 4.- Mostrar Contactos        |");
            System.out.println("| 5.- Mostrar Ejemplos         |");
            System.out.println("| 6.- Quit                     |");
            System.out.println("*------------------------------*");
            System.out.print("| Elija una Opcion:");
            try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                Times = AgregarContacto(Times);
                                break;
                            case 2:
                                EliminarContacto();
                                break;
                            case 3:
                                BuscarContacto();
                                break;
                            case 4:
                                MostrarContactos();
                                break;
                            case 5:
                                DataTypeExamples.MostrarEjemplos();
                                break;
                            case 6:
                                x = false;
                        }
                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("Esa no es una opcion");
            }
        }
    }
}