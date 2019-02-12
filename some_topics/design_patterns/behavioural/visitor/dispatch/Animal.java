package visitor.dispatch;

public interface Animal {

    public void makeSound();
    public void makeSound(Cat cat);
    public void makeSound(Dog dog);
    public void makeSound(Animal animal);

}
