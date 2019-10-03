import java.awt.*;
import java.util.Scanner;


public class FourRectanglePrinter {

    public static void main(String[]args) {

        int rectangle_x_coordinate = 0, rectangle_y_coordinate = 0;

        Scanner user_input = new Scanner(System.in);


        System.out.println("Please enter the width of the rectangles: ");
       final int rectangle_width = user_input.nextInt();

        System.out.println("Please enter the length of the rectangles: ");
       final int rectangle_height = user_input.nextInt();

        Rectangle rectangle_one= new Rectangle(rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width,
                rectangle_height);

        Rectangle rectangle_two= new Rectangle(rectangle_width, rectangle_height);
        rectangle_two.translate(2,0);

        Rectangle rectangle_three= new Rectangle();
        rectangle_three.translate(2,3);

        Rectangle rectangle_four= new Rectangle();
        rectangle_four.translate(0,3);


    }
}
