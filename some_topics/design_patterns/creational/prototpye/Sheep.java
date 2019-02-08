package prototpye;

public class Sheep implements Animal {

    private String sheepName;

    public void setSheepName(String sheepName){
        this.sheepName = sheepName;
    }

    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "sheepName='" + sheepName + '\'' +
                "} @" + this.hashCode();
    }
}
