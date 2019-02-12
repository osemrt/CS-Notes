package templatemethod;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {

        Template template1 = new NetOrder();
        template1.order(true);

        System.out.println("------------------");

        Template template2 = new StoreOrder();
        template2.order(false);




    }

}
