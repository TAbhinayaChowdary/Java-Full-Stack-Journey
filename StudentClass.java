import java.util.Scanner;

class Student
{
    int id;
    String name;
    double marks;
}

class StudentClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students data: ");
        int n = sc.nextInt();
        Student obj = new Student();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter student "+i+" details: ");
            System.out.print("ID: ");
            obj.id = sc.nextInt();
            System.out.print("Name: ");
            obj.name = sc.next();
            System.out.print("Percentage: ");
            obj.marks = sc.nextDouble();                 
        }

    }
}