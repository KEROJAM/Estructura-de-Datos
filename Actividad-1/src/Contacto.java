import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contacto {
    public String Nombre;
    public String Direccion;
    public int NumeroTel;
    public Contacto(String valNombre, String valDireccion, int valNumeroTel){
        this.Nombre = valNombre;
        this.Direccion = valDireccion;
        this.NumeroTel = valNumeroTel;
    }
    public static void EliminarContacto(LinkedList List) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("| Intruduce el nombre del contacto al que quieres eliminar:");
        String ConNombre = input.readLine();
        Node curContact = List.firstNode;
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
    @Override
    public String toString() {
        return "| Nombre:" + Nombre + "\n| Direccion:" + Direccion + "\n| Numero Telefonico:" + NumeroTel;
    }
    public String getNombre() {
        return Nombre;
    }
}
