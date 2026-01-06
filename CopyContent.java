import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

class CopyContent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String sourceFileName = sc.nextLine();
        System.out.print("Enter the destination file name: ");
        String destFileName = sc.nextLine();
        System.out.print("1) to confirm copying content: \n2) to display content in destination file after copying\nEnter your choice: ");
        int choice = sc.nextInt();
        try
        {
            switch(choice)
            {
                case 1:
                        File sourceFile = new File(sourceFileName);
                        if(!sourceFile.exists())
                        {
                            System.out.println("Source file does not exist.");
                            return;
                        }
                        Scanner fileScanner = new Scanner(sourceFile);
                        FileWriter fw = new FileWriter(destFileName);
                        while(fileScanner.hasNextLine())
                        {
                            String line = fileScanner.nextLine();
                            fw.write(line + "\n");
                        }
                        fileScanner.close();
                        fw.close();
                        System.out.println("Content copied successfully from " + sourceFileName + " to " + destFileName);
                        break;
                case 2:
                        File destFile = new File(destFileName);
                        if(!destFile.exists())
                        {
                            System.out.println("Destination file does not exist.");
                            return;
                        }
                        Scanner destScanner = new Scanner(destFile);
                        System.out.println("Content of " + destFileName + ":");
                        while(destScanner.hasNextLine())
                        {
                            String line = destScanner.nextLine();
                            System.out.println(line);
                        }
                        destScanner.close();
                        break;
                default:
                        System.out.println("Invalid choice.");  
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}