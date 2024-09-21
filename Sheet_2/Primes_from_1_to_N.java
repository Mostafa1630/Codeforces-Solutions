package Sheet_2;

import java.util.Scanner;

public class Primes_from_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Create a boolean array to keep track of prime numbers
        boolean[] isPrime = new boolean[N + 1];

        // Initialize all entries as true (assume all numbers are prime initially)
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Implement the Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect and print all prime numbers
        StringBuilder primes = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.append(i).append(" ");
            }
        }

        // Output the result
        System.out.println(primes.toString().trim());

        sc.close();
    }
}
