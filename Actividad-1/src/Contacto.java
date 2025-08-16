public class Contacto {
    public String Nombre;
    public String Direccion;
    public int NumeroTel;
    public Contacto(String valNombre, String valDireccion, int valNumeroTel){
        this.Nombre = valNombre;
        this.Direccion = valDireccion;
        this.NumeroTel = valNumeroTel;
    }

    @Override
    public String toString() {
        return "| Nombre:" + Nombre + "\n| Direccion:" + Direccion + "\n| Numero Telefonico:" + NumeroTel;
    }
}
