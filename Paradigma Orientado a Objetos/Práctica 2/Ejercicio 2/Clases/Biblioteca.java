package Clases;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Socio> socios;
    private ArrayList<Prestamo> prestamos;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.socios = new ArrayList<Socio>();
        this.prestamos = new ArrayList<Prestamo>();
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }

    public void addPrestamo(Prestamo prestamo) {
        for (Socio socio : socios) {
            for (Libro libro : libros) {
                if (socio.getIdSocio() == prestamo.getIdSocio() && libro.getCodigo() == prestamo.getCodigoLibro()) {
                    this.prestamos.add(prestamo);
                    socio.setNumLibrosPrestados(socio.getNumLibrosPrestados() + 1);
                    libro.setDisponibilidad(false);

                    System.out.println("El prestamo se ha realizado correctamente");
                    
                }
            }
        }
    }


    public String socioMaxLibros(){
        int max = 3;
        List<Socio> socios = this.socios.stream()
        .filter(socio -> socio.getNumLibrosPrestados()> max)
        .collect(Collectors.toList());
        
        return socios.toString();
        
   
    }

    @Override
    public String toString(){
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                ", socios=" + socios +
                ", prestamos=" + prestamos +
                '}';
    }
}
