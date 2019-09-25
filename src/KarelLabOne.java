import becker.robots.*;

public class KarelLabOne {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,3, 2, Direction.EAST, 0);



        // Your code goes below these lines.

        karel.move();
        karel.move();
        karel.canPickThing();
    




    }
}
