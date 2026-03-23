package behavioral.chainofresponsibility;

public class SoporteTecnico extends BaseHandler {
    @Override
    protected boolean canHandle(Solicitud solicitud) {
        return solicitud.getGravedad() <= 5;
    }

    @Override
    protected void process(Solicitud solicitud) {
        System.out.println("[Soporte Técnico] Resolviendo: " + solicitud.getMensaje());
    }
}

