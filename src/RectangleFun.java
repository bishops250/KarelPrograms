import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {

        int rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width, rectangle_height;

        Scanner user_input = new Scanner(System.in);


        System.out.println(" Please enter the X coordinate: ");
        rectangle_x_coordinate = user_input.nextInt();

        System.out.println(" Please enter the Y coordinate: ");
        rectangle_y_coordinate = user_input.nextInt();

        System.out.println("Please enter the width of the rectangle: ");
        rectangle_width = user_input.nextInt();

        System.out.println("Please enter the length of the rectangle: ");
        rectangle_height = user_input.nextInt();

        Rectangle printed_rectangle = new Rectangle(rectangle_x_coordinate, rectangle_y_coordinate, rectangle_width, rectangle_height);


    }

}


