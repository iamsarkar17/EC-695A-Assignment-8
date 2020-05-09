import MyPackage1.ComplexNumber;

public class ComplexNumberDisplay
{
    public static void main(String args[])
    {
        ComplexNumber c1 = new ComplexNumber(5.5, 4);
        ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = ComplexNumber.sum(c1, c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
