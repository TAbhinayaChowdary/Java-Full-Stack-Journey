class Person
{
    String name;
    int age;

}
class Student extends Person
{
    int id;
    String course;
    double percent;
}
class StudentInheritance
{
    public static void main(Srting arg[])
    {
        Student stu1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        stu1.name =  sc.nextLine();
        System.out.print("Enter Student Age: ");
        stu1.age = sc.nextInt();
        System.out.print("Enter Student ID: ");
        stu1.id = sc.nextInt();
        System.out.print("Enter Student Course: ");
        stu1.course = sc.next();
        System.out.print("Enter Student Percentage: ");
        stu1.percent = sc.nextDouble();
        System.out.println("\nStudent Details: \nName: " + stu1.name + "\nAge: " + stu1.age + "\nID: " + stu1.id + "\nCourse: " + stu1.course + "\nPercentage: " + stu1.percent);
    }
}