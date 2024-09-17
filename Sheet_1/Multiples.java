package Sheet_1;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        String result = (a%b) == 0 || (b%a) ==0 ?"Multiples":"No Multiples";
        System.out.println(result);
    }
}
