import java.sql.*;
import java.util.Scanner;

public class CRUD 
{
    // Define scanner at class level so all methods can use it
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String username = "root";
        String password = "Act#2005"; // Use your actual password

        try (Connection con = DriverManager.getConnection(url, username, password)) 
        {
            boolean exit = false;

            while (!exit) 
            {
                System.out.print("\n--- CRUD Operations ---\n1. Add students\n2. View students\n3. Update students\n4. Delete students\n5. Exit\nEnter choice: ");
                int choice = sc.nextInt();

                switch (choice) 
                {
                    case 1:
                        insertValues(con);
                        break;
                    case 2:
                        selectAll(con);
                        break;
                    case 3:
                        updateData(con);
                        break;
                    case 4:
                        deleteRecord(con);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } // Connection auto-closes here due to try-with-resources
        sc.close();
    }

    public static void insertValues(Connection con) throws Exception 
    {
        String query = "INSERT INTO student_table (id, name, marks) VALUES (?, ?, ?)";
        try (PreparedStatement myStmt = con.prepareStatement(query)) 
        {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            myStmt.setInt(1, id);
            myStmt.setString(2, name);
            myStmt.setInt(3, marks);

            int res = myStmt.executeUpdate();

            if (res > 0) System.out.println("Record inserted.");
            else System.out.println("ID not found.");
        }
    }

    public static void selectAll(Connection con) throws Exception 
    {
        String query = "SELECT * FROM student_table";
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) 
        {
            
            System.out.println("\n--- Student List ---");
            while (resultSet.next()) 
            {
                System.out.println("ID: " + resultSet.getInt("id") + 
                                   " | Name: " + resultSet.getString("name").trim() + 
                                   " | Marks: " + resultSet.getInt("marks"));
            }
        }
    }

    public static void updateData(Connection con) throws Exception 
    {
        String query = "UPDATE student_table SET marks = ? WHERE id = ?";
        try (PreparedStatement myStmt = con.prepareStatement(query)) 
        {
            myStmt.setInt(1, 85);
            myStmt.setInt(2, 103);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter new marks: ");
            int marks = sc.nextInt();
            myStmt.setInt(1, marks);
            myStmt.setInt(2, id);

            int res = myStmt.executeUpdate();

            if (res > 0) System.out.println("Record updated.");
            else System.out.println("ID not found.");
        }
    }

    public static void deleteRecord(Connection con) throws Exception 
    {
        String query = "DELETE FROM student_table WHERE id = ?";
        try (PreparedStatement myStmt = con.prepareStatement(query)) 
        {
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();
            
            myStmt.setInt(1, id);
            int res = myStmt.executeUpdate(); // No need for batching for a single manual delete

            if (res > 0) System.out.println("Record deleted.");
            else System.out.println("ID not found.");
        }
    }
}

