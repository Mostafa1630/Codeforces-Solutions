package Sheet_1;
import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area = a*a*3.141592653;

        System.out.printf("%.9f", area);
    }
}
