/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAGE7;

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
public class X5Panel extends JPanel{
    
    ImageIcon mesir, china, india, ethiopia, greece;
    Image mesir_1, china_1, india_1, ethiopia_1, greece_1;
    
    public X5Panel(){
        
        mesir = new ImageIcon(X5Panel.class.getResource("egypt1.png"));
        mesir_1 = mesir.getImage();
        
        china = new ImageIcon(X5Panel.class.getResource("china2.png"));
        china_1 = china.getImage();
        
        india = new ImageIcon(X5Panel.class.getResource("india3.png"));
        india_1 = india.getImage();
        
        ethiopia = new ImageIcon(X5Panel.class.getResource("ethiopi4.png"));
        ethiopia_1 = ethiopia.getImage();
        
        greece = new ImageIcon(X5Panel.class.getResource("greece5.png"));
        greece_1 = greece.getImage();
        
        this.setBounds(0, 0, 600, 550);
        
    }
   
    public void paintComponent(Graphics g) {
        //paint component dengan default method
        super.paintComponent(g);
        
        Graphics2D Judul = (Graphics2D) g;
        Font judul = new Font("Arial", Font.PLAIN, 18);
        Judul.setFont(judul);
        Judul.drawString("NEGARA TERTUA DI DUNIA", 120, 20);
        
        Graphics2D No1 = (Graphics2D) g;
        Font tulisan1 = new Font("Arial", Font.PLAIN, 14);
        No1.setFont(tulisan1);
        No1.drawString("1. ", 10, 105);
        
        Graphics2D No1a = (Graphics2D) g;
        Font tulisan1a = new Font("Arial", Font.BOLD, 18);
        No1a.setFont(tulisan1a);
        No1a.drawString("MESIR", 120, 80);
        
        Graphics2D No1b = (Graphics2D) g;
        Font tulisan1b = new Font("Arial", Font.PLAIN, 14);
        No1b.setFont(tulisan1b);
        No1b.drawString("Diperkirakan, Mesir sudah ada sejak 6000 tahun SM.", 120, 105);
        
        Graphics2D K5Mesir = (Graphics2D) g;
        K5Mesir.drawImage(mesir_1, 30, 30, 80, 80, null);
        
        Graphics2D No2 = (Graphics2D) g;
        Font tulisan2 = new Font("Arial", Font.PLAIN, 14);
        No2.setFont(tulisan2);
        No2.drawString("2. ", 10, 200);
        
        Graphics2D No2a = (Graphics2D) g;
        Font tulisan2a = new Font("Arial", Font.BOLD, 18);
        No2a.setFont(tulisan2a);
        No2a.drawString("CHINA", 120, 175);
        
        Graphics2D No2b = (Graphics2D) g;
        Font tulisan2b = new Font("Arial", Font.PLAIN, 14);
        No2b.setFont(tulisan2b);
        No2b.drawString("Diperkirakan, China sudah ada sejak 3500 tahun SM.", 120, 200);
        
        Graphics2D K5China = (Graphics2D) g;
        K5China.drawImage(china_1, 30, 125, 80, 80, null);
        
        Graphics2D No3 = (Graphics2D) g;
        Font tulisan3 = new Font("Arial", Font.PLAIN, 14);
        No3.setFont(tulisan3);
        No3.drawString("3. ", 10, 295);
        
        Graphics2D No3a = (Graphics2D) g;
        Font tulisan3a = new Font("Arial", Font.BOLD, 18);
        No3a.setFont(tulisan3a);
        No3a.drawString("INDIA", 120, 270);
        
        Graphics2D No3b = (Graphics2D) g;
        Font tulisan3b = new Font("Arial", Font.PLAIN, 14);
        No3b.setFont(tulisan3b);
        No3b.drawString("Diperkirakan, India sudah ada sejak 1500 tahun SM.", 120, 295);
        
        Graphics2D K5India = (Graphics2D) g;
        K5India.drawImage(india_1, 30, 220, 80, 80, null);
        
        Graphics2D No4 = (Graphics2D) g;
        Font tulisan4 = new Font("Arial", Font.PLAIN, 14);
        No4.setFont(tulisan4);
        No4.drawString("4. ", 10, 390);
        
        Graphics2D No4a = (Graphics2D) g;
        Font tulisan4a = new Font("Arial", Font.BOLD, 18);
        No4a.setFont(tulisan4a);
        No4a.drawString("ETHIOPIA", 120, 365);
        
        Graphics2D No4b = (Graphics2D) g;
        Font tulisan4b = new Font("Arial", Font.PLAIN, 14);
        No4b.setFont(tulisan4b);
        No4b.drawString("Diperkirakan, Ethiopia sudah ada sejak 980 tahun SM.", 120, 390);
        
        Graphics2D K5Ethiopia = (Graphics2D) g;
        K5Ethiopia.drawImage(ethiopia_1, 30, 315, 80, 80, null);
        
        Graphics2D No5 = (Graphics2D) g;
        Font tulisan5 = new Font("Arial", Font.PLAIN, 14);
        No5.setFont(tulisan5);
        No5.drawString("5. ", 10, 485);
        
        Graphics2D No5a = (Graphics2D) g;
        Font tulisan5a = new Font("Arial", Font.BOLD, 18);
        No5a.setFont(tulisan5a);
        No5a.drawString("YUNANI", 120, 460);
        
        Graphics2D No5b = (Graphics2D) g;
        Font tulisan5b = new Font("Arial", Font.PLAIN, 14);
        No5b.setFont(tulisan5b);
        No5b.drawString("Diperkirakan, Yunani sudah ada sejak 508 tahun SM.", 120, 485);
        
        Graphics2D K5Greece = (Graphics2D) g;
        K5Greece.drawImage(greece_1, 30, 410, 80, 80, null);
            
    }
}
