package proxy.virtual;

public class ProxyPatternTest {

    public static void main(String[] args) {

        Proxy proxy = new Proxy("test.jpg");
        proxy.display();
        proxy.resizeImage(255,255);
        proxy.rotateImage(90);


    }

}
