package objectsasparametersandreturningobjects;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = box1.increase();

        box1.showVolume();
        box2.showVolume();
    }
}
