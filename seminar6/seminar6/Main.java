package seminar6.seminar6;

public class Main {
    public static void main(String[] args) {
        Cat luna = new Cat("Луна", "кошка", 1, 5, "мраморная");
        System.out.println(luna.toString());
        luna.setColor("Рыжий");
        luna.setWeight(6);
        System.out.println(luna.toString());
        luna.vac();
        System.out.println(luna.toString());
        luna.vac();
        luna.meow(5);
        luna.meow();
    }
}
