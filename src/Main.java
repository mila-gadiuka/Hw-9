import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = IntStream.of(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min / 30 + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max / 30 + " рублей");
    }


    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        double theAverageAmountSpentPerMonth = 0.0000000;
        int daysInAMonth = 30;
        for (int n : arr) {
            sum += n;
        }
        theAverageAmountSpentPerMonth = (double) sum / daysInAMonth;
        System.out.println("Средняя сумма трат за месяц составила " +  theAverageAmountSpentPerMonth + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}