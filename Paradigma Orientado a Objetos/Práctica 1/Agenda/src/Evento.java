

public abstract class Evento {
    private String nombre;
    private String lugar;
    private String fecha;

    public Evento(String nombre, String lugar, String fecha) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }
    
    public abstract void imprimir();

    public String toString() {
        return "|Evento---------------|" + "\n|Nombre=" + nombre + " |" + "\n|Lugar=" + lugar + " |" + "\n|Fecha=" + fecha + " |";
    }

    
    
}