package chainofresponsibility;

public class Addition implements Chain {
    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getNum1() + " + " + request.getNum2() + " = " + (request.getNum1() + request.getNum2()));
        if(nextChain!=null){
            nextChain.handle(request);
        }

    }
}
