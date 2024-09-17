package Sheet_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double result = (a * b) - (c * d);

        DecimalFormat df = new DecimalFormat("0.#####");

        System.out.println("Difference = " + df.format(result));
    }
}