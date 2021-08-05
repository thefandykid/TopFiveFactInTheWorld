/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE1;

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
public class TopMenuPanel1 extends JPanel {
    
    int x_redball = 140;
    int y_redball = 170;
    int x_greenball = 360;
    int y_greenball = 170;
    
    
    TopMenuPanel1(){
        
        this.setBounds(0, 0, 600, 450);  
        
    }
    
     public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font tulisan = new Font("Bahnschrift", Font.BOLD, 30);
        Judul.setFont(tulisan);
        Judul.drawString("TOP 5", 250, 70);
        Judul.drawString("FACT IN THE WORLD", 150, 120);

        Graphics2D LingkarSatu = (Graphics2D) g;
        LingkarSatu.setPaint(Color.RED);
        LingkarSatu.fillOval(x_redball, y_redball, 100, 100);

        Graphics2D LingkarDua = (Graphics2D) g;
        LingkarDua.setPaint(Color.YELLOW);
        LingkarDua.fillOval(250, 170, 100, 100);

        Graphics2D LingkarTiga = (Graphics2D) g;
        LingkarTiga.setPaint(Color.GREEN);
        LingkarTiga.fillOval(x_greenball, y_greenball, 100, 100);
        
        
        try {
            Thread.sleep(200);
            x_redball -= 10;
            x_greenball += 10;

            if (x_redball == 120) {
                x_redball = 140;
            }
            if (x_greenball == 380) {
                x_greenball = 360;
            }
            repaint();
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }
    
}
