package Sheet_1;

import java.util.Scanner;

public class Max_and_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));

        if (a % 1 == 0 && b % 1 == 0 && c % 1 == 0) {
            System.out.println((int) min + " " + (int) max);
        } else {
            System.out.println(String.format("%.10f", min) + " " + String.format("%.10f", max));
        }
    }
}
