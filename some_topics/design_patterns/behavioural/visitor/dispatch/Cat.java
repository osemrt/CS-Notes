package visitor.dispatch;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void makeSound(Cat cat) {
        System.out.println("Cat interacting with Cat");
    }

    @Override
    public void makeSound(Dog dog) {
        System.out.println("Dog interacting with Dog");
    }

    @Override
    public void makeSound(Animal animal) {
        System.out.println("Animal interacting with Cat");
    }
}
