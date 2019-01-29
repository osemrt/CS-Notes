public class ObserverPatternTest {


    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setCustomerName("ose");

        Customer customer2 = new Customer();
        customer2.setCustomerName("megan");

        Product iphoneX = new Product();
        iphoneX.setProductName("Apple Iphone X");
        iphoneX.setAvailable(false);

        iphoneX.registerObserver(customer1);
        iphoneX.registerObserver(customer2);

        // After few days iphoneX becomes available.

        iphoneX.setAvailable(true);



    }


}
