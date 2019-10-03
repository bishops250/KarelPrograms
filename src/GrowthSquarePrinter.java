import java.awt.*;
import java.util.Scanner;

public class GrowthSquarePrinter {

    public static void main(String[]args) {

        int rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width, rectangle_height, rectangle_growth_x,
        rectangle_growth_y;

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter the X coordinate: ");
        rectangle_x_coordinate = user_input.nextInt(); //get user input for location of rectangle in the x dimension

        System.out.println(" Please enter the Y coordinate: ");
        rectangle_y_coordinate = user_input.nextInt(); //get user input for location of rectangle in the y dimension

        System.out.println("Please enter the width of the rectangle: ");
        rectangle_width = user_input.nextInt(); //get user input for width

        System.out.println("Please enter the height of the rectangle: ");
        rectangle_height = user_input.nextInt(); // gets user input for the height of rectangle

        System.out.println("Please enter the amount of growth you would like in the x dimension: ");
        rectangle_growth_x = user_input.nextInt(); //gets user input for size growth the user wants in the x dimension

        System.out.println("Please enter the amount of growth you would like y dimension: ");
        rectangle_growth_y = user_input.nextInt(); //gets user input for size growth the user wants in the y dimension


        Rectangle growth_rectangle = new Rectangle(rectangle_x_coordinate,rectangle_y_coordinate,
                rectangle_width,rectangle_height); //creates the rectangle

        growth_rectangle.translate(25,25); //moves the rectangle right 25 and up 25
        growth_rectangle.grow(rectangle_growth_x,rectangle_growth_y); //grows the rectangle by the users input

        System.out.println(growth_rectangle);


    }


}
