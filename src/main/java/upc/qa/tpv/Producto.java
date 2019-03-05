package upc.qa.tpv;

import java.util.HashMap;

public class Producto {
	private static HashMap<Long, String> productos = new HashMap<>();
	
	static {
		productos.put(1l, "Manzana");
		productos.put(2l, "Leche");
		productos.put(3l, "Pan");
		productos.put(4l, "Patatas");
		productos.put(5l, "Queso");
	}
	
    //product tiene precio, codigo y una descripcion

    private String descripcion;
    private double precio;
    private Codigo codigo;

    public Producto(Codigo codigo) {
        this.descripcion = productos.get(codigo.getCode());
        this.precio = 1.00;
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
