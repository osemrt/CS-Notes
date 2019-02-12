package visitor.dispatch;

public class Runner {

    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        //single dispatch
            cat.makeSound();
            dog.makeSound();

        //double dispatch
            //java and c++ does not support the multiple dispatch
            //cat.makeSound(dog);
            //dog.makeSound(cat);

        //double dispatch fails!
            cat.makeSound(dog);
            dog.makeSound(cat);

    }

}
