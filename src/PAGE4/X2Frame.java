/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LenovoID
 */
public class X2Frame extends JFrame implements ActionListener {

    X2Panel x2panel;
    JButton backbtn;

    public X2Frame() {

        backbtn = new JButton("BACK");
        backbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        backbtn.setBounds(230, 500, 200, 40);
        backbtn.addActionListener(this);

        x2panel = new X2Panel();

        this.setTitle("NEGARA DENGAN PENDUDUK TERBANYAK DI DUNIA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(x2panel);
        this.add(backbtn);
        this.setSize(700, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backbtn) {
            new PAGE2.OptionsFrame().setVisible(true);
            this.dispose();
        }
    }

}
