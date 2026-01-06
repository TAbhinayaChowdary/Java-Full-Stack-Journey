import java.util.ArrayList;

class Student
{
    int id;
    String name;
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}
class StudentArrayList
{
    public static void main(String args[])
    {
        ArrayList<Student> StudentsList = new ArrayList<Student>();
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Alice");
        StudentsList.add(s1);
        StudentsList.add(s2);

        for(Student s: StudentsList)
        {
            System.out.println("Student ID: " + s.id + "\nStudent Name: " + s.name + "\n");
        }
    }
}