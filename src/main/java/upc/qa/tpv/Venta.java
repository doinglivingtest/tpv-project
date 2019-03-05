package upc.qa.tpv;

import java.util.ArrayList;
import java.util.List;


public class Venta {
    private List<Producto> productos = new ArrayList<Producto>();

    public void addProducto(Producto prod){
        productos.add(prod);
    }

    @Override
    public String toString() {
    	final StringBuffer sb = new StringBuffer();
    	for(Producto prod: productos) {
    		sb.append(prod.toString()+"\n");
    	}
    	return sb.toString();
    }

    public List<Producto> returnVentas(){
        return productos;
    }
    
    public double getTotal() {
    	double price = 0;
    	for(Producto p: productos) {
    		price += p.getPrice();
    	}
    	return price;
    }
}



