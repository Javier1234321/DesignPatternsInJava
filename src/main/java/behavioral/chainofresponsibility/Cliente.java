package behavioral.chainofresponsibility;

public class Cliente {
    public static void main(String[] args) {
        // Crear manejadores
        Handler basico = new SoporteBasico();
        Handler tecnico = new SoporteTecnico();
        Handler gerencia = new Gerencia();

        // Armar la cadena (tal como indica tu diagrama)
        basico.setNext(tecnico);
        tecnico.setNext(gerencia);

        // Crear solicitudes
        Solicitud s1 = new Solicitud("contraseña", "Olvidé mi contraseña", 1);
        Solicitud s2 = new Solicitud("red", "La red está lenta", 3);
        Solicitud s3 = new Solicitud("sistema", "El servidor principal cayó", 7);
        Solicitud s4 = new Solicitud("bug", "Error crítico en producción", 9);

        // Procesar solicitudes (solo se llama al primero)
        System.out.println("=== Procesando solicitudes ===\n");
        basico.handle(s1);
        System.out.println();
        basico.handle(s2);
        System.out.println();
        basico.handle(s3);
        System.out.println();
        basico.handle(s4);
    }
}
