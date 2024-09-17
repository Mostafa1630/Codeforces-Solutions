package Sheet_1;

import java.util.Scanner;

public class First_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        String str = String.valueOf(a).split("")[0];
        String result = Integer.parseInt(str)%2 == 0 ?"EVEN":"ODD";
        System.out.println(result);


    }
}
