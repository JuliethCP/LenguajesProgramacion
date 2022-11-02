
public class EventoT1 extends Evento {
    private String requisito;
    private String curso;

    public EventoT1(String nombre, String lugar, String fecha, String requisito, String curso) {
        super(nombre, lugar, fecha);
        this.requisito = requisito;
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        System.out.println("EVENTO 1 : " + this.toString());
        EventoT1Frame pantalla = new EventoT1Frame();
        pantalla.jTextFieldlugar.setText(this.getLugar());
        pantalla.jTextFieldfecha.setText(this.getFecha());
        pantalla.jTextFieldrequi.setText(this.requisito);
        pantalla.jTextFieldcurso.setText(this.curso);
        pantalla.setVisible(true);
        
    }

    @Override
    public String toString() {
        return "EventoT1{" + super.toString() + "requisito=" + requisito + ", curso=" + curso + '}';
    }
    
    
}