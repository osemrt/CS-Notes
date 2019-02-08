package singleton;

public class SingletonPatterTest {

    public static void main(String[] args) {

        //You cannot create an instance of the singleton class in this way anymore.
            //Singleton singleton = new Singleton(); ->


        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);


    }

}
