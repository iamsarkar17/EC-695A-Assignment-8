package MyPackage1;

public class ComplexNumber
{
    //for real and imaginary parts of complex numbers
    public double real;
    public double img;
    //constructor to initialize the complex number

    public ComplexNumber(double r, double i)
    {
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
    {
        //creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        //returning the output complex number
        return temp;
    }
}