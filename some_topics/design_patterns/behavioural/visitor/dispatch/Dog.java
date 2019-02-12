package visitor.dispatch;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void makeSound(Cat cat) {
        System.out.println("Dog interacting with Cat");
    }

    @Override
    public void makeSound(Dog dog) {
        System.out.println("Dog interacting with Dog");
    }

    @Override
    public void makeSound(Animal animal) {
        System.out.println("Animal interacting with Dog");
    }
}
