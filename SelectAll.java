import java.sql.*;
public class SelectAll 
{
    public static void main(String[] args) 
    {
        Connection connection = null;
        try 
        {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/student", "root", "Act#2005"
            );
            // Create statement
            Statement statement = connection.createStatement();
            // Execute query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student_table");
            // Process results
            while (resultSet.next()) 
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name").trim();
                int marks = resultSet.getInt("marks");
                System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
            }
            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}