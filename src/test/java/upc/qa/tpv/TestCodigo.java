package upc.qa.tpv;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCodigo {

    long codeExample = 878787665;
    Codigo codigo;
    @Before
    public void init(){
        codigo = new Codigo(codeExample);
    }

    @Test
    public void testGetCode(){
        assertEquals(codeExample, codigo.getCode());
    }


}
