package Sheet_1;

import java.util.Scanner;

public class Mathematical_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();
        String C = sc.next();
        int D = sc.nextInt();

        if (S.equals("+")) {
            if (A + B == D) {
                System.out.println("Yes");
            } else {
                System.out.println(A + B);
            }
        }else if (S.equals("-")) {
            if (A - B == D) {
                System.out.println("Yes");

            }else {
                System.out.println(A - B);
            }
        }else if (S.equals("*")) {
            if (A * B == D) {
                System.out.println("Yes");
            }else {
                System.out.println(A * B);
            }
        }
    }
}
