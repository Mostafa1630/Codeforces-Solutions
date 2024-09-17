package Sheet_1;

import java.util.Scanner;

public class Digits_Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();


        int lastDigitN = (int) (N % 10);
        int lastDigitM = (int) (M % 10);


        int sum = lastDigitN + lastDigitM;

        System.out.println(sum);
    }
}
