package homework2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(taskOne(4, 11));
        taskTwo(7);
        System.out.println(taskTree(6));
        taskFour("Вася", 3);
        System.out.println(taskFive(2022));
    }

    public static boolean taskOne(int a, int b) {
        System.out.println("Задание 1");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void taskTwo(int a) {
        System.out.println("Задание 2");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean taskTree(int a) {
        System.out.println("Задание 3");
        if (a < 0) return true;
        return false;
    }

    public static void taskFour(String name, int a) {
        System.out.println("Задание 4");
        for (int i = 1; i <= a; i++) {
            System.out.println("[" + i + "]" + " " + name);
        }
    }

    public static boolean taskFive(int year) {
        System.out.println("Задание 5");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
