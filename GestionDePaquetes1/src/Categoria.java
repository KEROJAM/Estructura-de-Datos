import java.util.ArrayList;

public class Categoria {
    public String NombreCategoria;
    public ArrayList<Producto> CollecionDeProductos;

    public Categoria (String valName, ArrayList<Producto> valCollecionDeProductos){
        this.NombreCategoria = valName;
        this.CollecionDeProductos = valCollecionDeProductos;
    }

    public void setNombreCategoria(String nombreCategoria) {
        NombreCategoria = nombreCategoria;
    }
    public void addProduct(int valID,String valName, double valPrecio, int valStock){
        this.CollecionDeProductos.add(new Producto(valID,valName,valPrecio,valStock));
    }
}
