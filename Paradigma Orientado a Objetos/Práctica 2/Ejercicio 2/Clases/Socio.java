package Clases;


public class Socio {
    private int idSocio;
    private String nombre;
    private String direccion;
    private int numLibrosPrestados;

    public Socio(int idSocio, String nombre, String direccion, int numLibrosPrestados) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numLibrosPrestados = numLibrosPrestados;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumLibrosPrestados() {
        return numLibrosPrestados;
    }

    public void setNumLibrosPrestados(int numLibrosPrestados) {
        this.numLibrosPrestados = numLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "idSocio = " + idSocio +
                ", nombre = '" + nombre + '\'' +
                ", direccion = '" + direccion + '\'' +
                ", numLibrosPrestados = " + numLibrosPrestados +
                '}';
    }
}
