import java.sql.*;

public class StudentData {

    public static void main(String[] args) {

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a SQL statement
            String sql = "INSERT INTO students (rollno, name, cgpa) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Accept input for n students and store data in the database
            int n = 2; // change this value to accept input for more than 2 students
            for (int i = 0; i < n; i++) {
                // Accept input for rollno, name, and cgpa
                String rollno = "Rollno " + (i + 1);
                String name = "Name " + (i + 1);
                double cgpa = 9.5 + i;

                // Set the values for the SQL statement
                statement.setString(1, rollno);
                statement.setString(2, name);
                statement.setDouble(3, cgpa);

                // Execute the SQL statement
                statement.executeUpdate();
            }

            // Close the statement and connection
            statement.close();
            connection.close();

            System.out.println("Data stored in database successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "username";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE cgpa > 7")) {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

