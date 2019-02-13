package interpreter.application1;

public class Hundred extends Expression {
    @Override
    public String nine() {
        return "CM";
    }

    @Override
    public String four() {
        return "CD";
    }

    @Override
    public String five() {
        return "D";
    }

    @Override
    public String one() {
        return "C";
    }

    @Override
    public int multiplier() {
        return 100;
    }
}
