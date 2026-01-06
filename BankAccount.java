import java.util.Scanner;

class Bank
{
    int accNo;
    double balance;
    Bank(double balance, int accNo)
    {
        this.balance = balance;
        this.accNo = accNo;
    }   
}
class BankAccount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Bank account1 = new Bank(1500.75, 123456);
        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sc.nextInt();
        if((account1.balance - withdrawAmount)>100)
        {
            System.out.println("Account Number: " + account1.accNo + "\nCurrent Balance: " + (account1.balance - withdrawAmount));
        }
        else
        {
            System.out.println("Insufficient Balance");
        }

    }
        
}