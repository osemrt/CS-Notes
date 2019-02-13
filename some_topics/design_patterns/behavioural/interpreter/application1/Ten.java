package interpreter.application1;

public class Ten extends Expression {
    @Override
    public String nine() {
        return "XC";
    }

    @Override
    public String four() {
        return "XL";
    }

    @Override
    public String five() {
        return "L";
    }

    @Override
    public String one() {
        return "X";
    }

    @Override
    public int multiplier() {
        return 10;
    }
}
