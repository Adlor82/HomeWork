package homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Василий");
        Dog dog = new Dog("Нелли");

        System.out.println();

        dog.run(500);
        dog.swim(10);

        System.out.println();

        cat.run(200);
        cat.swim(0);
    }
}
