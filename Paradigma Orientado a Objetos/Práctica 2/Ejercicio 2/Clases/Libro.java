package Clases;

public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro(int codigo, String titulo, String autor, boolean disponibilidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo = " + codigo +
                ", titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", disponibilidad = " + disponibilidad +
                '}';
    }
}
