package Sheet_2;

import java.util.Scanner;

public class Even_Odd_Positive_and_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long even = 0;
        long odd = 0;
        long positive = 0;
        long negative = 0;

        for (long i = 0; i < N; i++) {
            long num = sc.nextLong();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
