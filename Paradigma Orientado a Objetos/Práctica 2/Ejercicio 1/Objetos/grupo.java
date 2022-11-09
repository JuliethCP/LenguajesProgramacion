package Objetos;
import java.util.LinkedList;

public class grupo implements objRepre {
    private LinkedList<objRepre> objetos;

    public grupo() {
        super();
        this.objetos = new LinkedList<objRepre>();
    }

    public LinkedList<objRepre> getObjetos() {
        return objetos;
    }

    public void addObjetos(objRepre objeto) {
        this.objetos.add(objeto);
    }

    @Override
    public void dibujar() {
        System.out.println("Este grupo de objetos representables tiene:");
        System.out.println(getObjetos());
        
    }
    @Override
    public String toString() {
        return "Grupo{" +
                "objetos=" + objetos +
                '}';
    }
    
}
