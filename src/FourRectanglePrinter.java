import java.awt.*;
import java.util.Scanner;


public class FourRectanglePrinter {

    public static void main(String[]args) {


        Scanner user_input = new Scanner(System.in);


        System.out.println("Please enter the width of the rectangles: ");
        int rectangle_width = user_input.nextInt(); /*Set the height and width to final because all the boxes will
       have the same size just a different location */

        System.out.println("Please enter the length of the rectangles: ");
        int rectangle_height = user_input.nextInt();

        Rectangle rectangle_one= new Rectangle(rectangle_width,rectangle_height);
        //creates the first rectangle at 0,0
        rectangle_one.translate(2,0);
        System.out.println(rectangle_one);
        rectangle_one.translate(2,3);
        System.out.println(rectangle_one);
        rectangle_one.translate(0,3);
        System.out.println(rectangle_one);



    }
}
