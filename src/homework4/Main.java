package homework4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE_X = 5;
    static final int SIZE_Y = 5;
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';
    static final char DOT_EMPTY = '*';
    static final int TO_WIN = 4;

    static char[][] map = new char[SIZE_Y][SIZE_X];
    static char HEADER_FIRST_SYMBOLS = '#';
    static final String EMPTY = " ";


    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void initFields() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    public static void printField() {
        System.out.println(HEADER_FIRST_SYMBOLS + EMPTY + " 1 2 3 4 5");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(i + 1 + EMPTY + "|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();

        }
        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        map[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите число: X (от 1 до " + SIZE_X + ")   Y  (от 1 до " + SIZE_Y + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, DOT_HUMAN);
    }


    public static void aiStep() {
        System.out.println("Железяка сделала ход!");
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, DOT_AI);
                    if (checkWin(DOT_AI)) return;
                    setSym(i, j, DOT_EMPTY);
                }
            }

        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, DOT_HUMAN);
                    if (checkWin(DOT_HUMAN)) {
                        setSym(i, j, DOT_AI);
                        return;
                    }
                    setSym(i, j, DOT_EMPTY);
                }
            }

        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, DOT_AI);
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFuelFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (checkLine(i, j, 0, 1, sym)) return true;
                if (checkLine(i, j, 1, 1, sym)) return true;
                if (checkLine(i, j, 1, 0, sym)) return true;
                if (checkLine(i, j, -1, 1, sym)) return true;
            }
        }
        return false;
    }

    private static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_X - 1 || wayY > SIZE_Y - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (map[itemY][itemX] != sym) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        initFields();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Победа!");
                break;
            }
            if (isFuelFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Железяка умнее!");
                break;
            }
            if (isFuelFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }
}
