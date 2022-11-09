package Objetos;

public class cuadrado extends objGeometrico{
    private int lado;

    public cuadrado(int lado) {
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public void calcularArea() {
        setArea(getLado()*getLado());
    }

    @Override
    public void dibujar() {
        System.out.println("Lado del cuadrado: " + getLado());
        System.out.println("Area del cuadrado: " + getArea());
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado = " + lado +
                ", area = " + getArea() +
                '}';
    }
}
