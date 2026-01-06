import java.util.*;

class SumOfPrime
{
    public static void main(String args[])
    {
        int n, m, total=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n=sc.nextInt();
        System.out.print("Enter 'm': ");
        m=sc.nextInt();
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
                total+=j;
            }
        }
        System.out.println("Sum of Prime numbers in the range of "+ n + " , "+ m +" : " + total);
    }
}