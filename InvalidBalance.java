import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}

class InvalidBalance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Enter your account balance: ");
        int withdrawal = sc.nextInt();
        try
        {
            if(withdrawal > balance)
            {
                throw new InsufficientBalanceException("Insufficient balance");
            }
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println("Caught the exception: " + e);
        }
        catch(Exception e)
        {
            System.out.println("Caught the exception: " + e);
        }

    }

}