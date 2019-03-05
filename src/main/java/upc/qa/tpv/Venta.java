package upc.qa.tpv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Venta {
    private List<Codigo> codes = new ArrayList<Codigo>();

    public Venta() {
        this.codes = codes;
    }

    public void addCodigo(Codigo code){
        codes.add(code);
    }
    
    @Override
    public String toString() {
    	final StringBuffer sb = new StringBuffer();
    	for(Codigo code: codes) {
    		sb.append(code.toString()+"\n");
    	}
    	return sb.toString();
    }
}



