class Student
{
    private int id;
    private String name;
    private double Marks;

    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMarks(double Marks)
    {
        this.Marks = Marks;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void getMarks()
    {
        if(Marks>0 && Marks<100)
        {
            System.out.println(Marks);
        }
        else
        {
            System.out.println("Invalid Marks");
        }
    }
    
}
class Encapsulation
{
    public static void main(String args[])
    {
        Student stu1 = new Student();
        stu1.setId(101);
        stu1.setName("Alice");  
        stu1.setMarks(8.98);
        System.out.println("Student Details: \nID: " + stu1.getId() + "\nname: " + stu1.getName());
        System.out.print("Marks: ");
        stu1.getMarks();
    }
}