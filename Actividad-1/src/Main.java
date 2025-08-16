import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList Secuencial = new LinkedList();
    static LinkedList Doble = new LinkedList();
    static LinkedList Circular = new LinkedList();

    public static int AgregarContacto(int times) throws IOException {
        //try {
            System.out.println("Introduzca los siguientes elementos para agregar el contacto:");
            System.out.print("Nombre:");
            String NombreContacto = input.readLine();
            System.out.print("Direccion:");
            String DireccionContacto = input.readLine();
            System.out.print("Numero Telefonico:");
            int NumeroTelefonico = Integer.parseInt(input.readLine());
            if (times == 0) {
                Secuencial.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
                Doble.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
                Circular.setFirstNode(new Node<>(new Contacto(NombreContacto, DireccionContacto, NumeroTelefonico)));
            } else {
                Secuencial.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
                Doble.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
                Circular.InsertContact(new Contacto(NombreContacto,DireccionContacto,NumeroTelefonico));
            }
        /*} catch (Exception NumberFormatException){
            System.out.println("El numero telefonico es muy largo ingrese solo 9 digitos");
        }*/
        times++;
        return times;
    }
    public static void HacerOperaciones(){}
    public static void EliminarElementos(){}
    public static void MostrarContactos(){
        System.out.print(Contacto.toString(Secuencial.firstNode));
    }
    public static void main(String[] args) throws IOException {
        boolean x = true;
        int[] Opciones = {1,2,3,4,5};
        int Times = 0;
        LinkedList Secuencial = new LinkedList();
        LinkedList Doble = new LinkedList();
        LinkedList Circular = new LinkedList();
        while(x) {
            System.out.println("*----------* Menu *------------*");
            System.out.println("| 1.- Agregar Contacto         |");
            System.out.println("| 2.- Eliminar Contacto        |");
            System.out.println("| 3.- Mostrar Contactos        |");
            System.out.println("| 4.- Mostrar Ejemplos         |");
            System.out.println("| 5.- Quit                     |");
            System.out.println("*------------------------------*");
            System.out.print("Elija una Opcion:");
            ///try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                System.out.println(OpcionUsuario);
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                Times = AgregarContacto(Times);
                                break;
                            case 2:
                                //EliminarContacto();
                                break;
                            case 3:
                                MostrarContactos();
                                break;
                            case 4:
                                DataTypeExamples.MostrarEjemplos();
                                break;
                            case 5:
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