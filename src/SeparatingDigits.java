import java.util.Scanner;
import java.lang.*;

public class SeparatingDigits {



    private static int quotient_of_a_b(int num_a) { // divides the users four digit input by 10

        return num_a / 10; //returns the value

    }

    private static int remainder_of_a_b(int num_a) { //does the remainder operator on the four digit number the user inputs by 10


        return num_a % 10; //returns the value

    }

    private static void display_digits(int digit) { //displays the users digits
 System.out.print(digit + " ");


    }
    public static void main(String[]args){

        Scanner user_input = new Scanner(System.in); //creates new scanner to receive user input

        int num_a;

        System.out.println("Please enter the first number you would like divided: "); //asks for the users for digit number
        num_a = user_input.nextInt();

        int quotient_answer = quotient_of_a_b(num_a); // its the intial value the user inputted

        int fourth_digit = remainder_of_a_b(num_a); //gives the final digit

        int answer_five = remainder_of_a_b(quotient_answer); //does 543%10 =3 s third digit

        int answer_two = quotient_of_a_b(quotient_answer); // does 543/10= 54

        int answer_three = quotient_of_a_b(answer_two); //gives you the first digit

        int answer_four = remainder_of_a_b(answer_two); // does 54%10 = 4 second digit



        display_digits(answer_three);
        display_digits(answer_four);
        display_digits(answer_five);
        display_digits(fourth_digit);










//do the remainder again to get the quotient

    }
}
