import java.util.Scanner;
class DiagonalEle
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix are: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}