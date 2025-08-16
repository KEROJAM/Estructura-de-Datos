public class Contacto {
    public String Nombre;
    public String Direccion;
    public int NumeroTel;
    public Contacto(String valNombre, String valDireccion, int valNumeroTel){
        this.Nombre = valNombre;
        this.Direccion = valDireccion;
        this.NumeroTel = valNumeroTel;
    }

    public static boolean toString(Node firstNode) {
        return false;
    }
    @Override
    public String toString() {
        return this.Nombre + "\n" + this.Direccion + "\n" + this.NumeroTel;
    }
}
