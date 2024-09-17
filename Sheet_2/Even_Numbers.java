package Sheet_2;

import java.util.Scanner;

public class Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (long i = 1; i <= n; i++) {
            if (n  == 1) {System.out.println(-1); break;}
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
