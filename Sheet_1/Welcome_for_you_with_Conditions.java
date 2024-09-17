package Sheet_1;

import java.util.Scanner;

public class Welcome_for_you_with_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        String result = a>=b?"Yes":"No";
        System.out.println(result);
    }
}
