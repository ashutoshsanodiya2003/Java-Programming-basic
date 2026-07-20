package ifelse;

import java.util.Scanner;

public class Que18GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first num");
        int num1 = sc.nextInt();

        System.out.println("enter the second num");
        int num2 = sc.nextInt();

        System.out.println("enter the third num");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is great");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("num2 is great");
        } else {
            System.out.println("num 3 is greatest ");
        }

    }
}
