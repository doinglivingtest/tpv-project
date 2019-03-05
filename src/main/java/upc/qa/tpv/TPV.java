package upc.qa.tpv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Class representing a selling terminal
 * 
 */
public class TPV {
	private static List<Venta> ventas = new ArrayList<Venta>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Venta venta = new Venta();
		
		boolean enabled = true;
		while(enabled) {
			System.out.print("Scanning code... ");
			while(sc.hasNextLong()) {
				System.out.println("SUBTOTAL: " + venta.getTotal() + "€");
				Codigo code = new Codigo(sc.nextLong());
				Producto producto = new Producto(code);
				venta.addProducto(producto);
				System.out.println(venta);
				System.out.print("Scanning code... ");
			}
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				ventas.add(venta);
				double total = venta.getTotal();
				System.out.println("VENTA\n" + venta.toString() + "\nTOTAL " + total);
				System.out.print("PAGO METALICO");
				enabled = false;
				break;
			}
		}
		
		sc.close();
	}
	
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
