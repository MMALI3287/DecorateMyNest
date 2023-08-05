package DecorateMyNest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    private static final String uname = "sa";
    private static final String pword = "123456";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=DecorateMyNest;selectMethod=cursor;encrypt=true;trustServerCertificate=true";

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

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Admins (firstname, lastname, email, phone, password) VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, password);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clientInsert(String firstname, String lastname, String email, String phone, String address) {
        try {

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Clients (firstname, lastname, email, phone, address) VALUES (?, ?, ?, ?, ?)");

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, address);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CatalogueInsert(String projectName, String description, float estimatedCost, String imageURL) {
        try {

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Catalogue (ProjectName, Description, EstimatedCost, imageURL) VALUES (?, ?, ?, ?)");

            preparedStatement.setString(1, projectName);
            preparedStatement.setString(2, description);
            preparedStatement.setDouble(3, estimatedCost);
            preparedStatement.setString(4, imageURL);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EmployeeInsert(String firstname, String lastname, String email, String phone, String position, int adminID) {
        try {

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO EmployeeRoster (firstname, lastname, email, phone, position, adminID) VALUES (?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, position);
            preparedStatement.setInt(6, adminID);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void appointmentsInsert(int clientID, int employeeID, Date appointmentDate, Time appointmentTime) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Appointments (ClientID, EmployeeID, AppointmentDate, AppointmentTime) VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1, clientID);
            preparedStatement.setInt(2, employeeID);
            preparedStatement.setDate(3, appointmentDate);
            preparedStatement.setTime(4, appointmentTime);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void financialTransInsert(int adminID, Date transactionDate, double amount, String description) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO FinancialTransactions (AdminID, TransactionDate, Amount, Description) VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1, adminID);
            preparedStatement.setDate(2, transactionDate);
            preparedStatement.setDouble(3, amount);
            preparedStatement.setString(4, description);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inProgressionInsert(int adminID, int reservationID, Date startDate, Date endDate) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO InProgression ( AdminID, ReservationID, StartDate, EndDate) VALUES ( ?, ?, ?, ?)");

            preparedStatement.setInt(1, adminID);
            preparedStatement.setInt(2, reservationID);
            preparedStatement.setDate(3, startDate);
            preparedStatement.setDate(4, endDate);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void installmentTransactionInsert(int transactionID, int installmentNum, int projectID, int installmentDue) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO InstallmentTransaction (TransactionID, InstallmentNum, ProjectID, InstallmentDue) VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1, transactionID);
            preparedStatement.setInt(2, installmentNum);
            preparedStatement.setInt(3, projectID);
            preparedStatement.setInt(4, installmentDue);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void materialTransactionInsert(int transactionID, int materialID, int quantity, int vendorID) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO MaterialTransaction (TransactionID, MaterialID, Quantity, VendorID) VALUES (?, ?, ?, ?)");

            preparedStatement.setInt(1, transactionID);
            preparedStatement.setInt(2, materialID);
            preparedStatement.setInt(3, quantity);
            preparedStatement.setInt(4, vendorID);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reservationTransactionInsert(int transactionID, int reservationID) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO ReservationTransaction (TransactionID, ReservationID) VALUES (?, ?)");

            preparedStatement.setInt(1, transactionID);
            preparedStatement.setInt(2, reservationID);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salaryTransactionInsert(int transactionID, int employeeID) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO SalaryTransaction (TransactionID, EmployeeID) VALUES (?, ?)");

            preparedStatement.setInt(1, transactionID);
            preparedStatement.setInt(2, employeeID);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void materialInventoryInsert(String materialName, int bulkAmount) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO MaterialInventory (MaterialName, BulkAmount) VALUES (?, ?)");

            preparedStatement.setString(1, materialName);
            preparedStatement.setInt(2, bulkAmount);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void projectArchiveInsert(int projectID, Date completionDate, String review) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO ProjectArchive (ProjectID, CompletionDate, Review) VALUES (?, ?, ?)");

            preparedStatement.setInt(1, projectID);
            preparedStatement.setDate(2, completionDate);
            preparedStatement.setString(3, review);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reservationInsert(int clientID, int catalogueID, Date reservationDate) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Reservations (ClientID, CatalogueID, ReservationDate) VALUES (?, ?, ?)");

            preparedStatement.setInt(1, clientID);
            preparedStatement.setInt(2, catalogueID);
            preparedStatement.setDate(3, reservationDate);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void vendorsInsert(String vendorName, String contactPerson, String phone, String email) {
        try {
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO Vendors (VendorName, ContactPerson, Phone, Email) VALUES (?, ?, ?, ?)");

            preparedStatement.setString(1, vendorName);
            preparedStatement.setString(2, contactPerson);
            preparedStatement.setString(3, phone);
            preparedStatement.setString(4, email);

            rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean adminLogin(String user, String pass) {
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM Admins WHERE email=? AND password=?");

            preparedStatement.setString(1, user);
            preparedStatement.setString(2, pass);

            resultSet = preparedStatement.executeQuery();
            Y = resultSet.next();

        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Y;
    }

    public int getHighestTransactionID() throws SQLException {
        int highestTransactionID = 0;
        try {
            String query = "SELECT MAX(TransactionID) AS HighestTransactionID FROM FinancialTransactions;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                highestTransactionID = resultSet.getInt("HighestTransactionID");
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return highestTransactionID;
    }

}
