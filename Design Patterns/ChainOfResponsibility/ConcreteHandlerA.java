package ChainOfResponsibility;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if ("TypeA".equals(request.getRequestType())) {
            System.out.println("Request " + request.getRequestId() + " handled by ConcreteHandlerA");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request " + request.getRequestId() + " could not be handled");
        }
    }
}

