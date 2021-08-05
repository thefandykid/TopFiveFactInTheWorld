/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE7;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LenovoID
 */
public class X5Frame extends JFrame implements ActionListener {

    X5Panel x5panel;
    JButton backbtn;

    public X5Frame() {

        backbtn = new JButton("BACK");
        backbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        backbtn.setBounds(180, 500, 200, 40);
        backbtn.addActionListener(this);

        x5panel = new X5Panel();

        this.setTitle("NEGARA TERTUA DI DUNIA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(x5panel);
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
