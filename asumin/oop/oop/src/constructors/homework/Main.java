package constructors.homework;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван", "Программист", 50000);
        String info = employee.getInfo(12);
        System.out.println(info);
    }
}
