package upc.qa.tpv;

import java.util.ArrayList;
import java.util.List;


public class Venta {
    private List<Codigo> codes = new ArrayList<Codigo>();

    public Venta() {
        this.codes = codes;
    }

    public void addCodigo(Codigo code){
        codes.add(code);
    }

    public List<Codigo> returnVentas(){
        return codes;
    }
}



