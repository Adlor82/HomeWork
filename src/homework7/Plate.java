package homework7;

public class Plate {
    public int food;

    int getFood() {
        return food;
    }

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 250;
        System.out.println("В тарелку добавили 150 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
