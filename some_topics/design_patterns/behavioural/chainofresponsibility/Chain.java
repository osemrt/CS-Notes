package chainofresponsibility;

public interface Chain {

    void nextChain(Chain nextChain);
    void handle(Request request);

}
