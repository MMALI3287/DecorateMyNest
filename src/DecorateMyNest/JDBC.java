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
                // If there are no records in the Admins table, set lastAdminId to 0 or any default value
                lastAdminId = 0;
            }
            
            lastAdminId++;

            preparedStatement = connection.prepareStatement("INSERT INTO Admins (AdminID, firstname, lastname, email, phone, password) VALUES (" + lastAdminId + ",'" + firstname + "','" + lastname + "','" + email + "','" + phone + "','" + password + "')");
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

    /* public void fetchData() {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM book_cot WHERE username=?;");
            preparedStatement.setString(1, Welcome.user);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Welcome.user = resultSet.getString("username");
                Welcome.cot = resultSet.getString("cot");
                BookCottage.time = resultSet.getTime("time");
                System.out.println(Welcome.user);
                System.out.println(Welcome.cot);
                System.out.println("" + BookCottage.time);
            } else
                System.out.println("Not found");
            preparedStatement = connection.prepareStatement("SELECT * FROM book_venue WHERE username=?;");
            preparedStatement.setString(1, Welcome.user);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Welcome.user = resultSet.getString("username");
                Welcome.res = resultSet.getString("venue");
                BookVenue.time = resultSet.getTime("time");
                System.out.println(Welcome.user);
                System.out.println(Welcome.res);
                System.out.println("" + BookVenue.time);
            } else
                System.out.println("Not found");
            preparedStatement = connection.prepareStatement("SELECT * FROM tour WHERE username=?;");
            preparedStatement.setString(1, Welcome.user);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Welcome.user = resultSet.getString("username");
                Welcome.loc = resultSet.getString("location");
                Welcome.des = resultSet.getString("destination");
                SelectVehicle.car = resultSet.getInt("car");
                SelectVehicle.suv = resultSet.getInt("suv");
                SelectVehicle.bus = resultSet.getInt("bus");
                SelectVehicle.sb = resultSet.getInt("speedBoat");
                SelectVehicle.yt = resultSet.getInt("yatch");
                SelectVehicle.price = resultSet.getInt("price");
                BookCottage.time = resultSet.getTime("time");
                System.out.println(Welcome.user);
                System.out.println(Welcome.loc);
                System.out.println(Welcome.des);
                System.out.println(SelectVehicle.car
                        + " " + SelectVehicle.suv + " " + SelectVehicle.bus + " " + SelectVehicle.sb + " "
                        + SelectVehicle.yt + " " + SelectVehicle.price + " " + BookCottage.time);

            } else
                System.out.println("Not found");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    } */
}
