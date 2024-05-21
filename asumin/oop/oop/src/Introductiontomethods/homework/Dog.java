package Introductiontomethods.homework;

public class Dog {
    String nickname;
    String breed;
    int speed = 5;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ",";
            }
        }
        System.out.println(result);
    }

    String info() {
        return "Кличка " + nickname + "Порода " + breed + "Скорость " + speed;
    }
}
