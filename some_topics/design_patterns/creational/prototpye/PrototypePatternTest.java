package prototpye;

public class PrototypePatternTest {

    public static void main(String[] args) {


        CloneFactory cloneFactory = new CloneFactory();

        Sheep sheep1 = new Sheep();
        sheep1.setSheepName("Sally");
        Sheep sheep2 = (Sheep) cloneFactory.getClone(sheep1);
        sheep1.setSheepName("Lisa");

        System.out.println(sheep1);
        System.out.println(sheep2);



    }

}
