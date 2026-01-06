import java.util.*;
class InvalidInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}