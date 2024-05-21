package Introductiontomethods.homework;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.nickname = "Шарик";
        dog.breed = "Дворняжка";
        dog.speed = 10;

        dog.run();

        System.out.println();

        System.out.println(dog.info());
    }
}
