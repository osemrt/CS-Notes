package chainofresponsibility;

public class Request {

    private final int num1;
    private final int num2;

    public Request(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
