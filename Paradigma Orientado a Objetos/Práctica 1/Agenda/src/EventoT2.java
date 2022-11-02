public class EventoT2 extends Evento{
    private int numInvitados;
    private String platillo;

    public EventoT2(String nombre, String lugar, String fecha, int numInvitados, String platillo) {
        super(nombre, lugar, fecha);
        this.numInvitados = numInvitados;
        this.platillo = platillo;
    }

    public int getNumInvitados() {
        return numInvitados;
    }

    public String getPlatillo() {
        return platillo;
    }

    @Override
    public void imprimir() {
         System.out.println("EVENTO 2 : " + this.toString());
        EventoT2Frame pantalla = new EventoT2Frame();
        pantalla.jTextFieldlugar.setText(this.getLugar());
        pantalla.jTextFieldfecha.setText(this.getFecha());
        pantalla.jTextFieldinvitados.setText(String.valueOf(this.numInvitados));
        pantalla.jTextFieldcomida.setText(this.platillo);
        pantalla.setVisible(true);
        
    }

    @Override
    public String toString() {
        return "EventoT2{"+ super.toString() + "Numero de invitados=" + numInvitados + ", Plato=" + platillo + '}';
    }
    
    
    
    
}