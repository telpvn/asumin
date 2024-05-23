package objectsasparametersandreturningobjects;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(15, 20, 25);

        box2.compare(box2);
    }
}
