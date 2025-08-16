import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList Secuencial;
    static LinkedList Doble;
    static LinkedList Circular;

    public static void AgregarContacto() throws IOException {
        System.out.println("Introduzca los siguientes elementos para agregar el contacto:");
        System.out.print("Nombre:");
        String NombreContacto = input.readLine();
        System.out.print("Direccion:");
        String DireccionContacto = input.readLine();
        System.out.print("Numero Telefonico:");
        int NumeroTelefonico = input.read();
        Secuencial.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
        Doble.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
        Circular.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
    }
    public static void MostrarEjemplos(){
        LinkedList SecuencialEjem = new LinkedList(new Node("A"));
        SecuencialEjem.InsertString("B");
        SecuencialEjem.InsertString("C");
        SecuencialEjem.InsertString("D");
        System.out.print("Sequencial: ");
        SecuencialEjem.printList(SecuencialEjem, "-->" );
        System.out.println();
        System.out.print("Doble: ");
        SecuencialEjem.printList(SecuencialEjem, "-->" );
        System.out.println();
        SecuencialEjem.printList(SecuencialEjem, "<--");
    }
    public static void HacerOperaciones(){}
    public static void MostrarTipo(){}
    public static void EliminarElementos(){}
    public static void Contactos(){}
    public static void main(String[] args) throws IOException {
        boolean x = true;
        int[] Opciones = {1,2,3,4,5,6};
        LinkedList Secuencial = new LinkedList();
        LinkedList Doble = new LinkedList();
        LinkedList Circular = new LinkedList();
        while(x) {
            System.out.println("*----------* Menu *------------*");
            System.out.println("| 1.- Agregar Contacto         |");
            System.out.println("| 2.- Eliminar Contacto        |");
            System.out.println("| 3.- Mostrar Contactos        |");
            System.out.println("| 4.- Hacer Operaciones        |");
            System.out.println("| 5.- Mostrar Ejemplos         |");
            System.out.println("| 6.- Quit                     |");
            System.out.println("*------------------------------*");
            System.out.print("Elija una Opcion:");
            ///try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                System.out.println(OpcionUsuario);
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                AgregarContacto();
                                break;
                            case 2:
                                //EliminarContacto();
                                break;
                            case 3:
                                //MostrarContactos();
                                break;
                            case 4:
                                HacerOperaciones();
                                break;
                            case 5:
                                MostrarEjemplos();
                                break;
                            case 6:
                                x = false;
                        }
                    /*} else if (i == (Opciones.length)-1 && Opciones[i] != OpcionUsuario) {
                        System.out.println("Esa no es una opcion");
                    }*/
                    }
                }
            /*} catch (Exception InputMismatchException) {
                System.out.println("Esa no es una opcion");
            }*/
            }
        }
    }