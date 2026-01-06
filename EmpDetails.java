import java.util.Scanner;
class Employee
{
    int ID;
    String name;
    double grossSalary;
    double percentage;
    double netSalary;
}
class EmpDetails
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of employee salary data: ");
        int n = sc.nextInt();
        Employee obj = new Employee();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter employee "+i+" details: ");
            System.out.print("Employee ID: ");
            obj.ID = sc.nextInt();
            System.out.print("Employee Name: ");
            obj.name = sc.next();
            System.out.print("CTC: ");
            obj.grossSalary = sc.nextDouble();   
            System.out.print("Deduction Percentage: ");
            obj.percentage = sc.nextDouble();
            obj.netSalary = obj.grossSalary - (obj.grossSalary*(obj.percentage/100));
            System.out.println("Net Salary of Employee "+i+" is: "+obj.netSalary+" per year");              
        }
    }
}