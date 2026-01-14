import java.sql.*;

public class UpdateData {
    public static void main(String[] args) throws Exception {

        // Register the JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database (update with your actual DB info)
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String username = "root";
        String password = "Act#2005";
        Connection con = DriverManager.getConnection(url, username, password);

        // Insert query with placeholders
        String query = "UPDATE student_table SET marks = ? where id=?";

        // Prepare the statement
        PreparedStatement myStmt = con.prepareStatement(query);

        // Set the parameter values
        myStmt.setInt(1, 85);
        myStmt.setInt(2, 103);
        myStmt.addBatch();

        myStmt.setInt(1, 79);
        myStmt.setInt(2, 105);
        myStmt.addBatch();
        // Execute the insert operation
        int[] res = myStmt.executeBatch();

        // Show how many rows were updated
        System.out.println(res.length + " record(s) updated");

        // Close resources
        myStmt.close();
        con.close();
    }
}