// Accept the standard of a student and based on the standard display exam time

import java.util.Scanner;

class Selection_elseif 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int std = 0;

        System.out.println("Enter Your Standard : ");
        std = sobj.nextInt();

        if(std == 1)
        {
            System.out.println("Your exam time is 9.30 AM");
        }

        else if(std == 2)
        {
            System.out.println("Your Exam time is 10.30");
        }

        else if(std == 3)
        {
            System.out.println("Your exam time is 11.30");
        }

        else 
        {
            System.out.println("Enter Valid Standard");
        }

        
    }
}
