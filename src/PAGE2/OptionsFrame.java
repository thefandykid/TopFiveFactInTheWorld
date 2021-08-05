/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LenovoID
 */
public class OptionsFrame extends JFrame implements ActionListener{
    
    JButton OButton1, OButton2, OButton3, OButton4, OButton5, OButton6, backbtn;
    OptionsPanel1 OPanel1;
    JLabel judul;
    
    public OptionsFrame(){
        OPanel1 = new OptionsPanel1();
        
        judul = new JLabel();
        judul.setText("OPTIONS :");
        judul.setFont(new Font("Arial", Font.BOLD, 18));
        judul.setBounds(250, 10, 100, 20);
        
        backbtn = new JButton("BACK");
        backbtn.setFont(new Font("Bahnschrift", Font.BOLD, 14));
        backbtn.setBounds(420, 10, 150, 20);
        backbtn.addActionListener(this);
        
        OButton1 = new JButton("NEGARA DENGAN WILAYAH TERLUAS DI DUNIA");
        OButton1.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton1.setBounds(120, 40, 450, 70);
        OButton1.addActionListener(this);
        
        OButton2 = new JButton("NEGARA DENGAN PENDUDUK TERBANYAK DI DUNIA");
        OButton2.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton2.setBounds(120, 130, 450, 70);
        OButton2.addActionListener(this);
        
        OButton3 = new JButton("NEGARA PEMENANG PIALA DUNIA TERBANYAK");
        OButton3.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton3.setBounds(120, 220, 450, 70);
        OButton3.addActionListener(this);
        
        OButton4 = new JButton("NEGARA DENGAN WILAYAH TERKECIL DI DUNIA");
        OButton4.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton4.setBounds(120, 310, 450, 70);
        OButton4.addActionListener(this);
        
        OButton5 = new JButton("NEGARA TERTUA DI DUNIA");
        OButton5.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton5.setBounds(120, 400, 450, 70);
        OButton5.addActionListener(this);
        
        OButton6 = new JButton("NEGARA DENGAN PULAU TERBANYAK DI DUNIA");
        OButton6.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        OButton6.setBounds(120, 490, 450, 70);
        OButton6.addActionListener(this);
        
        this.setTitle("OPTIONS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(OPanel1);
        this.add(judul);
        this.add(backbtn);
        this.add(OButton1);
        this.add(OButton2);
        this.add(OButton3);
        this.add(OButton4);
        this.add(OButton5);
        this.add(OButton6);
        
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==OButton1){
            new PAGE3.X1Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==OButton2){
            new PAGE4.X2Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==OButton3){
            new PAGE5.X3Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==OButton4){
            new PAGE6.X4Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==OButton5){
            new PAGE7.X5Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==OButton6){
            new PAGE8.X6Frame().setVisible(true);
            this.dispose();
        }
        if(e.getSource()==backbtn){
            new PAGE1.MainFrame().setVisible(true);
            this.dispose();
        }
    }
    
    
}
