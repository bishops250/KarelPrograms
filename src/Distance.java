import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        int first_x_coordinate, second_x_coordinate, first_y_coordinate, second_y_coordinate;


        System.out.println("Please enter the first X coordinate: "); //gets the users first x coordinate
        first_x_coordinate = user_input.nextInt();

        System.out.println("Please enter the second X coordinate: "); //gets the users second x coordinate
        second_x_coordinate = user_input.nextInt();

        System.out.println("Please enter the first Y coordinate: "); //gets the users first y coordinate
        first_y_coordinate = user_input.nextInt();

        System.out.println("Please enter the second Y coordinate: "); //gets the second y coordinate
        second_y_coordinate = user_input.nextInt();

       /*  Unnecessary Code, It solves for slope instead of distance

       double slope_of_the_points = ((Math.pow(second_y_coordinate,2))-(Math.pow(first_y_coordinate,2)/
                (Math.pow(second_x_coordinate,2))-(Math.pow(first_x_coordinate,2))));

                solves for slope of two points using this equation of  (Y(2)^2 - Y(1)^2)/(X(2)^2 - X(1)^2)
*/

        double distance_calculation = Math.sqrt(Math.pow((second_x_coordinate - first_x_coordinate), 2)
                + Math.pow((second_y_coordinate - first_y_coordinate), 2)); /*Calculates Distance between
                                the points*/


        System.out.println("The difference between" + "(" + first_x_coordinate + ", " + first_y_coordinate + ") and (" +
                second_x_coordinate + ", " + second_y_coordinate + ") is " + distance_calculation);


    }
}
