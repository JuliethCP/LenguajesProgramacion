package Objetos;
import java.util.LinkedList;

public class hoja {
    private String dimensiones;
    private LinkedList<objRepre> objetos;

    public hoja(String dimensiones) {
        this.dimensiones = dimensiones;
        this.objetos = new LinkedList<objRepre>();
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void addObjetos(objRepre objeto) {
        this.objetos.add(objeto);
    }

    @Override
    public String toString() {
        return "Hoja{" +
                "dimensiones='" + dimensiones + '\'' +
                ", objetos=" + objetos +
                '}';
    }

}
