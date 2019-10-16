import java.util.Scanner;

public class Password {

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        String first_name, middle_name, last_name, users_password;

        int users_age;

        System.out.println("Please enter your first name: ");
        first_name = user_input.next();

        System.out.println("Please enter your middle name: ");
        middle_name = user_input.next();

        System.out.println("Please enter your last name: ");
        last_name = user_input.next();

        System.out.println("Please enter your age: ");
        users_age = user_input.nextInt();

        int first_name_mid_length = (first_name.length()/2);
        int middle_name_mid_length = (middle_name.length()/2);
        int last_name_mid_length = (last_name.length()/2);
        int first_name_length = first_name.length();
        int middle_name_length = middle_name.length();
        int last_name_length = last_name.length();


        users_password = "" + first_name.substring(first_name_mid_length,first_name_mid_length+1).toUpperCase()
                + middle_name.substring(middle_name_mid_length,middle_name_mid_length+1).toUpperCase() +
                (last_name.substring(last_name_mid_length, last_name_mid_length+1).toUpperCase()) +
                (first_name.substring(first_name.length(),first_name.length()).toLowerCase()) +
                (middle_name.substring(middle_name.length(),middle_name.length()).toLowerCase()) +
                (last_name.substring(last_name.length(),last_name.length()).toLowerCase()) + (users_age * 75);
        System.out.println("First name: " + first_name);
        System.out.println("Middle name: " + middle_name);
        System.out.println("Last name: " + last_name);
        System.out.println("Age: " + users_age);
        System.out.println("password: " + users_password);







    }

}
