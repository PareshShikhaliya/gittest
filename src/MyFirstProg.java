public class MyFirstProg
{
    public static void main(String[] args)
    {

        int x  = 10;
        System.out.println("the value of x is ==="+x);
        x++;
        System.out.println("the value of x is ==="+x);
        x++;
        System.out.println("the value of x is ==="+x);

        System.out.println("the value of x is ==="+x);
        x--;
        System.out.println("the value of x is ==="+x);
        x--;
        System.out.println("the value of x is ==="+x);


    }
    public static double sum(int x , int y)
    {
        double s = x;
        return s;
    }
    public static int Multiply(int x , int y)
    {
        int s = x * y;
        return s;
    }
    public static double divide(double x , double y)
    {
        double s = x / y;
        return s;
    }

    public static void isEligible(int age)
    {
        if(age>=18)
        {
            System.out.println("You are eligible for Vote");
        }
        else
        {
            System.out.println("You are not eligible for Vote");

        }

    }


}
