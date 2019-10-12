import java.util.Scanner;
import java.lang.String;
import java.lang.*;

public class Names {

    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please input your first name: ");
        String user_first_name = user_input.next(); //gets users first name

        System.out.println(" Please input your last name: ");
        String user_last_name = user_input.next(); //gets users last name

        String first_last_name = user_first_name + " " + user_last_name; /*combines users names so we have first name
       and last name */


        int first_lastname_length = first_last_name.length(); //outputs the length of names combined

        String users_initials =user_first_name.substring(0,1) +user_last_name.substring(0,1); /* gets first letter of
        users  first name and last name and creates initials.*/

        int index_firstname_last_letter = user_first_name.indexOf(user_last_name);

        int index_lastname_last_latter = user_last_name.indexOf(user_first_name);

        String mid_first =((user_first_name.substring(0, user_first_name.length() / 2)) +
                (user_last_name.substring(user_last_name.length() / 2, user_last_name.length())));;

        String mid_last =((user_last_name.substring(0, user_last_name.length() / 2)) +
                (user_first_name.substring(user_first_name.length() / 2, user_first_name.length()))) ;

        int compare_first_last = user_first_name.compareTo(user_last_name) ; //outputs -1

        int compare_last_first = user_last_name.compareTo(user_first_name); //outputs -1




        System.out.println(user_first_name);
        System.out.println(user_last_name);
        System.out.println(first_last_name);
        System.out.println(users_initials);
        System.out.println(first_lastname_length);
        System.out.println(compare_first_last);
        System.out.println(compare_last_first *-1);
        System.out.println(mid_first + " " + mid_last);


    }
}
