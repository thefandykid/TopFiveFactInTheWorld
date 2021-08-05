/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE8;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LenovoID
 */
public class X6Frame extends JFrame implements ActionListener {

    X6Panel x6panel;
    JButton backbtn;

    public X6Frame() {

        backbtn = new JButton("BACK");
        backbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        backbtn.setBounds(180, 500, 200, 40);
        backbtn.addActionListener(this);

        x6panel = new X6Panel();

        this.setTitle("NEGARA DENGAN PULAU TERBANYAK DI DUNIA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(x6panel);
        this.add(backbtn);
        this.setSize(600, 600);
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
