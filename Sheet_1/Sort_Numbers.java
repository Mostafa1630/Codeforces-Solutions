package Sheet_1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        long number3 = sc.nextLong();

        long[] originalNumbers = {number1, number2, number3};

        long[] sortedNumbers = {number1, number2, number3};

        Arrays.sort(sortedNumbers);

        for (long num : sortedNumbers) {
            System.out.println(num);
        }

        System.out.println();

        for (long num : originalNumbers) {
            System.out.println(num);
        }
    }
}
