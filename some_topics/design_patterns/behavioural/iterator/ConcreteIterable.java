package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterable implements Iterable {


    List<String> strings;

    public ConcreteIterable() {

        strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");

    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return strings.size();
    }

    public String getStringAtIndex(int currentIndex) {
        return strings.get(currentIndex);
    }
}
