// Accept the standard of a student and based on the standard display exam time
import java.util.Scanner;

class Selection_switch
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int std = 0;

        System.out.println("Enter your Standard: ");
        std = sobj.nextInt();

        switch(std)
        {
            case 1:
                System.out.println("Your Exam time is 9.30");
                break;

            case 2:
                System.out.println("Your Exam time is 10.30");
                break;
            
            case 3:
                System.out.println("Your Exam time is 11.30");
                break;

            default:
                System.out.println("Enter Valid Standard");

        }


    }
}
