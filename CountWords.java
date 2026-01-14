import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors
import java.util.Scanner;
public class CountWords
{
    public static void main(String args[])
    {
        Scanner scf = new Scanner(System.in);
        System.out.print("Enter the name of the file to create: ");
        String fileName = scf.nextLine(); 
        System.out.print("1) to count lines \n2) to count words\nEnter your choice: ");
        int choice = scf.nextInt();
        try
        {
            File myObj = new File(fileName);
            int count=0;
            if (myObj.exists())
            {
                switch(choice)
                {
                    case 1:
                            Scanner sc = new Scanner(myObj);
                            while(sc.hasNextLine())
                            {
                                sc.nextLine();
                                count+=1;
                            }   
                            System.out.println("This file has "+count+" lines.");
                            break;
                    case 2: 
                            Scanner sc2 = new Scanner(myObj);
                            while(sc2.hasNext())
                            {
                                sc2.next();
                                count+=1;
                            }
                            System.out.println("This file has "+count+" words.");
                            break;
                    default:
                            System.out.println("Invalid choice.");
                            break;
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