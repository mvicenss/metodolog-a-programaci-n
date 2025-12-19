import java.sql.*;
import java.time.LocalDate;

public class JDBCPractice {

    //1. Define URL
    private static final String url = "jdbc:sqlite:CompanyEmployees.db";

    //table name
    private static final String table = "employees_of_MarinaVicens";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement insertStmt = null;
        PreparedStatement updateStmt = null;
        ResultSet rs = null;

        //Loading driver
        try{
            Class.forName("org.sqlite.JDBC"); //Loading driver

            //Create table and connect to DB
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Established.");

            //Create table -- Defining columns as stated in the deliverable details
            stmt = conn.createStatement();

            stmt.execute("DROP TABLE IF EXISTS "  + table); //DEV PURPOSES -- Cleaning previous table

            String sqlCreate = "CREATE TABLE IF NOT EXISTS " + table + " (" +
                                "Id INTEGER PRIMARY KEY," +
                                "name VARCHAR(50)," +
                                "telephone VARCHAR(20)," +
                                "salary DOUBLE," +
                                "closeContract DATE)";
            stmt.execute(sqlCreate); //Execute creating
            System.out.println("Table created.");

            //Inserting 3 employees using PreparedStatement
            String sqlInsert = "INSERT INTO " + table + " (Id, name, telephone, salary, closeContract) VALUES (?, ?, ?, ?, ?)";
            insertStmt = conn.prepareStatement(sqlInsert);

            System.out.println("--- Inserts ---");

            //Insert data
            insertEmployee(insertStmt, 1, "Alice Smith" , "555-0101", 3000.50, LocalDate.of(2023,1,15));
            insertEmployee(insertStmt, 2, "Bob Jones", "555-0102", 4500.00, LocalDate.of(2022, 5,20));
            insertEmployee(insertStmt, 3,"Charlie Brown", "555-0103", 2800.75, LocalDate.of(2024, 11, 1));

            System.out.println("All inserts were successful.");

            //Update salary via PreparedStatement
            String updateSql = "UPDATE " + table + " SET salary = ? WHERE name = ?";
            updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setDouble(1, 5500.00);
            updateStmt.setString(2, "Alice Smith");
            int rowsAffected = updateStmt.executeUpdate();
            System.out.println("Update performed. Rows affected: " +  rowsAffected);

            //Consult and show employees
            System.out.println("\n---SELECT Results ---");

            String selectSql = "SELECT Id, name, salary FROM " + table;
            rs = stmt.executeQuery(selectSql);

            while(rs.next()){
                int id = rs.getInt("Id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println("Id: " + id + " | Name: " + name + " | Salary: " + salary);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
            if(rs != null) rs.close();
            if(insertStmt != null) insertStmt.close();
            if(updateStmt != null) updateStmt.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
            }catch(SQLException e){
            e.printStackTrace();}
        }
    }

    private static void insertEmployee(PreparedStatement stmt, int id, String name, String phone, double salary, LocalDate date) throws SQLException{
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, phone);
        stmt.setDouble(4, salary);
        stmt.setDate(5, java.sql.Date.valueOf(date));
        stmt.executeUpdate();

        System.out.println("Inserted employee: ID=" + id + ", Name=" + name);
    }
}
