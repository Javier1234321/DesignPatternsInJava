package behavioral.chainofresponsibility;
public abstract class BaseHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Solicitud solicitud) {
        if (canHandle(solicitud)) {
            process(solicitud);
        } else if (next != null) {
            System.out.println("[" + getClass().getSimpleName() + "] No puedo manejar '"
                    + solicitud.getMensaje() + "'. Pasando al siguiente...");
            next.handle(solicitud);  // ← IMPORTANTE: pasar al siguiente
        } else {
            System.out.println("[" + getClass().getSimpleName() + "] No puedo manejar '"
                    + solicitud.getMensaje() + "' y no hay más manejadores.");
        }
    }

    protected abstract boolean canHandle(Solicitud solicitud);
    protected abstract void process(Solicitud solicitud);
}