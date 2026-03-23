package behavioral.chainofresponsibility;

public class SoporteBasico extends BaseHandler {
    @Override
    protected boolean canHandle(Solicitud solicitud) {
        return solicitud.getGravedad() <= 2;
    }

    @Override
    protected void process(Solicitud solicitud) {
        System.out.println("[Soporte Básico] Resolviendo: " + solicitud.getMensaje());
    }
}