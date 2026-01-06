import java.util.Scanner;
abstract class Bank
{
    abstract double calculateInterest();
}
class SavingsAccount extends Bank
{
    int accNo;
    int duration; // in years
    double principle;   
    double rate;
    SavingsAccount(int accNo, double principle, int duration, double rate)
    {
        this.accNo = accNo;
        this.principle = principle;
        this.duration = duration;
        this.rate = rate;
    }
    Scanner sc = new Scanner(System.in);
    

    double calculateInterest()
    {
        return (principle * rate * duration) / 100;
    }
}

class BankInterest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Principle: ");
        double principle = sc.nextDouble();   
        System.out.print("Enter Duration: ");
        int duration = sc.nextInt(); // in years
        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        SavingsAccount s1 = new SavingsAccount(accNo, principle, duration, rate);
        System.out.println("Account Interest details:\nAccount Number: " + s1.accNo + "\nInterest Earned: " + s1.calculateInterest());

    }
}