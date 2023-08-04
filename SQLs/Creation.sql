-- Table 01: Catalogue
CREATE TABLE Catalogue (
    CatalogueID INT PRIMARY KEY,
    ProjectName VARCHAR(255) NOT NULL,
    Description VARCHAR(255) NOT NULL,
    EstimatedCost DECIMAL(10,2) NOT NULL,
    ImageURL VARCHAR(255) NOT NULL
);

-- Table 02: Clients
CREATE TABLE Clients (
    ClientID INT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Address VARCHAR(255) NOT NULL
);

-- Table 03: Reservations
CREATE TABLE Reservations (
    ReservationID INT PRIMARY KEY,
    ClientID INT,
    CatalogueID INT,
    ReservationDate DATE NOT NULL,
    FOREIGN KEY (ClientID) REFERENCES Clients(ClientID),
    FOREIGN KEY (CatalogueID) REFERENCES Catalogue(CatalogueID)
);

-- Table 04: InProgression
CREATE TABLE InProgression (
    ProjectID INT PRIMARY KEY,
    ReservationID INT,
    StartDate DATE NOT NULL,
    EndDate DATE,
    FOREIGN KEY (ReservationID) REFERENCES Reservations(ReservationID)
);

-- Table 05: ProjectArchive
CREATE TABLE ProjectArchive (
    ArchiveID INT PRIMARY KEY,
    ProjectID INT,
    CompletionDate DATE NOT NULL,
    Review VARCHAR(255),
    FOREIGN KEY (ProjectID) REFERENCES InProgression(ProjectID)
);

-- Table 06: MaterialInventory
CREATE TABLE MaterialInventory (
    MaterialID INT PRIMARY KEY,
    MaterialName VARCHAR(255) NOT NULL,
    BulkAmount INT NOT NULL
);

-- Table 07: Vendors
CREATE TABLE Vendors (
    VendorID INT PRIMARY KEY,
    VendorName VARCHAR(255) NOT NULL,
    ContactPerson VARCHAR(255) NOT NULL,
    Phone VARCHAR(15) NOT NULL,
    Email VARCHAR(255) NOT NULL
);

-- Table 08: EmployeeRoster
CREATE TABLE EmployeeRoster (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Position VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Phone VARCHAR(15) NOT NULL
);

-- Table 09: Admins
CREATE TABLE Admins (
    AdminID INT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Phone VARCHAR(255) NOT NULL
);

-- Table 10: Appointments
CREATE TABLE Appointments (
    AppointmentID INT PRIMARY KEY,
    ClientID INT,
    EmployeeID INT,
    AppointmentDate DATE NOT NULL,
    AppointmentTime TIME NOT NULL,
    FOREIGN KEY (ClientID) REFERENCES Clients(ClientID),
    FOREIGN KEY (EmployeeID) REFERENCES EmployeeRoster(EmployeeID)
);

-- Table 11: FinancialTransactions
CREATE TABLE FinancialTransactions (
    TransactionID INT PRIMARY KEY,
    TransactionDate DATE NOT NULL,
    Amount DECIMAL(10,2) NOT NULL,
    Description VARCHAR(255) NOT NULL
);

-- Table 12: MaterialTransaction
CREATE TABLE MaterialTransaction (
    TransactionID INT PRIMARY KEY,
    MaterialID INT,
    Quantity INT NOT NULL,
    VendorID INT,
    FOREIGN KEY (TransactionID) REFERENCES FinancialTransactions(TransactionID),
    FOREIGN KEY (MaterialID) REFERENCES MaterialInventory(MaterialID),
    FOREIGN KEY (VendorID) REFERENCES Vendors(VendorID)
);

-- Table 13: ReservationTransaction
CREATE TABLE ReservationTransaction (
    TransactionID INT PRIMARY KEY,
    ReservationID INT,
    FOREIGN KEY (TransactionID) REFERENCES FinancialTransactions(TransactionID),
    FOREIGN KEY (ReservationID) REFERENCES Reservations(ReservationID)
);

-- Table 14: SalaryTransaction
CREATE TABLE SalaryTransaction (
    TransactionID INT PRIMARY KEY,
    EmployeeID INT,
    FOREIGN KEY (TransactionID) REFERENCES FinancialTransactions(TransactionID),
    FOREIGN KEY (EmployeeID) REFERENCES EmployeeRoster(EmployeeID)
);

-- Table 15: InstallmentTransaction
CREATE TABLE InstallmentTransaction (
    TransactionID INT PRIMARY KEY,
    InstallmentNum INT NOT NULL,
    ProjectID INT,
    InstallmentDue INT NOT NULL,
    FOREIGN KEY (TransactionID) REFERENCES FinancialTransactions(TransactionID),
    FOREIGN KEY (ProjectID) REFERENCES InProgression(ProjectID)
);

-- Step 1: Add Indexes where needed

-- Add Index on ReservationDate column in Reservations table for faster date-based queries
CREATE INDEX idx_Reservations_ReservationDate ON Reservations (ReservationDate);

-- Add Index on ProjectID column in InProgression table for faster project-based queries
CREATE INDEX idx_InProgression_ProjectID ON InProgression (ProjectID);

-- Add Index on MaterialName column in MaterialInventory table for faster material name-based queries
CREATE INDEX idx_MaterialInventory_MaterialName ON MaterialInventory (MaterialName);

-- Drop the ProjectID column from the ProjectArchive table
ALTER TABLE ProjectArchive DROP COLUMN ProjectID;

-- Step 3: Constraints

-- Add UNIQUE constraint on Email column in Clients table to ensure uniqueness of email addresses
ALTER TABLE Clients ADD CONSTRAINT uc_Clients_Email UNIQUE (Email);

-- Add UNIQUE constraint on Email column in Admins table to ensure uniqueness of email addresses
ALTER TABLE Admins ADD CONSTRAINT uc_Admins_Email UNIQUE (Email);

-- Step 4: Data Normalization

-- Create a new table for Employee Positions
CREATE TABLE EmployeePositions (
    PositionID INT PRIMARY KEY,
    PositionName VARCHAR(255) NOT NULL
);

-- Add foreign key reference from EmployeeRoster table to EmployeePositions table
ALTER TABLE EmployeeRoster ADD PositionID INT NOT NULL;
ALTER TABLE EmployeeRoster ADD CONSTRAINT fk_EmployeeRoster_EmployeePositions FOREIGN KEY (PositionID) REFERENCES EmployeePositions (PositionID);

-- Step 5: Change Data Types

-- Change the Phone column in Clients, Admins, and Vendors tables to VARCHAR(15) for standardized storage of phone numbers
ALTER TABLE Clients ALTER COLUMN Phone VARCHAR(15);
ALTER TABLE Admins ALTER COLUMN Phone VARCHAR(15);
ALTER TABLE Vendors ALTER COLUMN Phone VARCHAR(15);

-- Table 08: EmployeeRoster
ALTER TABLE EmployeeRoster
ADD AdminID INT,
FOREIGN KEY (AdminID) REFERENCES Admins(AdminID);

-- Table 04: InProgression
ALTER TABLE InProgression
ADD AdminID INT,
FOREIGN KEY (AdminID) REFERENCES Admins(AdminID);

-- Table 11: FinancialTransactions
ALTER TABLE FinancialTransactions
ADD AdminID INT,
FOREIGN KEY (AdminID) REFERENCES Admins(AdminID);

BACKUP DATABASE [DecorateMyNest] TO DISK = N'D:\zZz\Personal\University\3.1\Projects\DecorateMyNest\YourDatabaseName_backup.bak' WITH NOFORMAT, NOINIT, NAME = N'YourDatabaseName-Full Database Backup', SKIP, NOREWIND, NOUNLOAD, STATS = 10;


