import java.util.*;

class CheckPrime
{
    public static void main(String args[])
    {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n=sc.nextInt();
        for(int i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }
    }
}