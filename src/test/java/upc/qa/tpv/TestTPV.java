package upc.qa.tpv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestTPV {
	private TPV tpv;

	@Before
	public void before() {
		tpv = new TPV();
	}

	@Test
	public void addVenta() {
		assertEquals(0, tpv.getVentas().size());
		tpv.addVenta(new Venta());
		assertEquals(1, tpv.getVentas().size());
	}
}
