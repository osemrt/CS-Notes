package interpreter.application2;

public class InterpreterPatternTest {

    public static void main(String[] args) {

        Context context1 = new Context("Eric");
        Context context2 = new Context("Megan");
        Context context3 = new Context("Osemrt");
        Context context4 = new Context("Joe");

        Expression terminalExpression1 = new Terminal(context1);
        Expression terminalExpression2 = new Terminal(context2);
        Expression terminalExpression3 = new Terminal(context3);
        Expression terminalExpression4 = new Terminal(context4);

        //Eric or Megan
        Expression comExpression1 = new Or(terminalExpression1, terminalExpression2);
        //Osemrt and Joe
        Expression comExpression2 = new And(terminalExpression3, terminalExpression4 );
        //(Eric or Megan) and (Osemrt and Joe)
        Expression comExpression3 = new And(comExpression1, comExpression2);

        Context context5 = new Context("Joe Osemrt");
        System.out.println(comExpression3.interpret(context5));

        Context context6 = new Context("Eric Joe Osemrt");
        System.out.println(comExpression3.interpret(context6));

        Context context7 = new Context("Megan");
        System.out.println(comExpression3.interpret(context7));

        Context context8 = new Context("Osemrt Joe Megan");
        System.out.println(comExpression3.interpret(context8));


    }

}
