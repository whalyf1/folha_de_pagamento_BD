package br.pro.bob.model;
import java.util.ArrayList;

public class Ps {
    private Integer id;
    private String sigla;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    
    ArrayList piso = new ArrayList<>();{
        piso.add("A1");
        piso.add("A2");
        piso.add("A3");
        piso.add("A4");
        
}
}
