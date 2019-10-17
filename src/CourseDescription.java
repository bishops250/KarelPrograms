import java.util.Scanner;


public class CourseDescription {

    public static void main(String[]args) {

        Scanner user_input = new Scanner(System.in);

        String full_description,department,course_number,course_title;

        System.out.println("What is the description of the course? ");
        full_description = user_input.nextLine();

        int index_department = full_description.indexOf(' ');
        int index_course_number = full_description.indexOf(' ',index_department+1);
        int index_course_title = full_description.length();

        department = full_description.substring(0,index_department);
        course_number = full_description.substring(index_department+1,index_course_number);
        course_title = full_description.substring(index_course_number+1,index_course_title);


        System.out.println("The course descriptions breaksdown to: ");


        System.out.println("Department: " + department);
        System.out.println("Course Number: " + course_number);
        System.out.println("Title: " + course_title);



    }

}
