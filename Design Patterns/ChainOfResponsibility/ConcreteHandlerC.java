package ChainOfResponsibility;

public class ConcreteHandlerC implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if ("TypeC".equals(request.getRequestType())) {
            System.out.println("Request " + request.getRequestId() + " handled by ConcreteHandlerC");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request " + request.getRequestId() + " could not be handled");
        }
    }
}
