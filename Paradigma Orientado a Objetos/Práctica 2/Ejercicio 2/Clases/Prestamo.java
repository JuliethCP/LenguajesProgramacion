package Clases;

public class Prestamo {
    private int idPrestamo;
    private int codigoLibro;
    private int idSocio;

    public Prestamo(int idPrestamo, int codigoLibro, int idSocio) {
        this.idPrestamo = idPrestamo;
        this.codigoLibro = codigoLibro;
        this.idSocio = idSocio;
    }

    public int getIdPrestamos() {
        return idPrestamo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public int getIdSocio() {
        return idSocio;
    }

    @Override
    public String toString() {
        return "Préstamo{" +
                "idPrestamo = " + idPrestamo +
                ", codigoLibro = " + codigoLibro +
                ", idSocio = " + idSocio +
                '}';
    }
}
