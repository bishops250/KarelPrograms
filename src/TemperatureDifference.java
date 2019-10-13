
import java.util.Scanner;

public class TemperatureDifference {

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);


        System.out.println("Please enter the first temperature: "); //gets the users first temperature
        int temp_1 = user_input.nextInt();


        System.out.println(" Please enter the second temperature: "); //gets the users second temperature
        int temp_2 = user_input.nextInt();


        int difference_of_temp = Math.abs(temp_1 - temp_2); // gives the difference of the two temperature

        System.out.println(" The temperature changed by "+ difference_of_temp + " degrees." );
    }
}
