import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {


    private String productName;
    private Boolean available;
    private List<Observer> listOfObservers = new ArrayList<>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
        if(this.available == true){
            notifyObservers();
        }

    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        System.out.println("Notifying all registered customers, when product becomes available.");
        for( Observer observer : listOfObservers ){
            observer.update(productName);
        }

    }
}
