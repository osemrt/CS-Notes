public interface Subject {

    abstract public void registerObserver(Observer observer);
    abstract public void removeObserver(Observer observer);
    abstract public void notifyObservers();


}
