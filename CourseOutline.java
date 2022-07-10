import java.util.Scanner;
class Course
{
    String CourseName;
    double CourseCredit;
    double CoursePrice;

    public Course(String cn, double cc, double cp)
    {
        CourseName = cn;
        CourseCredit = cc;
        CoursePrice = cp;
    }

    public String toString()
    {
        return CourseName + " " + CourseCredit + " " + CoursePrice;
    }

    String getCourseName()
    {
        return CourseName;
    }
    void setCourseName(String cn)
    {
        CourseName = cn;
    }

    double getCourseCredit()
    {
        return CourseCredit;
    }
    void setCourseCredit(double cc)
    {
        CourseCredit = cc;
    }

    double getCoursePrice()
    {
        return CoursePrice;
    }
    void setCoursePrice(double cp)
    {
        CoursePrice = cp;
    }
    static double sum=0;
}


public class CourseOutline
{
    static Course[] CourseArray = new Course[10];
    public static void searchbyCourse(String name)
    {
        for (int i = 0; i < 3; i++)
        {
            if (CourseArray[i].getCourseName().equals(name)) {
                System.out.print(CourseArray[i].getCourseName()+"\t\t\t\t\t\t");
                System.out.print(CourseArray[i].getCourseCredit()+"\t\t\t\t\t");
                System.out.println(CourseArray[i].getCoursePrice());
                Course.sum=Course.sum+CourseArray[i].getCoursePrice();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Courses your varsity offered: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            input.nextLine();
            System.out.println("Enter course name:");
            String cn = input.nextLine();
            System.out.println("Enter course credit:");
            double cc = input.nextDouble();
            System.out.println("Enter course price:");
            double cp = input.nextDouble();
            CourseArray[i] = new Course(cn, cc, cp);
            System.out.println(CourseArray[i].toString());
        }

        System.out.println("");
        System.out.println("You can take only three courses in one semester.");
        System.out.println("Input your advising courses name one by one:");
        System.out.println("");

        String[] cn1 = new String[3];
        for (int i = 0; i < 3; i++)
        {
            input.nextLine();
            System.out.println("Enter course name:"+(i+1));
            cn1[i] = input.next();
        }
        System.out.println("");
        System.out.println("Here is the advising slip: \n");
        System.out.println("Course name \t\t Course Credit \t\t\t Course Price:");

        for (int i = 0; i < 3; i++)
        {
            searchbyCourse(cn1[i]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Cost of the courses :                     "+Course.sum);

    }
}