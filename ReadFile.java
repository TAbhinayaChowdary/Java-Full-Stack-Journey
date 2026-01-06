import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors
import java.util.Scanner;
public class ReadFile
{
    public static void main(String args[])
    {
        Scanner scf = new Scanner(System.in);
        System.out.print("Enter the name of the file to create: ");
        String fileName = scf.nextLine(); 
        try
        {
            File myObj = new File(fileName);
            if (myObj.exists())
            {
                Scanner sc = new Scanner(myObj);
                while(sc.hasNextLine())
                {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
            }
            else
            {
                System.out.println("File doesn't exist.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}