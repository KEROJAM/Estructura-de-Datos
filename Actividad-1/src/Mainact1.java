import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainact1 {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static LinkedList Secuencial = new LinkedList();
    static LinkedList Doble = new LinkedList();
    static LinkedList Circular = new LinkedList();

    public static void main(String[] args) throws IOException {
        boolean x = true;
        int[] Opciones = {1,2,3,4,5,6,7};
        int Times = 0;
        LinkedList Secuencial = new LinkedList();
        LinkedList Doble = new LinkedList();
        LinkedList Circular = new LinkedList();
        while(x) {
            System.out.println("*----------* Menu *------------*");
            System.out.println("| 1.- Ejecutar Comando         |");
            System.out.println("| 2.- Agregar Proceso          |");
            System.out.println("| 3.- Procesar Comando         |");
            System.out.println("| 4.- Realizar Procesos        |");
            System.out.println("| 5.- Mostrar Historial        |");
            System.out.println("| 6.- Mostrar Ejecucion        |");
            System.out.println("| 7.- Quit                     |");
            System.out.println("*------------------------------*");
            System.out.print("| Elija una Opcion:");
            //try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
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