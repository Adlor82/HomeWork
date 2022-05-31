package homework3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        taskOne(arr);
        taskTwo(100);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        taskTree(arr3);
        taskFour();
        taskFive(4,2);
        int[] arr6 = {3, 1, 3, 7, 10, 14, 9, 1, 3, 2, 8, 5};
        taskSix(arr6);
    }
    public static void taskOne(int[] arr) {
        System.out.println("Задание 1");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void taskTwo(int size) {
        System.out.println("\nЗадание 2");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void taskTree(int[] arr) {
        System.out.println("\nЗадание 3");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void taskFour() {
        System.out.println("\nЗадание 4");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void taskFive(int len, int initialValue) {
        System.out.println("Задание 5");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    public static void taskSix( int[] arr){
        System.out.println("\nЗадание 6");
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
