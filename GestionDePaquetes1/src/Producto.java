public class Producto {
    public static int ID;
    public static String Nombre;
    public double Precio;
    public int Stock;

    public Producto(int valID, String valName, double valPrecio, int valStock ){
        this.ID = valID;
        this.Nombre = valName;
        this.Precio = valPrecio;
        this.Stock = valStock;
    }

    public static String getNombre() {
        return Nombre;
    }

    public int getStock() {
        return Stock;
    }

    public double getPrecio() {
        return Precio;
    }
}
