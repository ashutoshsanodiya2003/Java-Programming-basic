package ifelse;

//12- Accept two numbers and print the greatest between them

import java.util.Scanner;

public class Que12greatestoftwoNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first Num");
        int num1 = sc.nextInt();

        System.out.println("enter the second Num");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("num 1 is greatest");
        }else {
            System.out.println("num 2 is greatest");
        }

    }
}
