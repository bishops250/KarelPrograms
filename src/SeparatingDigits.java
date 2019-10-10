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

        int quotient_answer = quotient_of_a_b(num_a); // its the initial value the user inputted

        int fourth_digit = remainder_of_a_b(num_a); //gives the final digit

        int third_digit = remainder_of_a_b(quotient_answer); //does 543%10 =3 s third digit

        int num_digit = quotient_of_a_b(quotient_answer); // does 543/10= 54

        int first_digit = quotient_of_a_b(num_digit); //gives you the first digit

        int second_digit = remainder_of_a_b(num_digit); // does 54%10 = 4 second digit


        /* prints the four digits separately. */

        display_digits(first_digit); 
        display_digits(second_digit);
        display_digits(third_digit);
        display_digits(fourth_digit);










//do the remainder again to get the quotient

    }
}
