package behavioral.chainofresponsibility;

public class Gerencia extends BaseHandler {
    @Override
    protected boolean canHandle(Solicitud solicitud) {
        return true;
    }

    @Override
    protected void process(Solicitud solicitud) {
        System.out.println("[Gerencia] Tomando acción especial para: " + solicitud.getMensaje());
    }
}