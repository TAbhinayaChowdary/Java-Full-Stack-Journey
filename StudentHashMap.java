import java.util.HashMap;

class StudentHashMap {
    public static void main(String args[])
    {
        HashMap<Integer, String> student = new HashMap<Integer, String>();
        student.put(1, "John");
        student.put(2, "Alice");    
        student.put(3, "Bob");
        for(Integer key: student.keySet())
        {
            System.out.println("Student ID: " + key + "\nStudent Name: " + student.get(key) + "\n");
        }
    }
}