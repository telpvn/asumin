package overloading_methods_and_constructors.homework;

public class Monster {
    int eyes;
    int legs;
    int hands;

    public Monster() {
        this.eyes = 2;
        this.legs = 2;
        this.hands = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
        this.legs = 2;
        this.hands = 2;
    }

    public Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = 2;
    }

    public Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Голос");
        }
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
