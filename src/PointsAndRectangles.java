import java.util.Scanner;
import java.awt.*;

public class PointsAndRectangles {

    public static void main(String[]args) {

        int x_coordinate, y_coordinate, rectangle_length, rectangle_width;

        //Prompts user for location, width, and height of the rectangle.

        Scanner user_input = new Scanner(System.in);

        System.out.println(" Please enter the X coordinate: ");
        x_coordinate = user_input.nextInt();

        System.out.println(" Please enter the Y coordinate: ");
        y_coordinate = user_input.nextInt();

        System.out.println("Please enter the width of the rectangle: ");
        rectangle_width = user_input.nextInt();

        System.out.println("Please enter the length of the rectangle: ");
        rectangle_length = user_input.nextInt();

        Point point_rectangle = new Point(x_coordinate,y_coordinate); /*turns the x, y user enter into a point. So to
        call for both coordinates you only need to use the variable point_rectangle*/

        Dimension rectangle_dimension = new Dimension(rectangle_width, rectangle_length);
        // rectangle_dimensions is a variable that stores rectangle_width, and rectangle_length together as one

        Rectangle rectangle = new Rectangle(point_rectangle,rectangle_dimension);

        System.out.println(rectangle);
        System.out.println(rectangle_dimension);
        System.out.println(point_rectangle);






    }
}
