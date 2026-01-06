import java.util.Scanner;

class ReadArray
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}