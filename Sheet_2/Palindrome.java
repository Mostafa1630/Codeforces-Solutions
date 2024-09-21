package Sheet_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberString = sc.next();

        String reversedString = new StringBuilder(numberString).reverse().toString();

        String reversedStringWithoutLeadingZeroes = reversedString.replaceFirst("^0+(?!$)", "");
        System.out.println(reversedStringWithoutLeadingZeroes);
        if (numberString.equals(reversedString)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
