package DecorateMyNest;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    private static final String uname = "sa";
    private static final String pword = "123456";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=DecorateMyNest;selectMethod=cursor;encrypt=true;trustServerCertificate=true";

    String s = "";
    int q;
    int i;
    int id;
    boolean Y;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    int rowsAffected;

    public JDBC() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, uname, pword);
            System.out.println("Connected to the database");

        } catch (Exception e) {
            System.out.println("Not Connected");
        }

    }

    public void adminRegister(String firstname, String lastname, String email, String phone, String password) {
        try {
            int lastAdminId;
            String query = "SELECT MAX(AdminID) AS HighestAdminID FROM Admins";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if there is a result (not null) and retrieve the highest AdminID
            if (resultSet.next()) {
                lastAdminId = resultSet.getInt("HighestAdminID");
            } else {
                // If there are no records in the Admins table, set lastAdminId to 0 or any
                // default value
                lastAdminId = 0;
            }

            lastAdminId++;

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Admins (AdminID, firstname, lastname, email, phone, password) VALUES (" + lastAdminId
                            + ",'" + firstname + "','" + lastname + "','" + email + "','" + phone + "','" + password
                            + "')");
            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean adminLogin(String user, String pass) {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM Admins WHERE email='"
                    + user
                    + "' AND password='"
                    + pass
                    + "';");
            resultSet = preparedStatement.executeQuery();
            Y = resultSet.next();

        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Y;
    }

    public void appointments(int CID, int EID, Date appDate, Time appTime) {
        try {
            int lastAppointmentId;
            String query = "SELECT MAX(AppointmentID) AS HighestAdminID FROM Appointments";
            preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if there is a result (not null) and retrieve the highest AdminID
            if (resultSet.next()) {
                lastAppointmentId = resultSet.getInt("HighestAdminID");
            } else {
                // If there are no records in the Admins table, set lastAdminId to 0 or any
                // default value
                lastAppointmentId = 0;
            }

            lastAppointmentId++;

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Appointments (AppointmentID, ClientID, EmployeeID, AppointmentDate, AppointmentTime) VALUES ("
                            + lastAppointmentId + ",'" + CID + "','" + EID + "','" + appDate + "','" + appTime + "')");
            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
