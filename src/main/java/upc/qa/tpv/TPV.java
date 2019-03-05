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
		
		Venta venta = new Venta(new ArrayList<Codigo>());
		
		boolean enabled = true;
		while(enabled) {
			while(sc.hasNextLong()) {
				Codigo code = new Codigo(sc.nextLong());
				System.out.println("Adding code " + code.getCode());
				venta.addCodigo(code);
			}
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				if(line.equals("stop") || line.length() == 1) {
					enabled = false;
					break;
				}
				ventas.add(venta);
				System.out.println("Print ticket");
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
