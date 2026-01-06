import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors
import java.util.Scanner;

public class CreateNewFile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the file to create: ");
    String fileName = sc.nextLine(); // Read user input for file name
    try {
      File myObj = new File(fileName); // Create File object
      if (myObj.createNewFile()) {           // Try to create the file
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); // Print error details
    }
  }
}