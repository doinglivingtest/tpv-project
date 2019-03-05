package upc.qa.tpv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTPV {
	private TPV tpv = new TPV();
	
	@Test
	public void addVenta() {
		tpv.addVenta(new Venta());
		assertEquals(1, tpv.getVentas().size());
	}
}
