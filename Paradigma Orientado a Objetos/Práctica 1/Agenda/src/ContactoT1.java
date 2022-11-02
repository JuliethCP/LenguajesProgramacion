public class ContactoT1 extends Contacto{
    private String correo;

    public ContactoT1(Persona persona, String direccion, String telefono, String correo) {
        super(persona, direccion, telefono);
        this.correo = correo;
    }

    public ContactoT1(int id, String nombre, int edad, boolean genero, String direccion, String telefono, String correo) {
        super(id, nombre, edad, genero, direccion, telefono);
        this.correo = correo;
    }


    @Override
    public void imprimir(){
        System.out.println("CONTACTO1 : " + this.toString());
        ContactoT1Frame pantalla = new ContactoT1Frame();
        pantalla.jTextFieldnombre.setText(this.getPersona().getNombre());
        pantalla.jTextFieldedad.setText(String.valueOf(this.getPersona().getEdad()));
        pantalla.jTextFieldgenero.setText(String.valueOf(this.getPersona().getGenero()));
        pantalla.jTextFielddireccion.setText(this.getDireccion());
        pantalla.jTextFieldtelefono.setText(this.getTelefono());
        pantalla.jTextFieldcorreo.setText(this. correo);
        pantalla.setVisible(true);
    }

    @Override
    public String toString() {
        return "ContactoT1{" +
                super.toString() + '\'' +
                "correo='" + correo + '\'' +
                '}';
    }
}
