import java.util.*; 

class Selection3

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0;
        System.out.println("Enter your Age : ");
        
        No = sobj.nextInt();

        if( No < 18)
        {
            System.out.println("Your Not Allowed");
        }

        else
        {
            System.out.println("Your Allowed");
        }
    }
}