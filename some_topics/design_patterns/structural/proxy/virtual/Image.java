package proxy.virtual;

public class Image implements Displayable {

    private final String filename;

    public Image(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename + "...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void rotateImage(double degree) {
        System.out.println("The image was rotated by " + degree);
    }

    @Override
    public void resizeImage(int width, int height) {
        System.out.println("The new image sizes are width: " + width + " height: " + height);
    }
}
