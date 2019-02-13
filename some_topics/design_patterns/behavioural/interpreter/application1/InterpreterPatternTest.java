package interpreter.application1;

import java.util.ArrayList;

public class InterpreterPatternTest {

    public static void main(String[] args) {

        convertToDecimal("CXXVIII");
        convertToDecimal("XXXVIII");
        convertToDecimal("LXXXVIII");
        convertToDecimal("DCCC");
        convertToDecimal("LXIII");

    }

    private static void convertToDecimal(String romanNumber) {

        Context context = new Context(romanNumber);

        ArrayList<Expression> expressions = new ArrayList<>();

        expressions.add(new Hundred());
        expressions.add(new Ten());
        expressions.add(new One());

        for(Expression expression : expressions){

            expression.interpret(context);

        }

        System.out.println(context.getOutput());
    }

}
