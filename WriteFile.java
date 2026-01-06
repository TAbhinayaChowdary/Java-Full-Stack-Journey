import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class WriteFile
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file to write to: ");
        String fileName = sc.nextLine();
        try
        {
            FileWriter fw = new FileWriter(fileName);
            System.out.println("Enter the student details (type 'exit' on a new line to finish): ");
            while(true)
            {
                String line = sc.nextLine();
                if(line.equals("exit"))
                {
                    break;
                }
                fw.write(line + "\n");
            }
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}