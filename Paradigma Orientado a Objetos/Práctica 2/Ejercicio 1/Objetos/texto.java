package Objetos;

public class texto implements objRepre{
    private String texto;

    public texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void dibujar() {
        System.out.println("Texto escrito: " + getTexto());
    }

    @Override
    public String toString() {
        return "Texto{" +
                "texto='" + texto + '\'' +
                '}';
    }
}
