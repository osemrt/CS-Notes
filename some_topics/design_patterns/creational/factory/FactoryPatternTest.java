package factory;

public class FactoryPatternTest {

    /*
    *   Benefits of Factory Pattern
    *   > Abstraction
    *   > Loosely coupled code
    *   > Removes the burden from client to factory
    *   > Easy to extend
    *
    *   JDK Examples
    *   > Calender class createCalender() method
    *   > NumberFormat class getInstance() method
    *
    * */

    public static void main(String[] args) {

        Animal animal;

        animal = AnimalFactory.createAnimal(AnimalType.Dog);
        animal.eat();

        animal = AnimalFactory.createAnimal(AnimalType.Cat);
        animal.eat();

        animal = AnimalFactory.createAnimal(AnimalType.Fox);
        animal.eat();




    }

}
