package homework6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Собака";
        this.maxRun = random.nextInt(500);
        this.maxSwim = random.nextInt(10);
    }
}
