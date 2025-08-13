import java.util.ArrayList;

public class Almacen {
    ArrayList <Categoria> CollecionDeCategorias;

    public Almacen() {
        this.CollecionDeCategorias = new ArrayList<Categoria>();
    }

    public void setCollecionDeCategorias(String valNombreCategoria) {
        CollecionDeCategorias.add(new Categoria(valNombreCategoria, new ArrayList<Producto>()));
    }

    public void addProductToCategory(String valNombreCategoria, int valID, String valName, double valPrecio, int valStock){
        for (int i = 0; i > this.CollecionDeCategorias.size(); i++ ){
            if (this.CollecionDeCategorias.contains(valNombreCategoria)) {
                this.CollecionDeCategorias.get(i).addProduct(valID,valName,valPrecio,valStock);
            }
        }
    }
}
