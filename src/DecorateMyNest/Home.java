/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecorateMyNest;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Musaddique Ali
 */
public class Home extends JFrame {

    JPanel jp;
    jpanel3 jp3;

    public Home() {
        jp = new JPanel();
        BorderLayout bl = new BorderLayout();
        jp.setLayout(bl);
        jp3 = new jpanel3();

        jp.add(jp3, BorderLayout.CENTER);
        this.add(jp);
        this.setSize(1300, 1000);
        this.setVisible(true);
    }

    void setpane(JPanel newjp) {
        jp.remove(jp3);
        jp.add(newjp, BorderLayout.CENTER);
        jp.validate();
    }

    public static void main(String[] args) {
        new Home();

    }

}
