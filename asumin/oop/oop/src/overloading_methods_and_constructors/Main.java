package overloading_methods_and_constructors;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(15, 20, 25);
        box.showVolume();
        box2.showVolume();
        Box box3 = new Box();
        box3.showVolume();
    }
}
