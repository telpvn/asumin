package Introduction.homework;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Валера";
        human1.old = 57;
        human1.weight = 80.0;

        Human human2 = new Human();
        human2.name = "Антон";
        human2.old = 26;
        human2.weight = 90.0;

        Human human3 = new Human();
        human3.name = "Надя";
        human3.old = 56;
        human3.weight = 53;


        Human human4 = new Human();
        human4.name = "Ира";
        human4.old = 66;
        human4.weight = 77;

        Human human5 = new Human();
        human5.name = "Сергей";
        human5.old = 66;
        human5.weight = 75;

        System.out.println("Средний возраст " + (human1.old + human2.old + human3.old + human4.old + human5.old) / 5);
    }
}
