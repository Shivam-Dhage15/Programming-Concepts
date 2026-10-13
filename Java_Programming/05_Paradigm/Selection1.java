import java.util.*;  // Scanner cha object banvyacha asel tar lihava lagel compulsory nahi

class Selection1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0;
        System.out.println("Enter Number : ");
        
        No = sobj.nextInt();

        if( (No % 2) == 0)
        {
            System.out.println("The Number is Even");
        }

        else
        {
            System.out.println("The Number is Odd");
        }
    }
}