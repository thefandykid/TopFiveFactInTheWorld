/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE5;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author LenovoID
 */
public class X3Panel extends JPanel{
    
    ImageIcon brazil, italia, jerman, argentina, uruguay;
    Image brazil_1, italia_1, jerman_1, argentina_1, uruguay_1;
    
    public X3Panel(){
        
        brazil = new ImageIcon(X3Panel.class.getResource("brazil1.png"));
        brazil_1 = brazil.getImage();
        
        italia = new ImageIcon(X3Panel.class.getResource("italy2.png"));
        italia_1 = italia.getImage();
        
        jerman = new ImageIcon(X3Panel.class.getResource("germany3.png"));
        jerman_1 = jerman.getImage();
        
        argentina = new ImageIcon(X3Panel.class.getResource("argentina4.png"));
        argentina_1 = argentina.getImage();
        
        uruguay = new ImageIcon(X3Panel.class.getResource("uruguay5.png"));
        uruguay_1 = uruguay.getImage();
        
        this.setBounds(0, 0, 600, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA PEMENANG PIALA DUNIA TERBANYAK", 90, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("BRAZIL", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Juara piala dunia sebanyak 5 kali.", 120, 105);
        
        Graphics2D K3Brazil = (Graphics2D) g;
        K3Brazil.drawImage(brazil_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("ITALIA", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Juara piala dunia sebanyak 4 kali.", 120, 200);
        
        Graphics2D K3Italia = (Graphics2D) g;
        K3Italia.drawImage(italia_1, 30, 125, 80, 80, null);
        
        Graphics2D No3 = (Graphics2D) g;
        Font tulisan3 = new Font("Arial", Font.PLAIN, 14);
        No3.setFont(tulisan3);
        No3.drawString("3. ", 10, 295);
        
        Graphics2D No3a = (Graphics2D) g;
        Font tulisan3a = new Font("Arial", Font.BOLD, 18);
        No3a.setFont(tulisan3a);
        No3a.drawString("JERMAN", 120, 270);
        
        Graphics2D No3b = (Graphics2D) g;
        Font tulisan3b = new Font("Arial", Font.PLAIN, 14);
        No3b.setFont(tulisan3b);
        No3b.drawString("Juara piala dunia sebanyak 3 kali.", 120, 295);
        
        Graphics2D K3Jerman = (Graphics2D) g;
        K3Jerman.drawImage(jerman_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("ARGENTINA", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Juara piala dunia sebanyak 2 kali.", 120, 390);
        
        Graphics2D K3Argentina = (Graphics2D) g;
        K3Argentina.drawImage(argentina_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("URUGUAY", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Juara piala dunia sebanyak 2 kali.", 120, 485);
        
        Graphics2D K3Uruguay = (Graphics2D) g;
        K3Uruguay.drawImage(uruguay_1, 30, 410, 80, 80, null);
            
    }
}
