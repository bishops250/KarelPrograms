import java.lang.*;
import java.util.Scanner;

public class TheNameGame {

    private static void Verse_1(String first_last_name) {

        int first_last_length = first_last_name.length(); /*gets the length of the string variables,
        used to determine substring length required to print the users first or last name*/

        System.out.println(first_last_name.substring(0, 1).toUpperCase() + first_last_name.substring(1)
                + ", " + first_last_name.substring(0, 1).toUpperCase() + first_last_name.substring(1) + " bo-B" +
                first_last_name.substring(1, first_last_length)); /* capatilizes the first letter of their name
                and Prints the first line*/


        System.out.println("Banana-fana fo-F" + first_last_name.substring(1, first_last_length)); /* prints the second line */


        System.out.println("Fee-fi-mo-M" + first_last_name.substring(1, first_last_length)+ "\n"
                + first_last_name.toUpperCase() + "!" + "\n"); /* prints the third and fourth line */

    }
    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter your first name: "); //asks the user for their first name
        String first_name = user_input.nextLine();

        System.out.println(" Please enter your last name: "); //asks the user for their last name
        String last_name = user_input.nextLine();

        Verse_1(first_name);
        Verse_1(last_name);


    }
}
