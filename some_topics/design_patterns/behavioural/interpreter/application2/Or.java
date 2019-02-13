package interpreter.application2;

public class Or implements Expression {

    private final Expression expression1;
    private final Expression expression2;

    public Or(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(Context context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
