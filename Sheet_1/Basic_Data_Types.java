package Sheet_1;
import java.util.Scanner;

public class Basic_Data_Types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        long l = sc.nextLong();
        char c = sc.next().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();

        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.5f\n", d);
    }
}

