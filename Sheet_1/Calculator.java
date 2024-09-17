package Sheet_1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char operator = ' ';
        int operatorIndex = -1;

        if (input.contains("+")) {
            operator = '+';
            operatorIndex = input.indexOf("+");
        } else if (input.contains("-")) {
            operator = '-';
            operatorIndex = input.indexOf("-");
        } else if (input.contains("*")) {
            operator = '*';
            operatorIndex = input.indexOf("*");
        } else if (input.contains("/")) {
            operator = '/';
            operatorIndex = input.indexOf("/");
        }

        int a = Integer.parseInt(input.substring(0, operatorIndex).trim());
        int b = Integer.parseInt(input.substring(operatorIndex + 1).trim());

        int result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }

        System.out.println(result);
    }
}
