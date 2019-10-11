import java.util.Scanner;
import java.lang.String;
import java.lang.*;

public class Names {

    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please input your first name: ");
        String user_first_name = user_input.next();

        System.out.println(" Please input your last name: ");
        String user_last_name = user_input.next();

        String first_last_name = user_first_name + " " + user_last_name;

        String users_initials =user_first_name.substring(0,2) +user_last_name.substring(0,2);

        String index_firstname_last_letter =  ;

        String index_lastname_last_latter =;

        String Half_firstname = user_first_name.substring(0,2) ;

        String Half_lastname =user_last_name.substring(0,2) ;

        String combine_halfs_first_last_name = ;





        System.out.println(first_last_name);
        System.out.println(users_initials);

    }
}
