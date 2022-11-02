public class ContactoT2 extends Contacto{
    private String facebook;
    private String telegram;

    public ContactoT2(Persona persona, String direccion, String telefono, String facebook, String telegram) {
        super(persona, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    public ContactoT2(int id, String nombre, int edad, boolean genero, String direccion, String telefono, String facebook, String telegram) {
        super(id, nombre, edad, genero, direccion, telefono);
        this.facebook = facebook;
        this.telegram = telegram;
    }

    @Override
    public void imprimir() {
        System.out.println("CONTACTO2 : " + this.toString());
        ContactoT2Frame pantalla = new ContactoT2Frame();
        pantalla.jTextFieldid.setText(String.valueOf(this.getPersona().getId()));
        pantalla.jTextFieldnombre.setText(this.getPersona().getNombre());
        pantalla.jTextFieldedad.setText(String.valueOf(this.getPersona().getEdad()));
        pantalla.jTextFieldgenero.setText(String.valueOf(this.getPersona().getGenero()));
        pantalla.jTextFielddireccion.setText(this.getDireccion());
        pantalla.jTextFieldfacebook.setText(this.facebook);
        pantalla.jTextFieldtelegram.setText(this.telegram);
        pantalla.setVisible(true);
     }

    @Override
    public String toString() {
        return "ContactoT2{" +
                "facebook='" + facebook + '\'' +
                ", telegram='" + telegram + '\'' +
                "} " + super.toString();
    }
}
