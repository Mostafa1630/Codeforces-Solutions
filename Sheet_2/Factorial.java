package Sheet_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long[] arr = new long[(int) n];

        for (int i = 0; i < n; i++) {
            long fac = sc.nextLong();
            arr[i] = 1;

            for (long j = 1; j <= fac; j++) {
                arr[i] *= j;
            }

            System.out.println(arr[i]);
        }

        sc.close();
    }
}
