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
public class borderpane {

    JPanel jp;
    jpanel3 jp3;

    public borderpane() {
        jp = new JPanel();
        BorderLayout bl = new BorderLayout();
        jp.setLayout(bl);
        jp3 = new jpanel3();
        buttons btns = new buttons(this);
        JFrame jf1 = new JFrame();

        jp.add(btns, BorderLayout.WEST);
        jp.add(jp3, BorderLayout.CENTER);
        jf1.add(jp);
        jf1.setSize(1300, 1000);
        jf1.setVisible(true);
    }

    void setpane(JPanel newjp) {
        jp.remove(jp3);
        jp.add(newjp, BorderLayout.CENTER);
        jp.validate();
    }

    public static void main(String[] args) {
        new borderpane();

    }

}
