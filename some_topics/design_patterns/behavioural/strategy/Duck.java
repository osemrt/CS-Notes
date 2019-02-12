package strategy;

public class Duck {


    private final Displayable displayable;
    private final Flyable flyable;
    private final Quackable quackable;

    public Duck(Displayable displayable, Flyable flyable, Quackable quackable){
        this.displayable = displayable;
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void display(){
        displayable.display();
    }

    public void fly(){
        flyable.fly();
    }

    public void quack(){
        quackable.quack();
    }



}
