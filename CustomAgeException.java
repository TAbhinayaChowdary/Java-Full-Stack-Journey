class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
public class CustomAgeException
{
    public static void main(String args[])
    {
        int i=10;
        try
        {
            if(i<18)
            {
                throw new InvalidAgeException("Age is not valid");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println("Caught the exception: " + e);
        }
        catch(Exception e)
        {
            System.out.println("Caught the exception: " + e);
        }
    }
}