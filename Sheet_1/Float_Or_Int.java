package Sheet_1;

import java.util.Scanner;

public class Float_Or_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        int integerPart = (int) number;
        double decimalPart = number - integerPart;

        String[] parts = String.valueOf(number).split("\\.");

        if (parts[1].equals("0")) {
            System.out.println("int " + integerPart);
        } else {
            System.out.println("float " + integerPart + " " + "0."+parts[1]);
        }
    }
}
