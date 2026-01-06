import java.util.*;

class PrimeNumsBw
{
    public static void main(String args[])
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n=sc.nextInt();
        System.out.print("Enter 'm': ");
        m=sc.nextInt();
        System.out.println("Prime numbers in the range of "+ n + " , "+ m +" :");
        for(int j=n; j<=m; j++)
        {   
            int count = 0;
            for(int i=2; i<=j; i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(j);
            }
        }
    }
}