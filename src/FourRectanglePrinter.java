import java.awt.*;
import java.util.Scanner;


public class FourRectanglePrinter {

    public static void main(String[]args) {

        Point default_point= new Point(0,0);

        Scanner user_input= new Scanner(System.in);

        System.out.println("Please enter the width of the rectangle: ");
        int rectangle_width= user_input.nextInt();

        System.out.println("Please enter the height of the rectangles: ");
        int rectangle_height = user_input.nextInt();

        Dimension user_rec_dimension= new Dimension(rectangle_width,rectangle_height);

       Rectangle rectangle= new Rectangle(default_point,user_rec_dimension);
       System.out.println("Rectangle Current location: " + rectangle.getLocation());

       rectangle.translate(5,0);
       System.out.println("Rectangle Current location: " + rectangle.getLocation());

       rectangle.translate(0,-5);
       System.out.println("Rectangle Current location: " + rectangle.getLocation());

       rectangle.translate(-5,0);
        System.out.println("Rectangle Current location: " + rectangle.getLocation());
    /*


        System.out.println("Please enter the width of the rectangles: ");
        int rectangle_width = user_input.nextInt(); *//*Set the height and width to final because all the boxes will
       have the same size just a different location *//*




        Rectangle rectangle_one= new Rectangle(rectangle_width,rectangle_height);
        System.out.println(rectangle_one);
        //creates the first rectangle at 0,0
        rectangle_one.translate(2,0);
        System.out.println(rectangle_one);
        rectangle_one.translate(2,3);
        System.out.println(rectangle_one);
        rectangle_one.translate(0,3);
        System.out.println(rectangle_one);
*/


    }
}
