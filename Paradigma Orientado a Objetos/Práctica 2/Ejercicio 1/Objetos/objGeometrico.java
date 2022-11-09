package Objetos;

public abstract class objGeometrico implements objRepre{
    private int area;

    public objGeometrico(int area){
        this.area = area;
    }

    public objGeometrico() {
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract void calcularArea();


    @Override
    public abstract void dibujar();
}