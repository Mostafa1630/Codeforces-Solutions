package Sheet_1;

import java.util.Scanner;

public class Age_in_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalDays = sc.nextLong();

        int years = (int)totalDays / 365;
        int remainingDaysAfterYears = (int)totalDays % 365;

        int months = remainingDaysAfterYears / 30;
        int remainingDaysAfterMonths = remainingDaysAfterYears % 30;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(remainingDaysAfterMonths + " days");
    }
}
