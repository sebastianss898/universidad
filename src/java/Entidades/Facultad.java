
package Entidades;


public class Facultad {
    
    private int codfacultad;
    private String descripcion;

    public Facultad() {
    }

    public Facultad(int codfacultad, String descripcion) {
        this.codfacultad = codfacultad;
        this.descripcion = descripcion;
    }

    public int getCodfacultad() {
        return codfacultad;
    }

    public void setCodfacultad(int codfacultad) {
        this.codfacultad = codfacultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
