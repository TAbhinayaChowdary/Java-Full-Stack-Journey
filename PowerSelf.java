import java.util.Scanner;

class PowerSelf
{
    public void powerAlg(int base, int exp)
    {
        int res=1;
        for(int i=0;i<exp;i++)
        {
            res*=base;
        }
        System.out.println(res);
    }

    public static void main(String[] args)
    {
        int exp, base;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'base': ");
        base = sc.nextInt();
        System.out.print("Enter 'power': ");
        exp = sc.nextInt();
        PowerSelf obj = new PowerSelf();
        obj.powerAlg(base, exp);
    }
}