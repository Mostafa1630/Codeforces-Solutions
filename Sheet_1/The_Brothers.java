package Sheet_1;

import java.util.Scanner;

public class The_Brothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b1 = sc.nextLine();
        String b2 = sc.nextLine();
        String result = b1.split(" ")[1].equals(b2.split(" ")[1])?"ARE Brothers":"NOT";
        System.out.println(result);

    }
}
