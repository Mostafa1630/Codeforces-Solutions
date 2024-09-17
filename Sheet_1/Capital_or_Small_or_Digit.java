package Sheet_1;
import java.util.Scanner;

public class Capital_or_Small_or_Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        if (Character.isDigit(x)) {
            System.out.println("IS DIGIT");
        } else if (Character.isLetter(x)) {
            System.out.println("ALPHA");
            if (Character.isUpperCase(x)) {
                System.out.println("IS CAPITAL");
            } else if (Character.isLowerCase(x)) {
                System.out.println("IS SMALL");
            }
        }
    }
}
