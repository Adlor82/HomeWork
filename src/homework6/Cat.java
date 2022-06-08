package homework6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.type = "Кот";
        this.maxRun = random.nextInt(200);
    }
    @Override
    public void swim(int dist) {
        System.out.println(this.type + " " + this.name + " не умеет плавать.");
    }
}
