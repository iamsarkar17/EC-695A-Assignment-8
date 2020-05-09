public class Calculate
{

    // Main function 
    public static void main(String[] args)
    {

        // First number
        MyPackage2.Arithmetic C1 = new MyPackage2.Arithmetic(3, 2);

        // printing first and second number for addition
        System.out.println(C1.first + " "+ C1.second);

        // Second number
        MyPackage2.Arithmetic C2 = new MyPackage2.Arithmetic(9, 5);

        // printing second numberprinting first and second number for subtraction
        System.out.println(C2.first + " "+ C2.second);

        // for Storing the sum and subtraction
        MyPackage2.Arithmetic C3 = new MyPackage2.Arithmetic();

        // calling addsub() method
        C3 = C3.addsub(C1, C2);

        // printing the sum 
        System.out.println("Sum: " + C3.addition);

        // printing the subtraction
        System.out.println("Sub: " + C3.subtraction);
    }
} 