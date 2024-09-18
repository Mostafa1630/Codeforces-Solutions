package Sheet_2;

import java.util.Scanner;

public class Fixed_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long correctPassword = 1999;

        while (true) {
            long enteredPassword = sc.nextLong();

            if (enteredPassword == correctPassword) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }
        }
    }
}