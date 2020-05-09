package MyPackage2;

// User Defined Complex class
public class Arithmetic
{

    // Declaring variables
    public int first;
    public int second;
    public int addition;
    public int subtraction;

    // Empty Constructor
    public Arithmetic()
    {
    }

    // Constructor to accept
    // the first and second number
    public Arithmetic(int a, int b)
    {
        first = a;
        second = b;
    }

    // Defining addsub() method
    // for adding and subtracting two numbers
    public Arithmetic addsub(Arithmetic C1, Arithmetic C2)
    {
        // creating temporary variable
        Arithmetic temp = new Arithmetic();

        // adding the numbers
        temp.addition = C1.first + C1.second;

        // subtracting the numbers
        temp.subtraction = C2.first - C2.second;

        // returning the sum and subtraction
        return temp;
    }
}
