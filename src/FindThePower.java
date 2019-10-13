import java.util.Scanner;

public class FindThePower {
    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);



        System.out.println("Please enter the exponents base: "); //asks the users for base of the exponent
        int exponent_base = user_input.nextInt();


        System.out.println(" Please enter the exponents power: "); //asks the user for exponent power.
        int exponent_power = user_input.nextInt();

        double exponent = Math.pow(exponent_base,exponent_power); /* takes the users exponent base and exponent power
        and gives the exponent */

        System.out.println(exponent_base + "^" + exponent_power + " = " + exponent);
    }
}
