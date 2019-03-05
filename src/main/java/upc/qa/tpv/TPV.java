package upc.qa.tpv;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Class representing a selling terminal
 * 
 */
public class TPV {
	private List<Venta> ventas = new ArrayList<Venta>();

	/**
	 *
	 * Gets a list of the TPV's Ventas 
	 * 
	 */
	public List<Venta> getVentas() {
		return ventas;
	}
	
	
	/**
	 *
	 * Adds a Venta to the TPV 
	 * 
	 */
	public void addVenta(Venta venta) {
		this.ventas.add(venta);
	}
}
