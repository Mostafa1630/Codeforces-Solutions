package Sheet_1;

import java.util.Scanner;

public class Hard_Compare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            double result1 = b * Math.log(a);
            double result2 = d * Math.log(c);

            if (result1 > result2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }