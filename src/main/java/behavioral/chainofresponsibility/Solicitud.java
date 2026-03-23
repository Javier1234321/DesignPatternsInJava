package behavioral.chainofresponsibility;

public class Solicitud {
    private String tipo;
    private String mensaje;
    private int gravedad;

    public Solicitud(String tipo, String mensaje, int gravedad) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.gravedad = gravedad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getGravedad() {
        return gravedad;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "tipo='" + tipo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", gravedad=" + gravedad +
                '}';
    }
}