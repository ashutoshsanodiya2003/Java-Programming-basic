package basic;

//2- Print the messege along with values and sum
//	Ex - The sum of 45 & 12  = 57

import java.util.Scanner;
public class Que2sumofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of " + a + " & " + b + " = " + sum);
    }
}