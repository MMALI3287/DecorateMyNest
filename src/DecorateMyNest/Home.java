/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecorateMyNest;

import java.awt.BorderLayout;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


/**
 *
 * @author Musaddique Ali
 */
public class Home extends JFrame {

    JPanel jp;
    LandingPage landingPage;

    JPanel currentPanel;

    public Home() {
        jp = new JPanel();
        jp.setLayout(new BorderLayout());
        landingPage = new LandingPage();
        currentPanel = landingPage;
        jp.add(landingPage, BorderLayout.CENTER);

        Font menuFont = new Font("Arial", Font.BOLD, 16); 

        JMenuBar MainMenu = new JMenuBar();
        
        
        JMenu AdminMenu = new JMenu("Admins");
        AdminMenu.setFont(menuFont);
        JMenuItem AdminView = new JMenuItem("View");
        AdminView.setFont(menuFont);
        AdminView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new AdminViewPanel());
            }
        });

        JMenu ClientMenu = new javax.swing.JMenu("Clients");
        ClientMenu.setFont(menuFont);
        JMenuItem ClientView = new javax.swing.JMenuItem("View");
        ClientMenu.setFont(menuFont);
        JMenuItem ClientEntry = new javax.swing.JMenuItem("Entry");
        ClientMenu.setFont(menuFont);
        ClientMenu.add(ClientEntry);
        ClientMenu.add(ClientView);
        ClientEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ClientEditPanel());
            }
        });
        ClientView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ClientViewPanel());
            }
        });

        JMenu AppointmentsMenu = new javax.swing.JMenu("Appointments");
        AppointmentsMenu.setFont(menuFont);
        JMenuItem AppointmentsView = new javax.swing.JMenuItem("View");
        AppointmentsMenu.setFont(menuFont);
        JMenuItem AppointmentsEntry = new javax.swing.JMenuItem("Entry");
        AppointmentsMenu.setFont(menuFont);
        AppointmentsMenu.add(AppointmentsEntry);
        AppointmentsMenu.add(AppointmentsView);
        AppointmentsEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new AppointmentsEditPanel());
            }
        });
        AppointmentsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new AppointmentsViewPanel());
            }
        });

        JMenu CatalogueMenu = new javax.swing.JMenu("Catalogue");
        CatalogueMenu.setFont(menuFont);
        JMenuItem CatalogueView = new javax.swing.JMenuItem("View");
        CatalogueMenu.setFont(menuFont);
        JMenuItem CatalogueEntry = new javax.swing.JMenuItem("Entry");
        CatalogueMenu.setFont(menuFont);
        CatalogueMenu.add(CatalogueEntry);
        CatalogueMenu.add(CatalogueView);
        CatalogueEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new CatalogueEditPanel());
            }
        });
        CatalogueView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new CatalogueViewPanel());
            }
        });

        JMenu EmployeeRosterMenu = new javax.swing.JMenu("EmployeeRoster");
        EmployeeRosterMenu.setFont(menuFont);
        JMenuItem EmployeeRosterView = new javax.swing.JMenuItem("View");
        EmployeeRosterMenu.setFont(menuFont);
        JMenuItem EmployeeRosterEntry = new javax.swing.JMenuItem("Entry");
        EmployeeRosterMenu.setFont(menuFont);
        EmployeeRosterMenu.add(EmployeeRosterEntry);
        EmployeeRosterMenu.add(EmployeeRosterView);
        EmployeeRosterEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new EmployeeRosterEditPanel());
            }
        });
        EmployeeRosterView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new EmployeeRosterViewPanel());
            }
        });

        JMenu FinancialTransactionMenu = new javax.swing.JMenu("FinancialTransaction");
        FinancialTransactionMenu.setFont(menuFont);
        JMenuItem FinancialTransactionView = new javax.swing.JMenuItem("View");
        FinancialTransactionMenu.setFont(menuFont);
        FinancialTransactionMenu.add(FinancialTransactionView);
        FinancialTransactionView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new FinancialTransactionViewPanel());
            }
        });

        JMenu InprogressionMenu = new javax.swing.JMenu("Inprogression");
        InprogressionMenu.setFont(menuFont);
        JMenuItem InprogressionView = new javax.swing.JMenuItem("View");
        InprogressionMenu.setFont(menuFont);
        JMenuItem InprogressionEntry = new javax.swing.JMenuItem("Entry");
        InprogressionMenu.setFont(menuFont);
        InprogressionMenu.add(InprogressionEntry);
        InprogressionMenu.add(InprogressionView);
        InprogressionEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new InprogressionEditPanel());
            }
        });
        InprogressionView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new InprogressionViewPanel());
            }
        });

        JMenu InstallmentTransMenu = new javax.swing.JMenu("InstallmentTransaction");
        InstallmentTransMenu.setFont(menuFont);
        JMenuItem InstallmentTransView = new javax.swing.JMenuItem("View");
        InstallmentTransMenu.setFont(menuFont);
        JMenuItem InstallmentTransEntry = new javax.swing.JMenuItem("Entry");
        InstallmentTransMenu.setFont(menuFont);
        InstallmentTransMenu.add(InstallmentTransEntry);
        InstallmentTransMenu.add(InstallmentTransView);
        InstallmentTransEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new InstallmentTransEditPanel());
            }
        });
        InstallmentTransView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new InstallmentTransViewPanel());
            }
        });

        JMenu MaterialInventoryMenu = new javax.swing.JMenu("MaterialInventory");
         MaterialInventoryMenu.setFont(menuFont);
        JMenuItem MaterialInventoryView = new javax.swing.JMenuItem("View");
         MaterialInventoryMenu.setFont(menuFont);
        JMenuItem MaterialInventoryEntry = new javax.swing.JMenuItem("Entry");
         MaterialInventoryMenu.setFont(menuFont);
        MaterialInventoryMenu.add(MaterialInventoryEntry);
        MaterialInventoryMenu.add(MaterialInventoryView);
        MaterialInventoryEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new MaterialInventoryEditPanel());
            }
        });
        MaterialInventoryView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new MaterialInventoryViewPanel());
            }
        });

        JMenu MaterialTransMenu = new javax.swing.JMenu("MaterailTrans");
        MaterialTransMenu.setFont(menuFont);
        JMenuItem MaterialTransView = new javax.swing.JMenuItem("View");
        MaterialTransMenu.setFont(menuFont);
        JMenuItem MaterialTransEntry = new javax.swing.JMenuItem("Entry");
        MaterialTransMenu.setFont(menuFont);
        MaterialTransMenu.add(MaterialTransEntry);
        MaterialTransMenu.add(MaterialTransView);
        MaterialTransEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new MaterialTransEditPanel());
            }
        });
        MaterialTransView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new MaterialTransViewPanel());
            }
        });

        JMenu ProjectArchiveMenu = new javax.swing.JMenu("ProjectArchive");
        ProjectArchiveMenu.setFont(menuFont);
        JMenuItem ProjectArchiveView = new javax.swing.JMenuItem("View");
        ProjectArchiveMenu.setFont(menuFont);
        JMenuItem ProjectArchiveEntry = new javax.swing.JMenuItem("Entry");
        ProjectArchiveMenu.setFont(menuFont);
        ProjectArchiveMenu.add(ProjectArchiveEntry);
        ProjectArchiveMenu.add(ProjectArchiveView);
        ProjectArchiveEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ProjectArchiveEditPanel());
            }
        });
        ProjectArchiveView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ProjectArchiveViewPanel());
            }
        });

        JMenu ReservationMenu = new javax.swing.JMenu("Reservation");
        ReservationMenu.setFont(menuFont);
        JMenuItem ReservationView = new javax.swing.JMenuItem("View");
        ReservationMenu.setFont(menuFont);
        JMenuItem ReservationEntry = new javax.swing.JMenuItem("Entry");
        ReservationMenu.setFont(menuFont);
        ReservationMenu.add(ReservationEntry);
        ReservationMenu.add(ReservationView);
        ReservationEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ReservationEditPanel());
            }
        });
        ReservationView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ReservationViewPanel());
            }
        });

        JMenu ReservationTransMenu = new javax.swing.JMenu("ReservationTrans");
        ReservationTransMenu.setFont(menuFont);
        JMenuItem ReservationTransView = new javax.swing.JMenuItem("View");
        ReservationTransMenu.setFont(menuFont);
        JMenuItem ReservationTransEntry = new javax.swing.JMenuItem("Entry");
        ReservationTransMenu.setFont(menuFont);
        ReservationTransMenu.add(ReservationTransEntry);
        ReservationTransMenu.add(ReservationTransView);
        ReservationTransEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ReservationTransEditPanel());
            }
        });
        ReservationTransView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new ReservationTransViewPanel());
            }
        });

        JMenu SalaryTransMenu = new javax.swing.JMenu("SalaryTrans");
        SalaryTransMenu.setFont(menuFont);
        JMenuItem SalaryTransView = new javax.swing.JMenuItem("View");
        SalaryTransMenu.setFont(menuFont);
        JMenuItem SalaryTransEntry = new javax.swing.JMenuItem("Entry");
        SalaryTransMenu.setFont(menuFont);
        SalaryTransMenu.add(SalaryTransEntry);
        SalaryTransMenu.add(SalaryTransView);
        SalaryTransEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new SalaryTransEditPanel());
            }
        });
        SalaryTransView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new SalaryTransViewPanel());
            }
        });

        JMenu VendorsMenu = new javax.swing.JMenu("Vendors");
        VendorsMenu.setFont(menuFont);
        JMenuItem VendorsView = new javax.swing.JMenuItem("View");
        VendorsMenu.setFont(menuFont);
        JMenuItem VendorsEntry = new javax.swing.JMenuItem("Entry");
        VendorsMenu.setFont(menuFont);
        VendorsMenu.add(VendorsEntry);
        VendorsMenu.add(VendorsView);
        VendorsEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new VendorsEditPanel());
            }
        });
        VendorsView.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new VendorsViewPanel());
            }
        });

        MainMenu.add(AdminMenu);
        MainMenu.add(ClientMenu);
        MainMenu.add(AppointmentsMenu);
        MainMenu.add(CatalogueMenu);
        MainMenu.add(EmployeeRosterMenu);
        MainMenu.add(FinancialTransactionMenu);
        MainMenu.add(InprogressionMenu);
        MainMenu.add(InstallmentTransMenu);
        MainMenu.add(MaterialInventoryMenu);
        MainMenu.add(MaterialTransMenu);
        MainMenu.add(ProjectArchiveMenu);
        MainMenu.add(ReservationMenu);
        MainMenu.add(ReservationTransMenu);
        MainMenu.add(SalaryTransMenu);
        MainMenu.add(VendorsMenu);
        
        MainMenu.setFont(menuFont);

        setJMenuBar(MainMenu);

        this.add(jp);
        this.setSize(1922, 1035);
        this.setVisible(true);
    }

    void setpane(JPanel newjp) {
        jp.remove(currentPanel);
        currentPanel = newjp;
        jp.add(newjp, BorderLayout.CENTER);
        jp.validate();
    }

    public static void main(String[] args) {
        new Home();

    }

}
