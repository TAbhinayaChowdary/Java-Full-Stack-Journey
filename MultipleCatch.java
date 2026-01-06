import java.util.*;

class MultipleCatch {
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 5};
        Scanner sc = new Scanner(System.in);

        try 
        {
            // If you comment out this line, it will move to the next potential error
            System.out.println(arr[10]); 

            int a = 10 / 0; 
            
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Error: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array out of bounds: " + e);
        } 
        catch (Exception e) 
        {
            // This catches anything else, like InputMismatchException
            System.out.println("Input wrong data type: " + e);
        } 
        finally 
        {
            System.out.println("Cleanup complete: Finally block executed.");
            sc.close(); // Good practice to close resources
        }
    }
}