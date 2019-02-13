package iterator;

public class IteratorPatternTest {

    public static void main(String[] args) {

        ConcreteIterable concreteIterable = new ConcreteIterable();
        Iterator iterator = concreteIterable.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }


}
