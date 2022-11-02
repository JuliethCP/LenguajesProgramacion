public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private boolean genero; //true = mujer; false = hombre

    public Persona(int id, String nombre, int edad, boolean genero) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
