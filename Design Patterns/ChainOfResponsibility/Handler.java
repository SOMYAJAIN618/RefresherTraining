package ChainOfResponsibility;


public interface Handler {
    void setNextHandler(Handler handler);
    void handleRequest(Request request);
}
