package homework7;

public class Main {
    private static int Time = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Вася", 40, 3);
        cat[1] = new Cat("Пушок", 30, 4);
        cat[2] = new Cat("Нуфрик", 25, 2);
        cat[3] = new Cat("Филя", 20, 3);
        Plate plate = new Plate(250);

        System.out.println("У нас есть четыре кота: " + cat[0].getName() + ", " + cat[1].getName() + ", " + cat[2].getName() + " и " + cat[3].getName() + ", они хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + ", " + cat[2].getSatietyTime() +", и " + cat[3].getSatietyTime() + " часа.");
        System.out.println("Кто-то из них ест много, а кто-то мало. Сейчас в тарелке " + plate.getFood() + " грамм кошачьего корма. Посмотрим насколько его хватит, сейчас коты голодны и направляются есть.\n");

        do {
            for (Cat i : cat) {
                if (i.getSatiety() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("\nС момента начала кормежки прошел(ло) " + Time + " час(а). В тарелке осталось " + plate.getFood() + " граммов корма.\n");
            Time++;
        } while (Time <= 12);
    }
}
