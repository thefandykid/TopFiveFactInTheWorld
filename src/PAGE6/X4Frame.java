/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE6;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LenovoID
 */
public class X4Frame extends JFrame implements ActionListener {

    X4Panel x4panel;
    JButton backbtn;

    public X4Frame() {

        backbtn = new JButton("BACK");
        backbtn.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        backbtn.setBounds(180, 500, 200, 40);
        backbtn.addActionListener(this);

        x4panel = new X4Panel();

        this.setTitle("NEGARA DENGAN WILAYAH TERKECIL DI DUNIA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(x4panel);
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
