package ifelse;

//16- Accept name and age from the user. Check if the user is a valid voter or not.
//      Vaid - Hello Shery, You are a valid voter.
//      Invalid - Sorry Shery, you can't cast the vote.
//	Part 2 - Print after how many years the user will be eligible

import java.util.Scanner;

public class Que16VoterEligivility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        String name = sc.nextLine();

        System.out.println("enter the age");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("hello " + name + "you are valid voter");

        }else{
            System.out.println("Sorry ,"+name+ " you can't cast the vote");
            System.out.println("You will be eligible to vote after " + (18 - age) + " year(s).");

        }



    }

}
