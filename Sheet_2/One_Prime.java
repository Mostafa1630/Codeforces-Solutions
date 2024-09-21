package Sheet_2;

import java.util.Scanner;

public class One_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if (isPrime(X)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}