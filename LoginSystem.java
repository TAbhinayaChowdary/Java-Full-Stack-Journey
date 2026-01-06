import java.util.Scanner;
import java.util.HashMap;

class LoginSystem
{
    static HashMap<String, String> credentials = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        while(true)
        {
            
            System.out.print("1. Set Credentials\n2. Login\n3. Exit\nEnter choice: ");
            if (!sc.hasNextInt()) 
            { // Check if user entered a number
                sc.next(); 
                continue;
            }
            int n = sc.nextInt();
            sc.nextLine();
            switch(n)
            {
                case 1: 
                        System.out.println("Enter Username: ");
                        String Username = sc.nextLine();
                        System.out.println("Enter Password: ");
                        String Password = sc.nextLine();
                        setCredentials(Username, Password);
                        break;
                case 2: 
                        System.out.println("Enter Username: ");
                        String InputName = sc.nextLine();
                        System.out.println("Enter Password: ");
                        String InputPassword = sc.nextLine();
                        checkCredentials(InputName, InputPassword);
                        break;
                case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                default: 
                        System.out.println("Invalid Choice");
                        break;

            }
        }
    }
    public static void setCredentials(String Username, String Password)
    {
        credentials.put(Username, Password);
        System.out.println("Account created successfully!!!");
    }
    public static void checkCredentials(String InputName, String InputPassword)
    {
        if(!credentials.containsKey(InputName))
        {
            System.out.println("Invalid username");
        }
        else if(!credentials.get(InputName).equals(InputPassword))
        {
            System.out.println("Invalid password");
        }
        else if(!credentials.containsKey(InputName) && !credentials.get(InputName).equals(InputPassword))
        {
            System.out.println("Invalid username & Invalid password");
        }
        else        
        {
            System.out.println("Login Successful!!!");
        }
    }
        
}
    
