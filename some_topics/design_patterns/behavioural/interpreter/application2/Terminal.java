package interpreter.application2;

import java.util.StringTokenizer;

public class Terminal implements Expression {

    private final Context literal;

    public Terminal(Context literal) {
        this.literal = literal;
    }

    @Override
    public boolean interpret(Context context) {

        StringTokenizer stringTokenizer = new StringTokenizer(context.getContext());

        while (stringTokenizer.hasMoreTokens()){
            if(literal.getContext().equalsIgnoreCase(stringTokenizer.nextToken())){
                return true;
            }
        }

        return false;

    }
}
