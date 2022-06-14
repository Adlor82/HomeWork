package homework7;

public class Cat {

    public String name;
    public int appetite;
    public int satietyTime;
    public int satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatietyTime() {
        return satietyTime;
    }

    public int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }

}
