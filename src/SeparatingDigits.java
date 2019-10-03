import java.util.Scanner;

public class SeparatingDigits {



    static void quotient_of_a_b() {

        Scanner user_input = new Scanner(System.in);

         int num_a, num_b, quotient_num_a_b;

         System.out.println("Please enter the first number you would like divided: ");
         num_a = user_input.nextInt();

        System.out.println("Please enter the second number you would like divided: ");
         num_b = user_input.nextInt();

         quotient_num_a_b = num_a / num_b;
         System.out.println("The quotient of "  + num_a + " and " + num_b + " = " + quotient_num_a_b);



    }

    static void remainder_of_a_b() {
        int num_a, num_b, quotient_num_a_b;
        num_a = 2;
        num_b = 3;
        quotient_num_a_b = num_a % num_b;
        System.out.println("The remainder of "  + num_a + " and " + num_b + " = " + quotient_num_a_b);

    }

    public static void main(String[]args){

        quotient_of_a_b();

        remainder_of_a_b();


    }
}
