package iterator;

public class ConcreteIterator implements Iterator {

    private final ConcreteIterable concreteIterable;
    private final int sizeOfConcreteIterable;
    private int currentIndex = -1;

    public ConcreteIterator(ConcreteIterable concreteIterable) {
        this.concreteIterable = concreteIterable;
        this.sizeOfConcreteIterable = concreteIterable.size();
    }

    @Override
    public String next() {
        currentIndex++;
        return this.concreteIterable.getStringAtIndex(currentIndex);
    }

    @Override
    public String first() {
        return this.concreteIterable.getStringAtIndex(0);
    }

    @Override
    public boolean hasNext() {
        return currentIndex + 1 < sizeOfConcreteIterable;
    }
}
