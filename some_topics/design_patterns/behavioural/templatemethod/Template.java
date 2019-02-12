package templatemethod;

public abstract class Template {

    public abstract void deliver();
    public abstract void pay();
    public abstract void select();

    public final void wrap(){
        System.out.println("The gift was wrapped successfully.");
    }

    public final void order(boolean isGift){

        select();
        pay();
        if(isGift){
            wrap();
        }
        deliver();

    }


}
