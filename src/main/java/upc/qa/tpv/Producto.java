package upc.qa.tpv;

public class Producto {

    //product tiene precio, codigo y una descripcion

    private String descripcion;
    private double precio;
    private Codigo codigo;

    public Producto(String descripcion, double precio, Codigo codigo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
