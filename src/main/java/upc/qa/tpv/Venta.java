package upc.qa.tpv;

import java.util.List;


public class Venta {
    private List<Codigo> codes;

    public Venta(List<Codigo> codes) {
        this.codes = codes;
    }

    public void addCodigo(Codigo code){
        codes.add(code);
    }
}



