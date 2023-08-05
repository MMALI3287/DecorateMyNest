/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecorateMyNest;

import java.awt.BorderLayout;
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

        JMenuBar MainMenu = new javax.swing.JMenuBar();

        JMenu AdminMenu = new javax.swing.JMenu("Admins");
        JMenuItem AdminView = new javax.swing.JMenuItem("View");
        AdminMenu.add(AdminView);
        AdminView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new AdminViewPanel());
            }
        });

        JMenu ClientMenu = new javax.swing.JMenu("Clients");
        JMenuItem ClientView = new javax.swing.JMenuItem("View");
        JMenuItem ClientEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem AppointmentsView = new javax.swing.JMenuItem("View");
        JMenuItem AppointmentsEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem CatalogueView = new javax.swing.JMenuItem("View");
        JMenuItem CatalogueEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem EmployeeRosterView = new javax.swing.JMenuItem("View");
        JMenuItem EmployeeRosterEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem FinancialTransactionView = new javax.swing.JMenuItem("View");
        FinancialTransactionMenu.add(FinancialTransactionView);
        FinancialTransactionView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setpane(new FinancialTransactionViewPanel());
            }
        });

        JMenu InprogressionMenu = new javax.swing.JMenu("Inprogression");
        JMenuItem InprogressionView = new javax.swing.JMenuItem("View");
        JMenuItem InprogressionEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem InstallmentTransView = new javax.swing.JMenuItem("View");
        JMenuItem InstallmentTransEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem MaterialInventoryView = new javax.swing.JMenuItem("View");
        JMenuItem MaterialInventoryEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem MaterialTransView = new javax.swing.JMenuItem("View");
        JMenuItem MaterialTransEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem ProjectArchiveView = new javax.swing.JMenuItem("View");
        JMenuItem ProjectArchiveEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem ReservationView = new javax.swing.JMenuItem("View");
        JMenuItem ReservationEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem ReservationTransView = new javax.swing.JMenuItem("View");
        JMenuItem ReservationTransEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem SalaryTransView = new javax.swing.JMenuItem("View");
        JMenuItem SalaryTransEntry = new javax.swing.JMenuItem("Entry");
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
        JMenuItem VendorsView = new javax.swing.JMenuItem("View");
        JMenuItem VendorsEntry = new javax.swing.JMenuItem("Entry");
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

        setJMenuBar(MainMenu);

        this.add(jp);
        this.setSize(1910, 1000);
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
