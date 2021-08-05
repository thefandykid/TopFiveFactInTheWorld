/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE1;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author LenovoID
 */
public class MainFrame extends JFrame implements ActionListener{

    TopMenuPanel1 panel1;

    JButton button;

    public MainFrame() {
        panel1 = new TopMenuPanel1();

        button = new JButton("GO");
        button.setFont(new Font("Bahnschrift", Font.BOLD, 20));
        button.setBounds(195, 480, 200, 40);
        button.addActionListener(this);

        this.setTitle("TOP FIVE FACT IN THE WORLD APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.add(button);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            new PAGE2.OptionsFrame().setVisible(true);
            this.dispose();
        }
    }

}
