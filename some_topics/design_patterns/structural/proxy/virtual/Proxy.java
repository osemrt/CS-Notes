package proxy.virtual;

public class Proxy implements Displayable {

    private final String filename;
    private Image image;

    public Proxy(String filename) {
        this.filename = filename;
        image = new Image(this.filename);
    }


    @Override
    public void display() {
        if(image==null){
            image = new Image(this.filename);
        }

        image.display();

    }

    @Override
    public void rotateImage(double degree) {
        if(image == null){
            image = new Image(this.filename);
        }

        image.rotateImage(degree);
    }

    @Override
    public void resizeImage(int width, int height) {
        if(image == null){
            image = new Image(this.filename);
        }

        image.resizeImage(width, height);

    }
}
