package homework3;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{15, 15}));
        System.out.println(checkBalance(new int[]{1, 2, 7, 5, 3, 4, 7, 1}));
        System.out.println(checkBalance(new int[]{5, 1, 3, 2, 2}));
    }
    public static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
