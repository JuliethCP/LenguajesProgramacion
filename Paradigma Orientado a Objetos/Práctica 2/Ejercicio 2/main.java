
import Clases.*;

public class main {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca TEC San Carlos");

        biblioteca.addLibro(new Libro(10001, "El diario de Ana Frank", "Ana Frank", false));
        biblioteca.addLibro(new Libro(10002, "Ciencias naturales", "Mi amigo el biólogo", false));
        biblioteca.addLibro(new Libro(10003, "Cálculo y álgebra lineal", "Definitivamente yo no", true));
        biblioteca.addLibro(new Libro(10004, "Salud Mental", "¿Que es eso?", true));

        biblioteca.addSocio(new Socio(101, "Julieth Campos", "Valle Azul San Ramón", 4));
        biblioteca.addSocio(new Socio(102, "Yerlin Perez", "Valle Azul San Ramón", 1));
        biblioteca.addSocio(new Socio(103, "Carlos Marin", "Rio Cuarto", 8));  
        biblioteca.addSocio(new Socio(104, "Juana Vargas", "Upala", 5));

        biblioteca.addPrestamo(new Prestamo(1, 10001, 101)); 
        biblioteca.addPrestamo(new Prestamo(2, 10002, 102)); 
        biblioteca.addPrestamo(new Prestamo(2, 10003, 1008)); //no existe socio con ese id
        biblioteca.addPrestamo(new Prestamo(3, 10504, 103)); //no existe libro con ese codigo

        System.out.println("---------INFORMACION GENERAL DE LA BIBLIOTECA---------");
        System.out.println(biblioteca.toString());
        
        System.out.println("---------Socios con el maximo de libros prestados---------");
        System.out.println(biblioteca.socioMaxLibros());
        
    }
}
