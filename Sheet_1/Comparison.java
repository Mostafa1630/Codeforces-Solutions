package Sheet_1;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String S = sc.next();
        int B = sc.nextInt();

        if (S.equals("<")) {
            if (A < B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (S.equals(">")) {
            if (A > B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (S.equals("=")) {
            if (A == B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
