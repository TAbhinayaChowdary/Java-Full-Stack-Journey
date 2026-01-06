import java.util.Scanner;

class Factorial
{
    public int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        num = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println("Factorial of "+ num + " = " + obj.fact(num));
    }
}