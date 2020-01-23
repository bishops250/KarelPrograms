import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {

        int rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width, rectangle_height;

        Scanner user_input = new Scanner(System.in);

        //Prompts the user to choose the  X,Y, Width, Height of the rectangle

        System.out.println(" Please enter the X coordinate: ");
        rectangle_x_coordinate = user_input.nextInt();

        System.out.println(" Please enter the Y coordinate: ");
        rectangle_y_coordinate = user_input.nextInt();

        System.out.println("Please enter the width of the rectangle: ");
        rectangle_width = user_input.nextInt();

        System.out.println("Please enter the height of the rectangle: ");
        rectangle_height = user_input.nextInt();

        Rectangle printed_rectangle = new Rectangle(rectangle_x_coordinate, rectangle_y_coordinate,
                rectangle_width, rectangle_height); //creates a rectangle

        //Prints the Width, Height, X and Y coordinate, The Perimeter, Original, and new location of rectangle.
       System.out.println("Width: "+ printed_rectangle.getWidth());
       System.out.println("Height: "+ printed_rectangle.getHeight());
       System.out.println("X: " + printed_rectangle.getX());
       System.out.println("Y: " + printed_rectangle.getY());
       System.out.println("Perimeter: " + (( printed_rectangle.getHeight() + printed_rectangle.getWidth()) * 2));

       /*solves for perimeter by utilzing built in rectangle method to find height and width and multiply it to get the
        perimeter */

       System.out.println("Original Location: " + "(" + printed_rectangle.getX() + " , " + printed_rectangle.getY() + ")");

       printed_rectangle.translate(-4,2);
        System.out.println("The New Location is: " + printed_rectangle.getLocation());




    }

}


