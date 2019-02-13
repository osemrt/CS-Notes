package interpreter.application1;

public abstract class Expression {

    public void interpret(Context context){

        if(context.getInput().length()==0){
            return;
        }else if(context.getInput().startsWith(nine())){
            context.setInput(context.getInput().substring(2));
            context.setOutput(context.getOutput() + 9 * multiplier());
        }else if(context.getInput().startsWith(four())){
            context.setInput(context.getInput().substring(2));
            context.setOutput(context.getOutput() + 4 * multiplier());
        }else if(context.getInput().startsWith(five())){
            context.setInput(context.getInput().substring(1));
            context.setOutput(context.getOutput() + 5 * multiplier());
        }

        while(context.getInput().startsWith(one())){
            context.setInput(context.getInput().substring(1));
            context.setOutput(context.getOutput() + 1 * multiplier());
        }

    }

    abstract public String nine();
    abstract public String four();
    abstract public String five();
    abstract public String one();

    abstract public int multiplier();



}
