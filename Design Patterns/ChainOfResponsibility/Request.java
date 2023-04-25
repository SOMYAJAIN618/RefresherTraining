package ChainOfResponsibility;

public class Request {
    private int requestId;
    private String requestType;

    public Request(int requestId, String requestType) {
        this.requestId = requestId;
        this.requestType = requestType;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getRequestType() {
        return requestType;
    }
}
