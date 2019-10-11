
public class WrappersDelight {

    public static void main(String[]args) {

        int num1 = 14;

         Integer num2 = new Integer(8);

         double num3 = 2.5;

         double num4 = num3 + num2;

         num2= 5;

         num3 =  num1 + num2 + num4;

         num1 = (int) (num2 + num4);




    }
}
