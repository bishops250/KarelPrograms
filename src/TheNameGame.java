import java.lang.*;
import java.util.Scanner;

public class TheNameGame {

    private static void Verse_1(String first_last_name) { //prints first line of the Chant

        int first_last_length = first_last_name.length();

        System.out.println(first_last_name.substring(0,1).toUpperCase() + first_last_name.substring(1)
                +" " + first_last_name.substring(0,1).toUpperCase() + first_last_name.substring(1) + "bo-B" +
                first_last_name.substring(1,first_last_length));

        System.out.println("Banana-fana for-F" + first_last_name.substring(1,first_last_length) + "\n "
                + first_last_name.toUpperCase()+ "! " + "\n");
    };


    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter your first name: ");
        String first_name = user_input.nextLine();

        System.out.println(" Please enter your last name: ");
        String last_name = user_input.nextLine();

        Verse_1(first_name);
        Verse_1(last_name);


    }
}
