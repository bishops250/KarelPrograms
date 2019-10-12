import java.lang.*;
import java.util.Scanner;

public class TheNameGame {

    private static void EmptySpace() {
        System.out.println(" ");
    }

    private static void Verse_1(String first_name) { //prints first line of the Chant

        System.out.println( first_name.substring(0,1).toUpperCase() + first_name.substring(1,5) + " " +
                first_name.substring(0,1).toUpperCase() + first_name.substring(1,5) + ", " + "bo-"
                + first_name.substring(1,5));
    }

    private static void Verse_2(String last_name, String first_name) { //prints second line of the chant
        System.out.println("Banana-fana " + "fo-" +(first_name.substring(0,1)+last_name.substring(1,4)));

    }

    private static void Verse_3(String last_name) { //prints third line of the chant
        System.out.println("Fee-fi-mo-M"+last_name.substring(1,4) + " \n" + last_name.toUpperCase() + "!");
    }

    private static void Verse_4(String last_name) {

        System.out.println( last_name.substring(0,1).toUpperCase() + last_name.substring(1,4) + " " +
                last_name.substring(0,1).toUpperCase() + last_name.substring(1,4) + ", " + "bo-"
                + last_name.substring(1,4));

    }

    private static void Verse_5(String last_name, String first_name) {
        System.out.println("Banana-fana " + "fo-" +(first_name.substring(0,1)+last_name.substring(1,4)));

    }

    private static void Verse_6(String last_name) {
        System.out.println("Fee-fi-mo-M"+last_name.substring(1,4) + " \n" + last_name.toUpperCase() + "!");

    }
    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter your first name: ");
        String first_name = user_input.next();

        System.out.println(" Please enter your last name: ");
        String last_name = user_input.next() ;

        Verse_1(first_name);
        Verse_2(first_name,last_name);
        Verse_3(first_name);
        EmptySpace();
        Verse_4(last_name);
        Verse_5(last_name, first_name);
        Verse_6(last_name);

    }
}
