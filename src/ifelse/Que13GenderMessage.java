package ifelse;

//13- Accept the gender from the user as char and print the respective greeting message
//      Ex - Good Morning Sir (on the basis of gender)

import java.util.Scanner;

public class Que13GenderMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your gender");
        int g = sc.next().charAt(0);

        if(g == 'm' || g == 'M'){
            System.out.println("good morning sir");

        } else if (g == 'f' || g == 'F') {
            System.out.println("good morning ma'am");
        }


    }
}
