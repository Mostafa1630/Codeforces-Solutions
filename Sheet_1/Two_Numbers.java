package Sheet_1;

import java.util.Scanner;

public class Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double result = (double) a / b;

        System.out.println("floor " + a + " / " + b + " = " + (int)Math.floor(result));
        System.out.println("ceil " + a + " / " + b + " = " + (int)Math.ceil(result));
        System.out.println("round " + a + " / " + b + " = " + Math.round(result));
    }
}