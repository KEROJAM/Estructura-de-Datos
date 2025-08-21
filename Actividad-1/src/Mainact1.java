import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainact1 {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static Stack<Object> Commandos = new Stack<>();
    public static Queue<Object> Procesos = new Queue<>();
    /**
     * Punto de entrada del programa. Muestra el menú y despacha cada opción
     * llamando a los métodos de {@link Stack} y {@link Queue} correspondientes.
     */
    public static void main(String[] args) throws Exception {
        boolean x = true;
        int[] Opciones = {1,2,3,4,5,6,7};
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
            try {
                int OpcionUsuario = Integer.parseInt(input.readLine());
                for (int i = 0; i < Opciones.length; i++) {
                    if (Opciones[i] == OpcionUsuario) {
                        switch (OpcionUsuario) {
                            case 1:
                                Commandos.push();
                                break;
                            case 2:
                                Procesos.enqueue();
                                break;
                            case 3:
                                Commandos.pop();
                                break;
                            case 4:
                                Procesos.dequeue();
                                break;
                            case 5:
                                Commandos.commands.printList("<--");
                                break;
                            case 6:
                                Procesos.processes.printList("-->");
                                break;
                            case 7:
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