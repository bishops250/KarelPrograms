/* Aron Bishop "SquareWord Root" 10/13/19 12:50am

    The program below asks for users to choose a single word then we determine
    the words string length and square root it. To ensure values round up we
    add 0.5. The number output is utilized to determine the char from user inputted word to be printed.

 */

import java.util.Scanner;

public class SquareWordRoot {

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in); // initializes a new Scanner to get User input

        System.out.println(" Please enter the a single word you would like Square rooted: "); /* prompts the user for a
        String output */

        String user_word = user_input.next(); //gets users string

        int word_length = user_word.length(); //converts users inputted string into num using the length method.

        double square_root_word = (int)(Math.sqrt(word_length)); //square roots the length then converts it to int

        String square_root_word_char = user_word.substring((int)square_root_word,(int)square_root_word+1); /*
        determines the char would be, after square rooting the length of the word and and casting the value to int*/

        System.out.println("The \"Square root\" of " + user_word + " is " + square_root_word_char + "."); /*Prints the
        square root.*/


    }
}
