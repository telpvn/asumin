package objectsasparametersandreturningobjects;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(15, 20, 25);

        int result = box.compare(box2);

        switch (result) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 0:
                System.out.println("Коробки равны");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
        }
    }
}
