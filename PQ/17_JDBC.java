import java.sql.*;
import java.util.*;

public class StudentDatabase {
    static final String DB_URL = "jdbc:mysql://localhost/STUDENT";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database successfully");

            System.out.println("Enter the number of students:");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the rollno, name, and CGPA of student " + i + ":");
                int rollno = scanner.nextInt();
                String name = scanner.next();
                double cgpa = scanner.nextDouble();

                stmt = conn.createStatement();
                String sql = "INSERT INTO STUDENTS VALUES (" + rollno + ", '" + name + "', " + cgpa + ")";
                int rowsInserted = stmt.executeUpdate(sql);

                if (rowsInserted > 0) {
                    System.out.println("Data inserted successfully!");
                }
            }

            System.out.println("List of students having CGPA greater
