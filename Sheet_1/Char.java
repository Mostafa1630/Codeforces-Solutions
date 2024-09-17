package Sheet_1;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        char result = Character.isUpperCase(c) ?Character.toLowerCase(c):Character.toUpperCase(c);
        System.out.println(result);

    }
}