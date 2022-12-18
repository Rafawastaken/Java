package OOP.example_1;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("samsung a13", 8, 128);
        System.out.println(samsung.getName());

        samsung.play_music("Master of puppets");

        Phone xiaomi = new Phone("XIaomi redmi note 10 pro", 128);
        System.out.println(xiaomi.getName());
    }
}
 