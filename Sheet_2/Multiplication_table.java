package Sheet_2;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for (long i = 1; i <= 12; i++) {
            System.out.println(n + " * " + i + " = " + n * i );
        }
    }
}
