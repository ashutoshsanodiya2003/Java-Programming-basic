package ifelse;

//19- Accept a year and check if it a leap year or not (google to find out what's a leap year)

import java.util.Scanner;

public class Que19LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num % 400 == 0 || num % 4 == 0 && num % 100 != 0) {
            System.out.println("number is leap year");
        } else {
            System.out.println("number is not leap year");
        }


    }
}
