package Sheet_1;

import java.util.Scanner;

public class Two_intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int left = Math.max(l1, l2);
        int right = Math.min(r1, r2);

        if (left <= right) {
            System.out.println(left + " " + right);
        } else {
            System.out.println("-1");
        }
    }
}