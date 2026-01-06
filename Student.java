class StudentConstructor
{
    String name;
    int Id;
    double percent;
    StudentConstructor()
    {
        name = "John Doe";
        Id = 0;
        percent = 0.0;
    }
    StudentConstructor(String name, int ID, double percent)
    {
        this.name = name;
        this.Id = Id;
        this.percent  = percent;
    }
}
class Student
{
    public static void main(String args[])
    {
        StudentConstructor obj1 = new StudentConstructor();
        StudentConstructor obj2 = new StudentConstructor("Alice", 101, 89.5);
        System.out.println("Default Student Details: \nName: " + obj1.name + "\nId: " + obj1.Id + "\nPercentage:" + obj1.percent);
        System.out.println("\nStudent Details: \nName: " + obj2.name + "\nId: " + obj2.Id + "\nPercentage:" + obj2.percent);
    }
}