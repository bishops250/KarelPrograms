import java.awt.*;
import java.util.Scanner;


public class FourRectanglePrinter {

    public static void main(String[]args) {

        int rectangle_x_coordinate = 0, rectangle_y_coordinate = 0;


        Scanner user_input = new Scanner(System.in);


        System.out.println("Please enter the width of the rectangles: ");
       final int rectangle_width = user_input.nextInt(); /*Set the height and width to final because all the boxes will
       have the same size just a different location */

        System.out.println("Please enter the length of the rectangles: ");
       final int rectangle_height = user_input.nextInt();

        Rectangle rectangle_one= new Rectangle(rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width,
                rectangle_height); //creates the first rectangle at 0,0

        Rectangle rectangle_two= new Rectangle(2,0,rectangle_width, rectangle_height);
        //creates the second rectangle and sets it so its located to left of the first rectangle



        Rectangle rectangle_three= new Rectangle(2,3,rectangle_width,rectangle_height);
        //creates the thrid rectangle and sets it under the second rectangle

        Rectangle rectangle_four= new Rectangle(0,3,rectangle_width,rectangle_height);
       //creates fourth rectangle and moves it under the first rectangle


    }
}
