import java.util.Scanner;

public class Salary
{
    public static void main(String args[])
    {
        System.out.println("Enter the salary");
        Scanner in=new Scanner(System.in);
        float s=in.nextFloat();
        float b=((s - 10000) / 10000) * 100;
        try
        {
            if(s==10000)
            {
                System.out.println("Salary provided with no bonus");
            }
            else
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {

            System.out.println("Added salary bonus is: "+b+"%");
        }
    }
}
