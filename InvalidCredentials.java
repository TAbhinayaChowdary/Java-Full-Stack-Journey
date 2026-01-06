import java.util.Scanner;

class InvalidLoginCredentialException extends Exception
{
    public InvalidLoginCredentialException (String str)
    {
        super(str);
    }
}

class InvalidCredentials
{
    public static void main(String args[])
    {
        String username = "admin";
        String password = "password@123";
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter username: ");
            String EnteredUsername = sc.nextLine();
            System.out.println("Enter password: ");
            String EnteredPassword = sc.nextLine();
            if(!EnteredUsername.equals(username))
            {
                throw new InvalidLoginCredentialException("Invalid Username");
            }
            else if(!EnteredPassword.equals(password))
            {
                throw new InvalidLoginCredentialException("Invalid Password");
            }
            else if(!EnteredUsername.equals(username) && !EnteredPassword.equals(password))
            {
                throw new InvalidLoginCredentialException("Invalid Username and Password");
            }
            else
            {
                System.out.println("Login Successful");
            }

        }
        catch(InvalidLoginCredentialException e)
        {
            System.out.println("Caught the exception: " + e);
        }
        catch(Exception e)
        {
            System.out.println("Caught the exception: " + e);
        }
    }
}