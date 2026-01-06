import java.util.*;
class Student
{
    int id;
    String name;
    String department;
    double grades;
    public void addStudent(int id, String name, String department, double grades)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.grades = grades;
    }
    public void displayStudents()
    {
        System.out.println("Student ID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nGrades: " + grades);
    }
    public void updateGrades(double newGrades)
    {
        this.grades = newGrades;
    }
}
class StudentList
{
    ArrayList<Student> students;
    StudentList()
    {
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void displayAllStudents()
    {
        for(Student student : students)
        {
            student.displayStudents();
            System.out.println();
        }
    }
    public void searchStudentById(int id)
    {
        for(Student student : students)
        {
            if(student.id == id)
            {
                student.displayStudents();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
        
    }
    public void Topper()
    {
        if(students.size() == 0)
        {
            System.out.println("No students available.");
            return;
        }
        Student topper = students.get(0);
        for(Student student : students)
        {
            if(student.grades > topper.grades)
            {
                topper = student;
            }
        }
        topper.displayStudents();
    }
}
class GraduateStudent extends Student
{
    String thesisTitle;
    public void addGraduateStudent(int id, String name, String department, double grades, String thesisTitle)
    {
        addStudent(id, name, department, grades);
        this.thesisTitle = thesisTitle;
    }
    @Override
    public void displayStudents()
    {
        super.displayStudents();
        System.out.println("Thesis Title: " + thesisTitle);
    }

}

class StudentManagement
{
    public static void main(String args[])
    {
        StudentList studentList = new StudentList();
        GraduateStudent gradStudent = new GraduateStudent();
        gradStudent.addGraduateStudent(1, "Alice", "Computer Science", 89.5, "AI in Modern Applications");
        studentList.addStudent(gradStudent);
        Student student1 = new Student();
        student1.addStudent(2, "Bob", "Mechanical Engineering", 78.0);
        studentList.addStudent(student1);
        Student student2 = new Student();
        student2.addStudent(3, "Charlie", "Electrical Engineering", 85.0);
        studentList.addStudent(student2);
        System.out.println("Students List:\n--------------");
        studentList.displayAllStudents();
        System.out.println("Searching for Student with ID 2:\n----------------------------------");
        studentList.searchStudentById(2);
        System.out.println("\nTopper Student Details:\n----------------------");
        studentList.Topper();
    }
}

