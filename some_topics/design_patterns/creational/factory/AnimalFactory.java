package factory;

public class AnimalFactory {

    static Animal createAnimal(AnimalType animalType){


            Animal animal;

            switch (animalType){

                case Dog :
                    animal = new Dog();
                    break;
                case Cat :
                    animal = new Cat();
                    break;
                case Fox :
                    animal = new Fox();
                    break;
                default:
                     animal = null;
            }

            return animal;


    }

}
