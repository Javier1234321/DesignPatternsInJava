package behavioral.chainofresponsibility;

public interface Handler {
    void setNext(Handler handler);
    void handle(Solicitud solicitud);
}
