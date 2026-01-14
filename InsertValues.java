import java.sql.*;

public class InsertValues {
    public static void main(String[] args) throws Exception {

        // Register the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database (update with your actual DB info)
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String username = "root";
        String password = "Act#2005";
        Connection con = DriverManager.getConnection(url, username, password);

        // Insert query with placeholders
        String query = "INSERT INTO student_table (id, name, marks) VALUES (?, ?, ?)";

        // Prepare the statement
        PreparedStatement myStmt = con.prepareStatement(query);

        // Set the parameter values
        myStmt.setInt(1, 104);
        myStmt.setString(2, "Sai");
        myStmt.setInt(3, 68);
        myStmt.addBatch();

        myStmt.setInt(1, 106);
        myStmt.setString(2, "Prakash");
        myStmt.setInt(3, 98);
        myStmt.addBatch();
        // Execute the insert operation
        int[] res = myStmt.executeBatch();

        // Show how many rows were inserted
        System.out.println(res.length + " record(s) inserted");

        // Close resources
        myStmt.close();
        con.close();
    }
}