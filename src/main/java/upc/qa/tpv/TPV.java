package upc.qa.tpv;

import java.util.ArrayList;
import java.util.List;

public class TPV {
	private List<Venta> ventas = new ArrayList<Venta>();

	public List<Venta> getVentas() {
		return ventas;
	}
	
	public void addVenta(Venta venta) {
		this.ventas.add(venta);
	}
}
