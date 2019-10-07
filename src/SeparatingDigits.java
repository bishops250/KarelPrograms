import java.util.Scanner;

public class SeparatingDigits {



    private static int quotient_of_a_b(int num_a) {

        return num_a / 10;

    }

    private static int remainder_of_a_b(int num_a) {


        return num_a % 10;

    }

    private static void display_digits(int digit) {
 System.out.print(digit + " ");


    }
    public static void main(String[]args){

        Scanner user_input = new Scanner(System.in);

        int num_a;

        System.out.println("Please enter the first number you would like divided: ");
        num_a = user_input.nextInt();

        int quotient_answer = quotient_of_a_b(num_a);
               int remainder_answer = remainder_of_a_b(num_a);
               int remainder2_answer = remainder_of_a_b(num_a / 10);
               display_digits(remainder_answer);
               display_digits(remainder2_answer);

//do the remainder again to get the quotient

    }
}
