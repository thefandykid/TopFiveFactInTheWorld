/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author LenovoID
 */
public class OptionsPanel1 extends JPanel {
    
    int x_arrow_1 = 20;
    int y_arrow_1 = 80;
    
    int x_arrow_2 = 20;
    int y_arrow_2 = 170;
    
    int x_arrow_3 = 20;
    int y_arrow_3 = 260;
    
    int x_arrow_4 = 20;
    int y_arrow_4 = 350;
    
    int x_arrow_5 = 20;
    int y_arrow_5 = 440;
    
    int x_arrow_6 = 20;
    int y_arrow_6 = 530;

    OptionsPanel1() {

        this.setBounds(0, 0, 100, 600);

    }

    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);

        Graphics2D Arrow1 = (Graphics2D) g;
        Arrow1.setColor(Color.red);
        Arrow1.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow1.drawString(">>>", x_arrow_1, y_arrow_1);
        
        Graphics2D Arrow2 = (Graphics2D) g;
        Arrow2.setColor(Color.red);
        Arrow2.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow2.drawString(">>>", x_arrow_2, y_arrow_2);
        
        Graphics2D Arrow3 = (Graphics2D) g;
        Arrow3.setColor(Color.red);
        Arrow3.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow3.drawString(">>>", x_arrow_3, y_arrow_3);
        
        Graphics2D Arrow4 = (Graphics2D) g;
        Arrow4.setColor(Color.red);
        Arrow4.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow4.drawString(">>>", x_arrow_4, y_arrow_4);
        
        Graphics2D Arrow5 = (Graphics2D) g;
        Arrow5.setColor(Color.red);
        Arrow5.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow5.drawString(">>>", x_arrow_5, y_arrow_5);
        
        Graphics2D Arrow6 = (Graphics2D) g;
        Arrow6.setColor(Color.red);
        Arrow6.setFont(new Font("Arial", Font.BOLD, 16));
        Arrow6.drawString(">>>", x_arrow_6, y_arrow_6);
        try {
            Thread.sleep(200);
            x_arrow_1 += 10;
            x_arrow_2 += 10;
            x_arrow_3 += 10;
            x_arrow_4 += 10;
            x_arrow_5 += 10;
            x_arrow_6 += 10;

            if (x_arrow_1 == 80) {
                x_arrow_1 = 20;
            }
            if (x_arrow_2 == 80) {
                x_arrow_2 = 20;
            }
            if (x_arrow_3 == 80) {
                x_arrow_3 = 20;
            }
            if (x_arrow_4 == 80) {
                x_arrow_4 = 20;
            }
            if (x_arrow_5 == 80) {
                x_arrow_5 = 20;
            }
            if (x_arrow_6 == 80) {
                x_arrow_6 = 20;
            }
            repaint();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }

}
