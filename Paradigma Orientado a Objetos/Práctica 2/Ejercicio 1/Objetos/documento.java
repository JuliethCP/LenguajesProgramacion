package Objetos;
import java.util.LinkedList;

public class documento {
    private String nombre;
    private LinkedList<hoja> hojas;

    public documento(String nombre) {
        this.nombre = nombre;
        this.hojas = new LinkedList<hoja>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<hoja> getHojas() {
        return hojas;
    }

    public void  addHojas(hoja hoja) {
        this.hojas.add(hoja);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", hojas=" + hojas +
                '}';
    }
}
