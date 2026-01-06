import java.util.Scanner;

class MultiPrint
{
    public void nameRepeat(int n, String name)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args)
    {
        int num;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter the number of times to print: ");
        num = sc.nextInt();
        MultiPrint obj = new MultiPrint();
        obj.nameRepeat(num, name);
    }
}