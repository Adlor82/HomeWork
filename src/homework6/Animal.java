package homework6;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    public Random random = new Random();

    public Animal(String name) {
        this.name = name;
    }

    public void run(int dist) {
        System.out.println(this.type + " " + this.name + " пробежал " + this.maxRun + " м.");

    }

    public void swim(int dist) {
        System.out.println(this.type + " " + this.name + " проплыл " + this.maxSwim + " м.");

    }
}
