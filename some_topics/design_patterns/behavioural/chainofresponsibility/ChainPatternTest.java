package chainofresponsibility;

public class ChainPatternTest {
    public static void main(String[] args) {

        Chain chain1 = new Addition();
        Chain chain2 = new Subtraction();
        Chain chain3 = new Multiplication();
        Chain chain4 = new Division();

        Request request = new Request(12,5);

        chain1.nextChain(chain2);
        chain2.nextChain(chain3);
        chain3.nextChain(chain4);

        chain1.handle(request);

    }
}
