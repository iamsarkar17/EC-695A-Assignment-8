import java.util.Scanner;

public class Check
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        try
        {
            if(n>10)
            {
                System.out.println("Number is acceptable");
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
                System.out.println("Number is unacceptable");
        }
    }
}
