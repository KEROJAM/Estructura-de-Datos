import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        boolean x = true;
        Almacen Almacen1 = new Almacen();
        Almacen1.setCollecionDeCategorias("Electronica");
        Almacen1.setCollecionDeCategorias("Comida");
        while(x) {
            System.out.print("Estas son las dos categorias que tenemos: ");
            for (int i = 0; i < Almacen1.CollecionDeCategorias.size(); i++) {
                System.out.print(Almacen1.CollecionDeCategorias.get(i).NombreCategoria);
                if (i == 0) {
                    System.out.print(", ");
                } else {

                }
            }
            int i = 0;
            int o = 0;
            for (int u = 0; u < Almacen1.CollecionDeCategorias.get(i).CollecionDeProductos.size() && u < Almacen1.CollecionDeCategorias.get(o).CollecionDeProductos.size(); u++) {
                if (i == o) {
                    System.out.print(Almacen1.CollecionDeCategorias.get(0).CollecionDeProductos.get(i).getNombre() + ",");
                    i++;
                } else {
                    System.out.print(Almacen1.CollecionDeCategorias.get(1).CollecionDeProductos.get(o).getNombre());
                    o++;
                }
            }
            String NombreCategoria;
            System.out.println("\nA cual categoria quisiera agregar el producto?");
            NombreCategoria = input.readLine();
            for (int p = 0; p < Almacen1.CollecionDeCategorias.size(); p++) {
                if (Almacen1.CollecionDeCategorias.get(p).NombreCategoria.contains(NombreCategoria)) {
                    System.out.println("Introduzca las siguientes propiedades del producto:");
                    System.out.print("ID: ");
                    int IDProd = Integer.parseInt(input.readLine());
                    System.out.print("Nombre: ");
                    String NombreProd = input.readLine();
                    System.out.print("Precio: ");
                    double PrecioProd = Double.parseDouble(input.readLine());
                    System.out.print("Stock: ");
                    int StockProd = Integer.parseInt(input.readLine());
                    Almacen1.addProductToCategory(NombreCategoria, IDProd, NombreProd, PrecioProd, StockProd);
                    System.out.println("Producto Agregado!");
                }
            }
        }
    }
}