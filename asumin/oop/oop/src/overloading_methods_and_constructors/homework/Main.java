package overloading_methods_and_constructors.homework;

public class Main {
    public static void main(String[] args) {
      Monster monster1 = new Monster();
      Monster monster2 = new Monster(1, 1, 1);
      Monster monster3 = new Monster(4, 2);

      monster1.voice();
        System.out.println();
      monster2.voice(3);
        System.out.println();
      monster3.voice(5, "Я монстр 3");
    }
}
