package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        Request request1 = new Request(1, "TypeA");
        Request request2 = new Request(2, "TypeB");
        Request request3 = new Request(3, "TypeC");
        Request request4 = new Request(4, "TypeD");

        handlerA.handleRequest(request1);
        handlerA.handleRequest(request2);
        handlerA.handleRequest(request3);
        handlerA.handleRequest(request4);
    }
}
