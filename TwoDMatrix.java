import java.util.Scanner;
class TwoDMatrix
{
    public static void main(String args[])
    {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix are: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}